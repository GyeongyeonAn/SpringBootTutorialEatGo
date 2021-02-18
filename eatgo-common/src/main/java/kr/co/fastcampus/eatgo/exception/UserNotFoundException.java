package kr.co.fastcampus.eatgo.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(long id) {
        super("Could not find restaurant " + id);
    }
}
