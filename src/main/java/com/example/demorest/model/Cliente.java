package com.example.demorest.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity // Avisa ao Spring que isso é uma tabela no banco [cite: 16, 147]
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Requisito da apostila [cite: 75]

    private String nome; // Requisito da apostila [cite: 76]

    private LocalDate clienteDesde; // Requisito da apostila [cite: 77]

    // Construtor padrão (Obrigatório para o JPA)
    public Cliente() {}

    // Getters e Setters (Essenciais para a API funcionar)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getClienteDesde() { return clienteDesde; }
    public void setClienteDesde(LocalDate clienteDesde) { this.clienteDesde = clienteDesde; }
}