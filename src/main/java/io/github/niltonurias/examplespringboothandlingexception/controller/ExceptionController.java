package io.github.niltonurias.examplespringboothandlingexception.controller;

import io.github.niltonurias.examplespringboothandlingexception.infra.exception.*;
import io.github.niltonurias.examplespringboothandlingexception.infra.model.ErrorMessage;
import io.github.niltonurias.examplespringboothandlingexception.service.ExceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/error")
@CrossOrigin
public class ExceptionController {
    @Autowired
    private ExceptionService service;

    @GetMapping
    public void throwException(@RequestParam("type") HttpStatus status) {
        service.throwException(status);
    }
}
