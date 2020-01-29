package com.accusys.logTransacciones.excepciones;


public class MensajeErrores {

	private Integer httpStatus;
	private String mensaje;
	private Integer code;
	private String developerMessage;
	
	public MensajeErrores() {
	
	}
	
	 public MensajeErrores(ServiceException ex) {
	        this.httpStatus = ex.getHttpStatus();
	        this.mensaje = ex.getMensaje();
	        this.code = ex.getCode();
	}
	 
	public MensajeErrores(Integer httpStatus, String message, Integer code) {
	        super();
	        this.httpStatus = httpStatus;
	        this.mensaje = message;
	        this.code = code;
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
