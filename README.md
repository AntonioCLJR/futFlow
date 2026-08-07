# ⚽ FutFlow

O **FutFlow** é uma API REST desenvolvida com **Java e Spring Boot**, criada com o objetivo de aplicar conceitos de desenvolvimento Backend utilizados no mercado.

O projeto possui gerenciamento de **clubes e jogadores**, relacionamento entre entidades, utilização de **DTOs e Mappers**, persistência com **PostgreSQL** e versionamento do banco de dados utilizando **Flyway**.

A aplicação também está preparada para execução utilizando **Docker e Docker Compose**, facilitando a configuração do ambiente.

---

# 🎯 Objetivo

Este projeto foi desenvolvido com o propósito de:

- Praticar desenvolvimento Backend com Java.
- Aplicar boas práticas de arquitetura.
- Construir um projeto de portfólio para demonstrar conhecimentos em Spring Boot.
- Trabalhar com persistência de dados utilizando PostgreSQL.
- Utilizar Docker para padronizar o ambiente de execução.
- Evoluir continuamente adicionando novas funcionalidades utilizadas no mercado.

---

# 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Flyway
- PostgreSQL
- Maven
- Swagger / OpenAPI
- Docker
- Docker Compose
- Lombok
- Git
- GitHub

---

# 📂 Arquitetura do Projeto

O projeto utiliza uma **Arquitetura em Camadas**, separando as responsabilidades da aplicação.

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
PostgreSQL
Fluxo de uma requisição
Request
   │
   ▼
Controller
   │
   ▼
DTO
   │
   ▼
Service
   │
   ▼
Mapper
   │
   ▼
Model
   │
   ▼
Repository
   │
   ▼
PostgreSQL
📌 Funcionalidades
👤 Jogadores
Cadastro de jogadores
Consulta de jogadores
Consulta de jogador por ID
Atualização de jogadores
Exclusão de jogadores
Associação de jogador a um clube
Definição da posição do jogador
Persistência utilizando PostgreSQL
⚽ Clubes
Cadastro de clubes
Consulta de clubes
Consulta de clube por ID
Atualização de clubes
Exclusão de clubes
Associação entre clubes e jogadores
🛣️ Roadmap

O projeto continuará evoluindo com novas funcionalidades.

✅ Concluído
CRUD de Jogadores
CRUD de Clubes
Arquitetura em Camadas
DTO
Mapper
Spring Data JPA
Hibernate
Flyway
Swagger
PostgreSQL
Docker
Docker Compose
Relacionamento Clube × Jogadores
Enum para posição dos jogadores
🚧 Em desenvolvimento
Tratamento Global de Exceções
Bean Validation
📅 Próximas funcionalidades
Campeonato
Partidas
Estatísticas
Técnicos
Transferências
Upload de imagens
Spring Security
Autenticação JWT
Testes Unitários
Testes de Integração
GitHub Actions (CI/CD)
📖 Conceitos Aplicados

Este projeto utiliza diversos conceitos importantes do desenvolvimento Backend:

Arquitetura em Camadas
REST API
CRUD
DTO
Mapper
JPA
Hibernate
ORM
Spring Data JPA
Injeção de Dependência
Inversão de Controle (IoC)
Relacionamentos entre entidades
Enum
Versionamento de Banco de Dados
Flyway
PostgreSQL
Docker
Docker Compose
Variáveis de Ambiente
📡 Endpoints
👤 Jogadores
Método	Endpoint	Descrição
GET	/jogadores	Lista todos os jogadores
GET	/jogadores/{id}	Busca um jogador pelo ID
POST	/jogadores	Cadastra um jogador
PUT	/jogadores/{id}	Atualiza um jogador
DELETE	/jogadores/{id}	Remove um jogador
⚽ Clubes
Método	Endpoint	Descrição
GET	/clubes	Lista todos os clubes
GET	/clubes/{id}	Busca um clube pelo ID
POST	/clubes	Cadastra um clube
PUT	/clubes/{id}	Atualiza um clube
DELETE	/clubes/{id}	Remove um clube

Conforme o projeto evoluir, novos módulos e endpoints serão adicionados.

▶️ Como executar o projeto
Pré-requisitos

Antes de executar o projeto, tenha instalado:

Java 21
Maven
Docker
Docker Compose
Git
1. Clone o repositório
git clone https://github.com/AntonioCLJR/futFlow.git
2. Entre na pasta
cd futFlow
3. Configure as variáveis de ambiente

Crie um arquivo chamado:

.env

Configure as variáveis necessárias:

DATABASE_USERNAME=futflowadm
DATABASE_PASSWORD=futflowadm

POSTGRES_DB=futflow
POSTGRES_USER=futflowadm
POSTGRES_PASSWORD=futflowadm

Importante: não envie o arquivo .env para o GitHub. Adicione .env ao seu .gitignore.

O DATABASE_URL utilizado pelo container do FutFlow é configurado pelo docker-compose.yml, utilizando o nome do serviço postgres como hostname.

4. Suba os containers

Execute:

docker compose up -d

O Docker Compose irá iniciar:

futflow-postgres
futflow

Para verificar o status dos containers:

docker compose ps
5. Visualizar os logs

Para visualizar os logs da aplicação:

docker compose logs -f futflow

Para visualizar os logs do PostgreSQL:

docker compose logs -f postgres
6. Acesse a aplicação

Após os containers iniciarem, acesse:

http://localhost:8080/clubes/ui/listar

Essa rota apresenta a interface de listagem dos clubes.

📄 Documentação da API

A API possui documentação através do Swagger / OpenAPI.

Após iniciar a aplicação, acesse:

http://localhost:8080/swagger-ui/index.html

O Swagger permite visualizar e testar os endpoints disponíveis na API.

💾 Banco de Dados

O FutFlow utiliza PostgreSQL como banco de dados.

O banco é executado através de um container Docker e possui persistência de dados utilizando um volume:

Docker
   │
   ▼
PostgreSQL
   │
   ▼
futflow_postgres_data

O projeto utiliza Flyway para controlar as alterações e versões do banco de dados através de migrations.

🐳 Docker

O projeto utiliza Docker para facilitar a configuração do ambiente.

O docker-compose.yml executa dois serviços:

┌───────────────────────────────┐
│         Docker Compose        │
│                               │
│  ┌─────────────────────────┐  │
│  │        FutFlow          │  │
│  │      Spring Boot        │  │
│  │         :8080           │  │
│  └────────────┬────────────┘  │
│               │               │
│               ▼               │
│  ┌─────────────────────────┐  │
│  │       PostgreSQL        │  │
│  │         :5432           │  │
│  └─────────────────────────┘  │
│                               │
└───────────────────────────────┘

O PostgreSQL possui um healthcheck, garantindo que o banco esteja disponível antes da inicialização da aplicação.

📈 Evolução do Projeto

O FutFlow é um projeto em evolução.

A proposta é começar com o gerenciamento de clubes e jogadores e, gradualmente, transformar a aplicação em uma plataforma mais completa relacionada ao universo do futebol.

Novas funcionalidades serão adicionadas conforme o aprendizado de novas tecnologias e conceitos de desenvolvimento Backend.
