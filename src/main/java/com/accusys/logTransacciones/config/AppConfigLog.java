package com.accusys.logTransacciones.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
//@PropertySource(value = { "classpath:application.properties"})
//@PropertySource(value = { "file:C:/JoseGil/Personal/miarchivo.properties"})
//C:\JoseGil\Personal
public class AppConfigLog {

	@Autowired
    DataSource dataSource;

    @Value("${app.datasource.driver-class-name}") 
    String driverClassName;
    @Value("${app.datasource.url}") 
    String url;
    @Value("${app.datasource.username}") 
    String username;
    @Value("${app.datasource.password}") 
    String password;
    
    /*
	@Bean
	public DataSource mysqlDataSource() {
		 DriverManagerDataSource dataSource = new DriverManagerDataSource();
	     //dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
	     //dataSource.setUrl(env.getProperty("jdbc.url"));
	     //dataSource.setUsername(env.getProperty("jdbc.username"));
	     //dataSource.setPassword(env.getProperty("jdbc.password"));
		 
		 
		 dataSource.setDriverClassName(driverClassName);
		 dataSource.setUrl(url);
	     dataSource.setUsername(username);
	     dataSource.setPassword(password);
	     
		 System.out.println("Driver " + driverClassName.toString());
		 System.out.println("URLr " + url.toString());
		 System.out.println("Datasource " + dataSource.toString());
	     
		 
	     return dataSource;  
		 
	}*/

	/*
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer()	  {
	       return new PropertySourcesPlaceholderConfigurer();
	} 
	*/   
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		 System.out.println("Driver des jdc " + dataSource.toString());
		 System.out.println("URLr des jdc" + url.toString());
		 System.out.println("Datasource des jdc" + dataSource.toString());

	       return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		 System.out.println("Driver des platta " + dataSource.toString());
		 System.out.println("URLr des platta" + url.toString());
		 System.out.println("Datasource des platta" + dataSource.toString());

	       return new DataSourceTransactionManager(dataSource);
	}
}
