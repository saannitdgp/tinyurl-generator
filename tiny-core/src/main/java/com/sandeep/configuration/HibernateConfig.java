package com.sandeep.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class HibernateConfig {

    private DataSource          dataSource;

    private static final Logger LOGGER = LoggerFactory.getLogger(HibernateConfig.class);

    @Value(value = "${db.url}")
    private String              DB_URL;

    @Value(value = "${db.user.name}")
    private String              USER_NAME;

    @Value(value = "${db.password}")
    private String              PASSWORD;

    @Value(value = "${db.driver.name}")
    private String              DRIVER_NAME;

    @Value(value = "${db.package.to.scan}")
    private String              PACKAGE_TO_SCAN;

    @Value(value = "${db.mysql.dialect}")
    private String              MYSQL_DIALEACT;

    @Value(value = "${db.show.sql}")
    private String              SHOW_SQL;

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(getDataSource());
        sessionFactoryBean.setPackagesToScan(PACKAGE_TO_SCAN);
        Properties hibernateProperties = new Properties();
        hibernateProperties.put("hibernate.dialect", MYSQL_DIALEACT);
        hibernateProperties.put("hibernate.show_sql", SHOW_SQL);
        sessionFactoryBean.setHibernateProperties(hibernateProperties);
        return sessionFactoryBean;
    }

    @Bean
    public DataSource getDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(DB_URL);
        dataSource.setDriverClassName(DRIVER_NAME);
        dataSource.setUsername(USER_NAME);
        dataSource.setPassword(PASSWORD);
        return dataSource;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }

}
