package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.domain.User;
import kr.co.fastcampus.eatgo.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    public User addUser(String email, String name) {
        User user = User.builder()
                .email(email)
                .name(name)
                .level(1L)
                .build();
        return userRepository.save(user);
    }

    @Transactional
    public User updateUser(Long id, String email, String name, Long level) {

        // TODO: restaurantService 예외 참고
        User user = userRepository.findById(id).orElse(null);

        user.setName(name).setEmail(email).setLevel(level);

        return user;
    }

    @Transactional
    public User deactiveUser(Long id) {
        User user = userRepository.findById(id).orElse(null);

        user.deactivate();

        return user;
    }
}
