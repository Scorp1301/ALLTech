package org.al.config;

import org.al.dao.StudentDao;
import org.al.dao.StudentDaoImp;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class WebMvcConfig {
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		
		return vr;
		@Bean
		DriverManagerDataSource getDataSource() {
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("com.mysql.jdbc.Driver");
			ds.setUrl("jdbc.mysql://localhost:3306/test");
			ds.setUsername("Admin");
			ds.setPassword("Scorpion@24");
			
			return ds;
			
		}
		
		public StudentDao getUserDao() {
			return new StudentDaoImp(getDataSource());
		}
	}

	private void getUserDao() {
		// TODO Auto-generated method stub
		
	}

}
