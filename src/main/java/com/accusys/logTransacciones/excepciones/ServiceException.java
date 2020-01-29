package com.accusys.logTransacciones.excepciones;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.accusys.logTransacciones.excepciones.MensajeErrores;

public class ServiceException  extends Exception {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceException.class);	
	
	private Integer httpStatus;
	private String mensaje;
	private Integer code;
	private String developerMessage;
	
    public ServiceException(Integer httpStatus, String message, Integer code,String developerMessage) {
    	super();
        this.httpStatus = httpStatus;
        this.mensaje = message;
        this.code = code;
        this.developerMessage=developerMessage;
    }
 
    public ServiceException(Integer httpStatus, String message, Integer code) {
        this.httpStatus = httpStatus;
        this.mensaje = message;
        this.code = code;
    }
 
    public ServiceException(MensajeErrores errorMessage){
        this.httpStatus = errorMessage.getHttpStatus();
        this.mensaje = errorMessage.getMensaje();
        this.code = errorMessage.getCode();
        this.developerMessage=errorMessage.getDeveloperMessage();
    }	
    
    public ServiceException(Exception errorMessage){
        this.httpStatus = 201;
        this.mensaje = errorMessage.getMessage();
        this.code = 201;
        this.developerMessage=errorMessage.getCause().getMessage();
    }	
	
	public Integer getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(Integer httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDeveloperMessage() {
		return developerMessage;
	}
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}	


}
