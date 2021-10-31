package io.github.niltonurias.examplespringboothandlingexception.infra.exception;

public class ServiceUnavailableException extends BasicException {
    public ServiceUnavailableException(String message) {
        super(message);
    }
}
