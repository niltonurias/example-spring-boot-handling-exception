package io.github.niltonurias.examplespringboothandlingexception.infra.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ErrorMessage {
    private String message;
    private List<String> details;

    public ErrorMessage() {
    }

    public ErrorMessage(String message) {
        this.message = message;
    }

    public ErrorMessage(String message, List<String> details) {
        this.message = message;
        this.details = details;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        if (details == null) details = new ArrayList<>();
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }
}
