package kr.co.fastcampus.eatgo.exception;

public class RestaurantNotFoundException extends RuntimeException {

    public RestaurantNotFoundException(long id) {
        super("Could not find restaurant " + id);
    }
}
