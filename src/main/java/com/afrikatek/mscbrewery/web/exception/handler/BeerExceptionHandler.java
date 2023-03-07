package com.afrikatek.mscbrewery.web.exception.handler;

import com.afrikatek.mscbrewery.web.exception.model.BeerErrorResponse;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * project msc-brewery
 * created by murukai
 * created on 2023/03/06 at 21:06:13
 */
@ControllerAdvice
@Slf4j
public class BeerExceptionHandler {

    @ExceptionHandler(value = {ConstraintViolationException.class})
    public ResponseEntity<BeerErrorResponse> handleValidationErrors(ConstraintViolationException constraintViolationException){
        List<String> violations = new ArrayList<>();
        constraintViolationException.getConstraintViolations().forEach(constraintViolation -> violations.add(constraintViolation.getMessage()));
        log.error(violations.toString());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(BeerErrorResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message("Object not valid")
                .violations(violations)
                .build());
    }
}
