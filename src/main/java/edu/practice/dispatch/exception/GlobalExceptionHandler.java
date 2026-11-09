package edu.practice.dispatch.exception;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    // TODO Task 3: map invalid inputs to 400 and missing missions to 404, with ErrorResponse.
}
