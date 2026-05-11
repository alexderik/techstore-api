# Baozi Store API - Atividade Prática UNINTER

Este projeto é uma API REST desenvolvida para a disciplina de Desenvolvimento Web Back-End. O sistema gerencia o fluxo de vendas da **Baozi Store**, uma loja fictícia de pãezinhos chineses.

## 👤 Desenvolvedor
* **Nome:** Alexandre Baldoino
* **RU:** 4998411
* **Curso:** Engenharia de Software

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java 17
* **Framework:** Spring Boot
* **Banco de Dados:** H2 (Banco em memória)
* **Gerenciador de Dependências:** Maven

## 📦 Organização de Pacotes
O projeto segue a estrutura de camadas recomendada:
- `com.exemplo.baozi.model`: Entidades (Cliente, Produto, Pedido)
- `com.exemplo.baozi.repository`: Interfaces para persistência de dados
- `com.exemplo.baozi.controller`: Endpoints da API

## 🚀 Como Executar
1. Clone o repositório.
2. Importe o projeto como Maven Project na sua IDE (Eclipse/IntelliJ).
3. Execute a classe principal `BaoziApplication.java`.
4. A API estará disponível em `http://localhost:8080`.

## 📍 Endpoints Principais (Exemplo: Cliente)
| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| POST | `/clientes` | Cadastra um novo cliente |
| GET | `/clientes` | Lista todos os clientes |
| GET | `/clientes/{id}` | Busca um cliente por ID |
| DELETE | `/clientes/{id}` | Remove um cliente |
