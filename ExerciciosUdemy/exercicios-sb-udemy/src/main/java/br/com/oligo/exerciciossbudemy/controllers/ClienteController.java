package br.com.oligo.exerciciossbudemy.controllers;

import org.springframework.web.bind.annotation.*;

import br.com.oligo.exerciciossbudemy.models.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(1, "Hugo", "123.456.789-00");
    }
    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "Duda", "987.654.321-00");
    }
    @GetMapping
    public Cliente obterClientePorId2(
            @RequestParam(name ="id") int id){
        return new Cliente(id, "Isa", "111.222.333-44");
    }
}
