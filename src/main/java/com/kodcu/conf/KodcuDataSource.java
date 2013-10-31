package com.kodcu.conf;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 15.09.2013
 * Time: 11:16
 * To change this template use File | Settings | File Templates.
 */
//@Component
public class KodcuDataSource extends DriverManagerDataSource {

    public KodcuDataSource() {
        setUrl("jdbc:hsqldb:mem:.");
        setUsername("sa");
        setPassword("");
        setDriverClassName("org.hsqldb.jdbcDriver");
    }
}
