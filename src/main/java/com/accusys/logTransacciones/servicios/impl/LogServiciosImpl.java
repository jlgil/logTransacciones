package com.accusys.logTransacciones.servicios.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accusys.logTransacciones.dao.ILogDao;
import com.accusys.logTransacciones.dao.dto.LogDto;
import com.accusys.logTransacciones.excepciones.ServiceException;
import com.accusys.logTransacciones.servicios.ILogServicio;

@Service
public class LogServiciosImpl implements ILogServicio {
	
	private static final Logger log = LoggerFactory.getLogger(LogServiciosImpl.class);
	
	@Autowired
	private ILogDao logDao;

	@Override
	public void insertarLog(LogDto registro) throws ServiceException {
		// TODO Auto-generated method stub
		log.debug("INSERTANDO DESDE SERVsssICIO:" + registro.toString());
		logDao.insertarLog(registro);

	}

	@Override
	public LogDto consultarLog(LogDto registro) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

}
