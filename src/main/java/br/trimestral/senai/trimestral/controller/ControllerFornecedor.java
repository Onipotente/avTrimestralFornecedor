package br.trimestral.senai.trimestral.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerFornecedor {

    @GetMapping("/fornecedor/list")
    public String findAll( ){
        return "fornecedor/list";
    }
}
