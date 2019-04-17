package com.igortullio.stj.recrutamento.service;

import com.igortullio.stj.recrutamento.domain.Ministro;
import com.igortullio.stj.recrutamento.repository.MinistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class MinistroService {

    @Autowired
    private MinistroRepository ministroRepository;

    public Ministro find(Integer id) {
        Optional<Ministro> ministro = ministroRepository.findById(id);
        return ministro.orElseThrow(EntityNotFoundException::new);
    }

    public Ministro save(Ministro ministro) {
        ministro.setId(null);
        return ministroRepository.save(ministro);
    }

}
