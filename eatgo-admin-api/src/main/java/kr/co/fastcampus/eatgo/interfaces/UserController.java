package kr.co.fastcampus.eatgo.interfaces;

import kr.co.fastcampus.eatgo.application.UserService;
import kr.co.fastcampus.eatgo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 1. User list
    @GetMapping("/users")
    public List<User> list() {
        return userService.getUsers();
    }
    // 2. User Create -> 회원가입
    // 3. User Update
    // 4. User delete -> level : 0 -> 아무것도 못 함
    // level (1: customer, 2: restaurant owner, 3: admin)
}
