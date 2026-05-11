package com.example.demorest.controller;

import com.example.demorest.model.Cliente;
import com.example.demorest.repository.ClienteRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping // Criar [cite: 86]
    public Cliente criar(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    @GetMapping // Listar todos [cite: 88]
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}") // Consultar por ID [cite: 87]
    public Cliente buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}") // Apagar [cite: 89]
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
