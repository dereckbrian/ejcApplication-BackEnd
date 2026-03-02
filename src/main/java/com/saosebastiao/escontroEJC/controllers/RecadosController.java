package com.saosebastiao.escontroEJC.controllers;

import com.saosebastiao.escontroEJC.dto.RecadosDTO;
import com.saosebastiao.escontroEJC.entity.OqueAchouVideo;
import com.saosebastiao.escontroEJC.entity.Recados;
import com.saosebastiao.escontroEJC.repository.RecadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recados")
@CrossOrigin(origins = "*")
public class RecadosController {

    @Autowired
    private RecadoRepository repository;

    @GetMapping("/recuperar")
    public List<Recados> listarRecados() {
        return repository.findTop6ByOrderByIdDesc();
    }

    @PostMapping("/cadastrar")
    public void cadastrarRecado(@RequestBody RecadosDTO body){
        Recados novoRecado = new Recados();

        novoRecado.setNome(body.nome());
        novoRecado.setMenssagem(body.menssagem());
        novoRecado.setEmoji(body.emoji());
        repository.save(novoRecado);
    }
}
