package br.com.fiap.tds2ps.spring_mvc.conection;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("jdbc:oracle:thin:@oracle.fiap.com.br:1521/ORCL")
                .username("RM552692")
                .password("200899")
                .driverClassName("oracle.jdbc.OracleDriver")
                .build();
    }
}