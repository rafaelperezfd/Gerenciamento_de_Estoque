# 📦 Gerenciamento de Estoque (StockManager)

> Aplicação em Java desenvolvida no terminal/consola para gestão centralizada de produtos e controlo de inventário em tempo real, aplicando conceitos fundamentais de Orientação a Objetos (POO).

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/Paradigma-Orientado_a_Objetos-blue?style=for-the-badge)
![Licença](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 📌 Sobre o Projeto

O **Gerenciamento de Estoque** é um sistema interativo via linha de comando (CLI) projetado para simplificar e automatizar o controlo de entradas, saídas e consultas de produtos em inventário. 

O projeto foi desenvolvido com foco na aplicação prática de **Programação Orientada a Objetos (POO)**, utilizando estruturas de dados dinâmicas para manipulação segura e eficiente das informações.

---

## ✨ Funcionalidades

- [x] **Registo de Produtos:** Adição de novos produtos com identificador único (ID), nome, quantidade em stock e preço unitário.
- [x] **Listagem e Consulta:** Visualização de todos os itens registados e pesquisa individual por ID ou nome.
- [x] **Atualização de Dados:** Edição de quantidade, preço e informações dos produtos cadastrados.
- [x] **Movimentação de Stock:** Registo simplificado de entradas e saídas de itens no inventário.
- [x] **Remoção de Produtos:** Exclusão de itens obsoletos ou descontinuados do sistema.
- [x] **Validação de Dados:** Prevenção de registos duplicados, quantidades negativas e preços inválidos.

---

## 🛠️ Tecnologias e Conceitos Utilizados

- **Linguagem:** Java (JDK 17+)
- **Estrutura de Dados:** `ArrayList` para manipulação dinâmica da lista de produtos
- **Paradigma:** Programação Orientada a Objetos (POO)
  - **Encapsulamento:** Proteção dos atributos com getters e setters
  - **Abstração & Modularização:** Separação da lógica de negócio, modelo de dados e interface via consola
  - **Reutilização de Código:** Módulos e métodos dedicados para cada operação CRUD

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
Antes de começar, certifique-se de ter instalado em sua máquina:
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) versão 17 ou superior.
- Uma IDE de sua preferência (ex: IntelliJ IDEA, VS Code, Eclipse) ou o próprio terminal.

### 1. Clonar o Repositório
```bash
git clone [https://github.com/rafaelperezfd/Gerenciamento_de_Estoque.git](https://github.com/rafaelperezfd/Gerenciamento_de_Estoque.git)
cd Gerenciamento_de_Estoque
