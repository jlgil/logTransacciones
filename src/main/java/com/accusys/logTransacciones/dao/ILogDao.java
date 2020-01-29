package com.accusys.logTransacciones.dao;

import com.accusys.logTransacciones.dao.dto.LogDto;

public interface ILogDao {
	
	public void insertarLog (LogDto registro);
	
	public LogDto consultarLog (LogDto registro);
	
}
