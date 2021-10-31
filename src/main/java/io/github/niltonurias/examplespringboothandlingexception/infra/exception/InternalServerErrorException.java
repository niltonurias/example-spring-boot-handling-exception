package io.github.niltonurias.examplespringboothandlingexception.infra.exception;

public class InternalServerErrorException extends BasicException {
    public InternalServerErrorException(String message) {
        super(message);
    }
}
