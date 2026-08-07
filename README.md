# ⚽ FutFlow

API REST para gerenciamento de **clubes e jogadores de futebol**, desenvolvida com **Java e Spring Boot**.

O projeto utiliza arquitetura em camadas, DTOs, Mappers, JPA/Hibernate e PostgreSQL, além de Flyway para versionamento do banco de dados.

A aplicação também pode ser executada utilizando Docker e Docker Compose.

---

## 🚀 Tecnologias

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Flyway
- Maven
- Lombok
- Swagger
- Docker
- Docker Compose

---

## 📂 Estrutura

O projeto é organizado em módulos de **Clubes** e **Jogadores**, seguindo uma arquitetura em camadas:

```text
src/main/java/dev.java.futFlow

├── Clubes
│   ├── ClubeController
│   ├── ClubeControllerUi
│   ├── ClubeDTO
│   ├── ClubeMapper
│   ├── ClubeModel
│   ├── ClubeRepository
│   └── ClubeService
│
├── Jogadores
│   ├── JogadorController
│   ├── JogadorControllerUi
│   ├── JogadorDTO
│   ├── JogadorMapper
│   ├── JogadorModel
│   ├── JogadorRepository
│   └── JogadorService
│
└── FutFlowApplication
```

⚽ Funcionalidades
Clubes
Cadastro
Listagem
Consulta por ID
Atualização
Exclusão
Jogadores
Cadastro
Listagem
Consulta por ID
Atualização
Exclusão
Associação com clube
Definição da posição

🔗 Endpoints
Jogadores

1.GET	/jogadores	Lista jogadores
2.GET	/jogadores/{id}	Busca jogador por ID
3.POST	/jogadores	Cadastra jogador
4.PUT	/jogadores/{id}	Atualiza jogador
5.DELETE	/jogadores/{id}	Remove jogador

Clubes

1.GET	/clubes	Lista clubes
2.GET	/clubes/{id}	Busca clube por ID
3.POST	/clubes	Cadastra clube
4.PUT	/clubes/{id}	Atualiza clube
5.DELETE	/clubes/{id}	Remove clube

▶️ Como executar
Pré-requisitos
Java 21
Docker
Docker Compose
Git

1. Clone o projeto
git clone https://github.com/AntonioCLJR/futFlow.git
2. Entre na pasta
cd futFlow
3. Configure o .env

Crie um arquivo .env na raiz do projeto:

POSTGRES_DB=futflow
POSTGRES_USER=futflowadm
POSTGRES_PASSWORD=futflowadm

4. Execute com Docker Compose
docker compose up -d

Verifique os containers:

docker compose ps

Para visualizar os logs:

docker compose logs -f futflow
📖 Swagger

Com a aplicação executando, acesse:

http://localhost:8080/swagger-ui/index.html

🗄️ Banco de Dados

O projeto utiliza PostgreSQL e Flyway para gerenciamento e versionamento das migrations.

O Docker Compose configura automaticamente o banco de dados necessário para a aplicação.

🛣️ Próximos passos
Tratamento global de exceções
Bean Validation
Campeonatos
Partidas
Estatísticas
Spring Security
JWT
Testes unitários
Testes de integração
CI/CD

👨‍💻 Desenvolvedor

Antonio Carlos de Souza Junior

Desenvolvedor Backend Java com foco em Spring Boot, APIs REST e boas práticas de desenvolvimento.

LinkedIn: https://www.linkedin.com/in/acsjunior

⭐ Se gostou do projeto, considere deixar uma estrela no repositório.
