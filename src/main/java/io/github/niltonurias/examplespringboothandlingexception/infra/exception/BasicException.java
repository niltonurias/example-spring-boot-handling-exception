package io.github.niltonurias.examplespringboothandlingexception.infra.exception;

import io.github.niltonurias.examplespringboothandlingexception.infra.model.ErrorMessage;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BasicException extends RuntimeException {
    private ErrorMessage errorMessage;

    public BasicException(String message) {
        super(message);
        this.errorMessage = new ErrorMessage(message);
        this.errorMessage.getDetails().addAll(Arrays.stream(this.getStackTrace()).map(StackTraceElement::toString).collect(Collectors.toList()));
    }

    public BasicException(ErrorMessage message) {
        super(message.getMessage());
        this.errorMessage = message;
    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }
}
