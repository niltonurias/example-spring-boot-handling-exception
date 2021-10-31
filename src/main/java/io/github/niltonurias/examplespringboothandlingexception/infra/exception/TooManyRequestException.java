package io.github.niltonurias.examplespringboothandlingexception.infra.exception;

public class TooManyRequestException extends BasicException {
    public TooManyRequestException(String message) {
        super(message);
    }
}
