package com.rd.treinamentodev.AvaliacaoSpringBoot.controller;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.AlunoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/aluno")
    public ResponseEntity gravar(@RequestBody AlunoDTO alunoDTO){
        return alunoService.gravar(alunoDTO);
    }
}




//    @PostMapping("/usuario")
//    public ResponseEntity cadastrar(@RequestBody Usuario usuario){
//        if(usuario.getNome() == null)
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Atributo nome é obrigatório");
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrar(usuario));
//
//    }
