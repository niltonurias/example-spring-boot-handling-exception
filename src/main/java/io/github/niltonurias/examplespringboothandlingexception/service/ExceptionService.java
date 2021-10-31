package io.github.niltonurias.examplespringboothandlingexception.service;

import io.github.niltonurias.examplespringboothandlingexception.infra.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ExceptionService {
    public void throwException(HttpStatus status) {
        switch (status) {
            case BAD_REQUEST:
                throw new BadRequestException("throwing BadRequest");
            case UNAUTHORIZED:
                throw new UnauthorizedException("throwing Unauthorized");
            case FORBIDDEN:
                throw new ForbiddenException("throwing Forbidden");
            case NOT_FOUND:
                throw new NotFoundException("throwing NotFound");
            case METHOD_NOT_ALLOWED:
                throw new MethodNotAllowedException("throwing MethodNotAllowed");
            case NOT_ACCEPTABLE:
                throw new NotAcceptableException("throwing NotAcceptable");
            case TOO_MANY_REQUESTS:
                throw new TooManyRequestException("throwing TooManyRequest");
            case INTERNAL_SERVER_ERROR:
                throw new InternalServerErrorException("throwing InternalServerError");
            case NOT_IMPLEMENTED:
                throw new NotImplementedException("throwing NotImplemented");
            case BAD_GATEWAY:
                throw new BadGatewayException("throwing BadGateway");
            case SERVICE_UNAVAILABLE:
                throw new ServiceUnavailableException("throwing ServiceUnavailable");
            default:
                break;
        }
    }
}
