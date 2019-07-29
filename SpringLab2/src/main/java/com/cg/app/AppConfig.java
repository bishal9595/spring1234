package com.cg.app;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@ComponentScan("com.cg")
@EnableWebMvc
@EnableTransactionManagement
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver view = new InternalResourceViewResolver("/WEB-INF/pages/", ".jsp");
        view.setViewClass(JstlView.class);
        return view;
    }
    @Autowired
    private DataSource dataSource;
 
    @Autowired
    private EntityManagerFactory entityManagerFactory;
 
 
    @Bean
    public FactoryBean<EntityManagerFactory> entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(this.dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter());
        emfb.setPackagesToScan("com.cg.entities");
        emfb.setPersistenceUnitName("JPA-PU");
        
        return emfb;
    }
 
 
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }
 
    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(this.entityManagerFactory);
        txManager.setDataSource(this.dataSource);
        return txManager;
    }
 
 
    /**
     * @return
     * @throws SQLException 
     */
    @Bean
    public DataSource dataSource() throws SQLException {
 
    	SimpleDriverDataSource ds=new SimpleDriverDataSource();

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    	Driver driver=DriverManager.getDriver("jdbc:oracle:thin:@localhost:1521/xe");
    			
    	ds.setDriver(driver);
    	ds.setDriverClass(driver.getClass());
    	ds.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
    	ds.setUsername("hr");
    	ds.setPassword("hr");
    	return ds;
    }
 
}
 
 
