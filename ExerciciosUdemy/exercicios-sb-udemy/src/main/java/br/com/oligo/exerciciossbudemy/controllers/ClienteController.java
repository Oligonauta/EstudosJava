package br.com.oligo.exerciciossbudemy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.oligo.exerciciossbudemy.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(1, "Hugo", "123.456.789-00");
    }
}
