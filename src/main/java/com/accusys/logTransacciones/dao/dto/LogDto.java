package com.accusys.logTransacciones.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class LogDto implements Serializable{
	
	private Date fechaHoraTransaccion;
	private String nombreServidorCts;
	private String moduloCobis;
	private String modoDebug;
	private Integer hiloServidor;
	private String descripcionLibreria;
	private String mensaje;
	private String tipoTransaccion;
	
	public Date getFechaHoraTransaccion() {
		return fechaHoraTransaccion;
	}
	public void setFechaHoraTransaccion(Date fechaHoraTransaccion) {
		this.fechaHoraTransaccion = fechaHoraTransaccion;
	}
	public String getNombreServidorCts() {
		return nombreServidorCts;
	}
	public void setNombreServidorCts(String nombreServidorCts) {
		this.nombreServidorCts = nombreServidorCts;
	}
	public String getModuloCobis() {
		return moduloCobis;
	}
	public void setModuloCobis(String moduloCobis) {
		this.moduloCobis = moduloCobis;
	}
	public String getModoDebug() {
		return modoDebug;
	}
	public void setModoDebug(String modoDebug) {
		this.modoDebug = modoDebug;
	}
	public Integer getHiloServidor() {
		return hiloServidor;
	}
	public void setHiloServidor(Integer hiloServidor) {
		this.hiloServidor = hiloServidor;
	}
	public String getDescripcionLibreria() {
		return descripcionLibreria;
	}
	public void setDescripcionLibreria(String descripcionLibreria) {
		this.descripcionLibreria = descripcionLibreria;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	
	

}
