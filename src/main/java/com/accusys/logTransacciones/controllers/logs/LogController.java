package com.accusys.logTransacciones.controllers.logs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accusys.logTransacciones.dao.dto.LogDto;
import com.accusys.logTransacciones.excepciones.MensajeErrores;
import com.accusys.logTransacciones.excepciones.ServiceException;
import com.accusys.logTransacciones.servicios.ILogServicio;


@RestController
public class LogController {
	
	private static final Logger log = LoggerFactory.getLogger(LogController.class);
	
	@Autowired
	private ILogServicio logServicio;
	
	@RequestMapping(value="/logTransacciones/logs", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<MensajeErrores> ingresoLog ( @RequestBody LogDto clienteDtoIngreso ) throws ServiceException  {
		
	    log.debug("ingresoLog: " + clienteDtoIngreso.toString());
	    
		if (clienteDtoIngreso==null) {
			throw new ServiceException(HttpStatus.FOUND.value(), "Datos Vacios", 125);
			
		}else {			
			logServicio.insertarLog(clienteDtoIngreso);
		}
		
		MensajeErrores respuesta = new MensajeErrores();
		
		respuesta.setCode(200);
		respuesta.setHttpStatus(200);
		respuesta.setMensaje("Log Ingresado con exito");
		respuesta.setDeveloperMessage("Ingresado con exito");

		
		return new ResponseEntity<MensajeErrores>(respuesta,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/logTransacciones/logs",method= RequestMethod.GET,
	        produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<LogDto>>  buscarAllLogs() {
		  
		  log.debug("Buscando");
		  
		  List listaLogDto = new ArrayList<LogDto>();
		  
		  LogDto log1 = new LogDto();
		  LogDto log2 = new LogDto();
		  LogDto log3 = new LogDto();
		  
		  log1.setDescripcionLibreria("Libreria de prueba1");
          log1.setHiloServidor(3);
          log1.setMensaje("Mensa de Error");
          
          
		  log1.setDescripcionLibreria("Libreria de prueba2");
          log1.setHiloServidor(4);
          log1.setMensaje("Mensa de Erroeeeeer");
          
          listaLogDto.add(log1);
          listaLogDto.add(log2);
          
          

		  
		  
		  for (Iterator iterator = listaLogDto.iterator(); iterator.hasNext();) {
			  LogDto clienteDTO = (LogDto) iterator.next();
			
			log.debug("buscarAllClientes Ced: " + clienteDTO.getDescripcionLibreria());
		}
		  
		  
		  return new ResponseEntity<List<LogDto>>(listaLogDto,HttpStatus.OK);
	}
	
	

}
