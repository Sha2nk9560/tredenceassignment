package com.aujas.bootwebapp.exceptions;


import com.aujas.bootwebapp.model.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<APIResponse> handleUserNotFoundException(UserNotFoundException ex) {
        return new ResponseEntity<APIResponse>(new APIResponse(ex.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(StudentNotFoundExeption.class)
    public ResponseEntity<APIResponse> handleStudentNotFoundExeption(StudentNotFoundExeption ex)
    {

        return new ResponseEntity<>(new APIResponse(ex.getMessage(),HttpStatus.NOT_FOUND),HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            errorMap.put(error.getField(), error.getDefaultMessage());
        });
                return errorMap;
    }


}
