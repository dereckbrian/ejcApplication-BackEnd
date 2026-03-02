package com.saosebastiao.escontroEJC.controllers;

import com.saosebastiao.escontroEJC.dto.OqueAchouDTO;
import com.saosebastiao.escontroEJC.entity.OqueAchouVideo;
import com.saosebastiao.escontroEJC.repository.OqueAchouRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reacao")
@CrossOrigin(origins = "*")
public class reacaoVideoController {

    @Autowired
    private OqueAchouRepository repository;

    @GetMapping("/recuperar")
    public OqueAchouVideo buscarContagens() {
        return repository.findById(1L).orElse(new OqueAchouVideo());
    }

    @PostMapping("/adicionar")
    public void adicionarReacao(@RequestBody OqueAchouDTO body) {

        switch (body.tipo()) {
            case "AMEI" -> repository.incrementAmei();
            case "RACHO" -> repository.incrementRacho();
            case "ABENCOADO" -> repository.incrementAbencoado();
            case "TOP" -> repository.incrementTop();
        }

    }

}
