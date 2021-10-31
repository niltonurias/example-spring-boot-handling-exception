package io.github.niltonurias.examplespringboothandlingexception.infra.exception;

public class BadRequestException extends BasicException {

    public BadRequestException(String message) {
        super(message);
    }
}
