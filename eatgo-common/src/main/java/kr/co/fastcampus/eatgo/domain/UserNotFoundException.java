package kr.co.fastcampus.eatgo.domain;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(long id) {
        super("Could not find restaurant " + id);
    }
}
