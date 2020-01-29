package com.accusys.logTransacciones.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.accusys.logTransacciones.dao.ILogDao;
import com.accusys.logTransacciones.dao.dto.LogDto;
import com.accusys.logTransacciones.model.LogTabla;

@Repository
public class LogDaoImpl implements ILogDao {
	
	private static final Logger log = LoggerFactory.getLogger(LogDaoImpl.class);	
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public void insertarLog(LogDto registro) {
		// TODO Auto-generated method stub
		
		LogTabla logTabla = new LogTabla();
		
		logTabla.setDescripcionLibreria(registro.getDescripcionLibreria());
		logTabla.setFechaHoraTransaccion(registro.getFechaHoraTransaccion());
		logTabla.setHiloServidor(registro.getHiloServidor());
		logTabla.setMensaje(registro.getMensaje());
		logTabla.setModoDebug(registro.getModoDebug());
		logTabla.setModuloCobis(registro.getModuloCobis());
		logTabla.setNombreServidorCts(registro.getNombreServidorCts());
		logTabla.setTipoTransaccion(registro.getTipoTransaccion());
		
		String sqlInsert = "INSERT INTO log_transacciones values(?,?,?,?,?,?,?,?)";
		
		log.debug("Desde impl Tablagsgsgss DAO sql: " + sqlInsert );
		
		log.debug("Desde impl Antes del Error " + sqlInsert );
		template.update(sqlInsert,logTabla.getFechaHoraTransaccion(),logTabla.getNombreServidorCts(),logTabla.getModuloCobis(),logTabla.getModoDebug(),logTabla.getHiloServidor(),logTabla.getDescripcionLibreria(),logTabla.getMensaje(),logTabla.getTipoTransaccion());	


		/*
		
			if (tablaConsulta != null){
				throw new MensajeException("Impl Tablas DAO..ID de Tabla ya existe en la Base", new MensajeError("ID Tabla ya existe en Base de Datos..."));
				
			}
			
			log.debug("Desde impl Antes del Error " + sqlInsert );
			template.update(sqlInsert,tabla.getIdtabla(),tabla.getNombreBaseDatos(),tabla.getNombreTabla(),tabla.getFechaTabla(),tabla.getDescripcion(),tabla.getTipoTabla(),tabla.getDataSensible(),tabla.getFrecuenciaRespaldo(),tabla.getTipoParticion());	

		*/
	}

	@Override
	public LogDto consultarLog(LogDto registro) {
		// TODO Auto-generated method stub
		return null;
	}

}
