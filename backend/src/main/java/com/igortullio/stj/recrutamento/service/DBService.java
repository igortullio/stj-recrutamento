package com.igortullio.stj.recrutamento.service;

import com.igortullio.stj.recrutamento.domain.Ministro;
import com.igortullio.stj.recrutamento.repository.MinistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private MinistroRepository ministroRepository;

    public void initDb() throws ParseException {
        Ministro ministro1 = new Ministro(null, "Ministro1", "11111111111", "ministro1@stj.jus.br");
        Ministro ministro2 = new Ministro(null, "Ministro2", "22222222222", "ministro2@stj.jus.br");
        Ministro ministro3 = new Ministro(null, "Ministro3", "33333333333", "ministro3@stj.jus.br");
        Ministro ministro4 = new Ministro(null, "Ministro4", "44444444444", "ministro4@stj.jus.br");
        Ministro ministro5 = new Ministro(null, "Ministro5", "55555555555", "ministro5@stj.jus.br");

        ministroRepository.saveAll(Arrays.asList(ministro1, ministro2, ministro3, ministro4, ministro5));
    }

}
