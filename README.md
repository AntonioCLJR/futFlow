# ⚽ FutFlow

> **API REST para gerenciamento de clubes, jogadores e competições de futebol desenvolvida com Java e Spring Boot.**

O **FutFlow** é um projeto Backend criado para aplicar conceitos modernos de desenvolvimento utilizando **Spring Boot**, seguindo uma arquitetura em camadas e boas práticas de programação.

O objetivo é evoluir continuamente o projeto, transformando-o em uma API completa para gerenciamento do universo do futebol, desde jogadores e clubes até campeonatos, partidas e estatísticas.

---

# 🎯 Objetivo

Este projeto foi desenvolvido com o propósito de:

- Praticar desenvolvimento Backend com Java.
- Aplicar boas práticas de arquitetura.
- Construir um projeto de portfólio para demonstrar conhecimentos em Spring Boot.
- Evoluir continuamente adicionando novas funcionalidades utilizadas no mercado.

---

# 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Flyway
- H2 Database
- Maven
- Swagger
- Lombok
- Git
- GitHub

---

# 📂 Arquitetura do Projeto

O projeto utiliza uma **Arquitetura em Camadas**, separando cada responsabilidade da aplicação.

```text
Cliente
    │
    ▼
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
Banco de Dados
```

---

# 📌 Funcionalidades

## Atualmente

- Cadastro de jogadores
- Consulta de jogadores
- Atualização de jogadores
- Exclusão de jogadores
- Persistência utilizando Spring Data JPA
- Versionamento do banco com Flyway
- Documentação da API com Swagger
- Banco de dados H2

---

# 🛣️ Roadmap

O projeto continuará evoluindo com novas funcionalidades.

## ✅ Concluído

- CRUD de Jogadores
- Arquitetura em Camadas
- DTO
- Mapper
- Spring Data JPA
- Hibernate
- Flyway
- Swagger
- Banco H2
- CRUD de Clubes
- Relacionamento Clube × Jogadores

## 🚧 Em desenvolvimento

- Tratamento Global de Exceções
- Bean Validation

## 📅 Próximas funcionalidades

- Campeonato
- Partidas
- Estatísticas
- Técnicos
- Transferências
- Upload de imagens
- Spring Security
- Autenticação JWT
- PostgreSQL
- Docker
- Testes Unitários
- Testes de Integração
- GitHub Actions (CI/CD)

---

# 📖 Conceitos Aplicados

Este projeto utiliza diversos conceitos importantes do desenvolvimento Backend.

- Arquitetura em Camadas
- REST API
- CRUD
- DTO
- Mapper
- JPA
- Hibernate
- Flyway
- ORM
- Injeção de Dependência
- Inversão de Controle (IoC)
- Versionamento de Banco de Dados

---

# 📡 Endpoints

## Jogadores

| Método | Endpoint | Descrição |
|---------|----------|-----------|
| GET | `/jogadores` | Lista todos os jogadores |
| GET | `/jogadores/{id}` | Busca um jogador pelo ID |
| POST | `/jogadores` | Cadastra um jogador |
| PUT | `/jogadores/{id}` | Atualiza um jogador |
| DELETE | `/jogadores/{id}` | Remove um jogador |

> Conforme o projeto evoluir, novos módulos e endpoints serão adicionados.

---

# ▶️ Como executar o projeto

## 1. Clone o repositório

```bash
git clone https://github.com/AntonioCLJR/futFlow.git
```

## 2. Entre na pasta do projeto

```bash
cd futFlow
```

## 3. Execute a aplicação

```bash
mvn spring-boot:run
```

A aplicação será iniciada em:

```text
http://localhost:8080
```

---

# 📄 Documentação da API

Após iniciar a aplicação, acesse o Swagger em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# 💾 Banco de Dados

Durante o desenvolvimento, o projeto utiliza o banco de dados **H2**.

Acesse o console em:

```text
http://localhost:8080/h2-console
```

---

# 📈 Evolução do Projeto

O **FutFlow** é um projeto em constante evolução.

Novas funcionalidades serão implementadas conforme o aprendizado de novas tecnologias, tornando a aplicação cada vez mais próxima de um sistema utilizado em ambientes reais.

---

# 🤝 Contribuições

Sugestões, melhorias e feedbacks são sempre bem-vindos.

Caso encontre algum problema ou tenha alguma ideia, fique à vontade para abrir uma **Issue** ou enviar um **Pull Request**.

---

# 👨‍💻 Desenvolvedor

**Antonio Carlos de Souza Junior**

Desenvolvedor Backend Java com foco em Spring Boot, APIs REST e boas práticas de arquitetura de software.

- GitHub: https://github.com/AntonioCLJR
- LinkedIn: https://www.linkedin.com/in/acsjunior

---

# ⭐ Se este projeto foi útil...

Se este projeto foi útil ou te ajudou de alguma forma, deixe uma **⭐** no repositório.

Isso incentiva a evolução do projeto e ajuda outras pessoas a encontrá-lo.
