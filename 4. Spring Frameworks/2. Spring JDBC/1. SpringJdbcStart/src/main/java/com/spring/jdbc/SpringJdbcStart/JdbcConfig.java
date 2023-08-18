package com.spring.jdbc.SpringJdbcStart;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.spring.jdbc.SpringJdbcStart.dao"})
public class JdbcConfig {
	
	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/college_db");
		ds.setUsername("root");
		ds.setPassword("darshan@123");
		
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate()
	{
		JdbcTemplate template = new JdbcTemplate(this.getDataSource());
		return template;
	}

}
