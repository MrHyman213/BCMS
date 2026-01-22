package org.hyman.BCMS.util.exception;

import org.hyman.BCMS.dto.BodyError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EXceptionHandler {

    @ExceptionHandler({ObjectNotFoundException.class})
    public ResponseEntity<BodyError> notFound(ObjectNotFoundException e){
        return new ResponseEntity<>(
                new BodyError(404, e.getMessage()), HttpStatus.NOT_FOUND);
    }
}
