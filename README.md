# 🎬 SYSCinema - Sistema de Gestão de Cinema

O **SYSCinema** é uma aplicação desenvolvida em **Java** focada na modelação e gestão de operações essenciais de um cinema, incluindo a gestão de clientes, funcionários, filmes, salas, sessões de exibição e venda de bilhetes/ingressos.

Este projeto foi estruturado com base nos princípios fundamentais da **Programação Orientada a Objetos (POO)**, tais como encapsulamento, associação e composição.

---

## 📌 Principais Entidades do Sistema

* **`Cliente`**: Guarda as informações dos espectadores (`nome`, `cpf`).
* **`Funcionario`**: Regista os dados dos colaboradores (`nome`, `matricula`).
* **`Filme`**: Modela os filmes em exibição (`titulo`, `duracao` em minutos).
* **`Sala`**: Identifica as salas físicas do cinema (`numero`, `capacidade`).
* **`Sessao`**: Relaciona um filme com uma sala num determinado horário (`dataHora`, `encerrada`, `sala`, `filme`).
* **`Ingresso`**: Regista a venda do bilhete/ingresso relacionando o cliente, funcionário responsável, sessão, tipo de bilhete (`Inteira` ou `Meia`) e preço (`valor`).

---

## 📐 Estrutura do Diagrama de Classes

```text
       +------------------+         +------------------+
       |     Cliente      |         |   Funcionario    |
       +------------------+         +------------------+
       | - nome: String   |         | - nome: String   |
       | - cpf: String    |         | - matricula: Str |
       +------------------+         +------------------+
                ^                            ^
                |                            |
                +----------+      +----------+
                           |      |
                        +------------+
                        |  Ingresso  |
                        +------------+
                        | - tipo     |
                        | - valor    |
                        | - sessao   |
                        | - cliente  |
                        | - funcion. |
                        +------------+
                              |
                              v
                        +------------+
                        |   Sessao   |
                        +------------+
                        | - dataHora |
                        | - encerrada|
                        +------------+
                          /        \
                         v          v
                 +----------+    +----------+
                 |   Sala   |    |  Filme   |
                 +----------+    +----------+
                 | - numero |    | - titulo |
                 | - capac. |    | - duracao|
                 +----------+    +----------+
