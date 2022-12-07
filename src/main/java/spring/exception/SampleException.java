package spring.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author JOHNNGUYEN
 * @Project Algorithm
 * @Created 06/09/2022 - 10:51 PM
 */
@ControllerAdvice
public class SampleException {

    @ExceptionHandler(value
            = {IllegalArgumentException.class, IllegalStateException.class})
    public void doException() {

    }
}
