package io.github.niltonurias.examplespringboothandlingexception.infra;

import io.github.niltonurias.examplespringboothandlingexception.infra.exception.*;
import io.github.niltonurias.examplespringboothandlingexception.infra.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorMessage> handleBadRequest(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<ErrorMessage> handleForbidden(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessage> handleNotFound(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorMessage> handleUnauthorized(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(MethodNotAllowedException.class)
    public ResponseEntity<ErrorMessage> handleMethodNotAllowedException(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(NotAcceptableException.class)
    public ResponseEntity<ErrorMessage> handleNotAcceptableException(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(TooManyRequestException.class)
    public ResponseEntity<ErrorMessage> handleTooManyRequestException(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.TOO_MANY_REQUESTS);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ErrorMessage> handleInternalServerErrorException(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ServiceUnavailableException.class)
    public ResponseEntity<ErrorMessage> handleServiceUnavailableException(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(NotImplementedException.class)
    public ResponseEntity<ErrorMessage> handleNotImplementedException(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.NOT_IMPLEMENTED);
    }

    @ExceptionHandler(BadGatewayException.class)
    public ResponseEntity<ErrorMessage> handleBadGatewayException(BasicException exception) {
        return new ResponseEntity<>(exception.getErrorMessage(), HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessage> handleException(Exception exception) {
        List<String> stackTrace = Stream.of(exception.getStackTrace()).map(StackTraceElement::toString).collect(Collectors.toList());
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), stackTrace);
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
