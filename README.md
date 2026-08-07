#⚽ FutFlow

O FutFlow é uma API REST desenvolvida com Java e Spring Boot, criada com o objetivo de aplicar conceitos de desenvolvimento Backend utilizados no mercado.

O projeto possui gerenciamento de clubes e jogadores, relacionamento entre entidades, utilização de DTOs e Mappers, persistência com PostgreSQL e versionamento do banco de dados utilizando Flyway.

A aplicação também está preparada para execução utilizando Docker e Docker Compose, facilitando a configuração do ambiente.

🎯 Objetivo

Este projeto foi desenvolvido com o propósito de:

Praticar desenvolvimento Backend com Java.
Aplicar boas práticas de arquitetura.
Construir um projeto de portfólio para demonstrar conhecimentos em Spring Boot.
Evoluir continuamente adicionando novas funcionalidades utilizadas no mercado.
🚀 Tecnologias Utilizadas
Java 21
Spring Boot
Spring Data JPA
Hibernate
Flyway
PostgreSQL
Maven
Swagger
Docker
Docker Compose
Lombok
Git
GitHub
📂 Arquitetura do Projeto

O projeto utiliza uma Arquitetura em Camadas, separando cada responsabilidade da aplicação.

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
Arquitetura em Camadas
DTO
Mapper
Spring Data JPA
Hibernate
Flyway
Swagger
Banco H2
CRUD de Clubes
Relacionamento Clube × Jogadores
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
PostgreSQL
Docker
Testes Unitários
Testes de Integração
GitHub Actions (CI/CD)
📖 Conceitos Aplicados

Este projeto utiliza diversos conceitos importantes do desenvolvimento Backend.

Arquitetura em Camadas
REST API
CRUD
DTO
Mapper
JPA
Hibernate
Flyway
ORM
Injeção de Dependência
Inversão de Controle (IoC)
Versionamento de Banco de Dados
📡 Endpoints
Jogadores
Método	Endpoint	Descrição
GET	/jogadores	Lista todos os jogadores
GET	/jogadores/{id}	Busca um jogador pelo ID
POST	/jogadores	Cadastra um jogador
PUT	/jogadores/{id}	Atualiza um jogador
DELETE	/jogadores/{id}	Remove um jogador

Conforme o projeto evoluir, novos módulos e endpoints serão adicionados.

#▶️ Como executar o projeto
Pré-requisitos

Antes de executar o projeto, tenha instalado:

Java 21
Maven
Docker
Docker Compose
Git

Clone o repositório
git clone 
AntonioCLJR/futFlow.gitit
Entre na pasta
cd futFlow
Configure as variáveis de ambiente

Crie um arquivo:

.env

Configure as variáveis necessárias:

DATABASE_USERNAME=futflowadm
DATABASE_PASSWORD=futflowadm

POSTGRES_DB=futflow
POSTGRES_USER=futflowadm
POSTGRES_PASSWORD=futflowadm

O DATABASE_URL utilizado pelo container da aplicação é configurado pelo docker-compose.yml, utilizando o nome do serviço postgres.

Suba os containers

Execute:

docker compose up -d

O Docker Compose irá iniciar:

futflow-postgres
futflow

Para verificar os containers:

docker compose ps

Visualizar os logs

Para visualizar os logs da aplicação:

docker compose logs -f futflow

Para visualizar os logs do PostgreSQL:

docker compose logs -f postgres
6. Acesse a API

Após os containers iniciarem:

http://localhost:8080/clubes/ui/listar

📄 Documentação da API

Após iniciar a aplicação, acesse o Swagger em:

http://localhost:8080/swagger-ui/index.html

💾 Banco de Dados

Durante o desenvolvimento, o projeto utiliza o banco de dados POSTGRESQL.

📈 Evolução do Projeto

O FutFlow é um projeto em evolução.

Novas funcionalidades serão implementadas conforme o aprendizado de novas tecnologias, tornando a aplicação cada vez mais próxima de um sistema utilizado em ambientes reais.

🤝 Contribuições

Sugestões, melhorias e feedbacks são sempre bem-vindos.

Caso encontre algum problema ou tenha alguma ideia, fique à vontade para abrir entrar em contato

👨‍💻 Desenvolvedor

Antonio Carlos de Souza Junior

Desenvolvedor Backend Java com foco em Spring Boot, APIs REST e boas práticas de arquitetura de software.

GitHub: 
https://github.com/AntonioCLJRR
LinkedIn: https://www.linkedin.com/in/acsjunior
⭐ Se este projeto foi útil...

Se este projeto foi útil ou te ajudou de alguma forma, deixe uma ⭐ no repositório.

Isso incentiva a evolução do projeto e ajuda outras pessoas a encontrá-lo.
