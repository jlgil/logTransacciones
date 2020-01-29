package com.accusys.logTransacciones.servicios;

import com.accusys.logTransacciones.dao.dto.LogDto;
import com.accusys.logTransacciones.excepciones.ServiceException;

public interface ILogServicio {
	
	public void insertarLog (LogDto registro) throws ServiceException;
	
	public LogDto consultarLog (LogDto registro) throws ServiceException;

}
