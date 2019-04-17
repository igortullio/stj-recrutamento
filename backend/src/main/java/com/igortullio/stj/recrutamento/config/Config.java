package com.igortullio.stj.recrutamento.config;

import com.igortullio.stj.recrutamento.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;

@Configuration
public class Config {

    @Autowired
    private DBService dbService;

    @Bean
    public void initDb() throws ParseException {
        dbService.initDb();
    }

}
