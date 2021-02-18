package kr.co.fastcampus.eatgo.interfaces;

import kr.co.fastcampus.eatgo.exception.EmailNotExistedException;
import kr.co.fastcampus.eatgo.exception.PasswordWrongException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SessionErrorAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EmailNotExistedException.class)
    public String handleEmailNotExistedException() {
        return "{}";
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(PasswordWrongException.class)
    public String handlePasswordWrongException() {
        return "{}";
    }
}
