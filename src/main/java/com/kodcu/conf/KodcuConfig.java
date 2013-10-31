package com.kodcu.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 15.09.2013
 * Time: 11:29
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class KodcuConfig {

    @Bean(name = "araba")
    public Arac getAraba() {
        return new Araba();
    }

    @Bean(name = "galeri")
    public Galeri getGaleri() {
        Galeri galeri = new Galeri();
        galeri.setArac(getAraba());
        return galeri;
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:hsqldb:mem:.");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
        return dataSource;
    }


}
