package io.github.niltonurias.examplespringboothandlingexception.infra.exception;

public class NotFoundException extends BasicException {
    public NotFoundException(String message) {
        super(message);
    }
}
