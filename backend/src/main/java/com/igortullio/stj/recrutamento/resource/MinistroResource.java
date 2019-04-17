package com.igortullio.stj.recrutamento.resource;

import com.igortullio.stj.recrutamento.domain.Ministro;
import com.igortullio.stj.recrutamento.service.MinistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping(value = "/ministros")
public class MinistroResource {

    @Autowired
    private MinistroService ministroService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Ministro> find(@PathVariable Integer id){
        return ResponseEntity.ok().body(ministroService.find(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody Ministro ministro){
        Ministro save = ministroService.save(ministro);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(save.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

}
