package com.findsport.DataBaseConnections;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

@Configuration
public class CreateDBConnection {

	// Database settings

	private DriverManagerDataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DriverManagerDataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public JdbcTemplate getConnection()
	{
		return jdbcTemplate;
		   
	}
}