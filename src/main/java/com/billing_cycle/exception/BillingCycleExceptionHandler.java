package com.billing_cycle.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ControllerAdvice
public class BillingCycleExceptionHandler {
    @ExceptionHandler(BillingCycleException.class)
    public ResponseEntity<ErrorDetails> handleBillingCycleException(BillingCycleException ex, WebRequest request) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy HH:mm:ss");
        String timestamp = now.format(formatter);

        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), ex.getStatus().toString(), timestamp);
        return new ResponseEntity<>(errorDetails, ex.getStatus());
    }

}
