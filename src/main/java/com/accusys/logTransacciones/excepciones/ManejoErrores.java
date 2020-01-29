package com.accusys.logTransacciones.excepciones;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@ControllerAdvice
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ManejoErrores {
	
	private static final Logger log = LoggerFactory.getLogger(ManejoErrores.class);	
	
    @ExceptionHandler(value=ServiceException.class)
    //@ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<MensajeErrores> handleServiceException(ServiceException ex, HttpServletRequest request) {

    	MensajeErrores errores = new MensajeErrores(ex);
    	
    	/*
    	errores.setCode(125);
    	errores.setHttpStatus(HttpStatus.OK.value());
    	errores.setMensaje(ex.getMessage());
 */
         
    	
    	 StringWriter errorStackTrace = new StringWriter();
         ex.printStackTrace(new PrintWriter(errorStackTrace));
         errores.setDeveloperMessage(ex.toString());
        
             	
    	
        log.debug("Error por el  Seervice Excepcion :"  + ex.getMessage());
        log.debug("Error por el  Seervice Excepcion :"  + request.getRequestURI());
        
        return new ResponseEntity<MensajeErrores>(errores,HttpStatus.ACCEPTED);
    }



    @ExceptionHandler(value=Exception.class)
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<MensajeErrores> handleException(Exception ex) {

    	MensajeErrores error = new MensajeErrores();
    	
    	error.setCode(125);
    	error.setHttpStatus(HttpStatus.OK.value());
    	error.setMensaje(ex.getMessage());
    	
    	 StringWriter errorStackTrace = new StringWriter();
         ex.printStackTrace(new PrintWriter(errorStackTrace));
         error.setDeveloperMessage(ex.toString());
    	
        log.debug("Error gwnreal Exception"  + ex.getMessage());
        
        return new ResponseEntity<MensajeErrores>(error,HttpStatus.OK);
    }
        
	

}
