# **CollabSprint**

**CollabSprint** é uma aplicação de **Gestão de Projetos Colaborativos**, projetada para permitir que equipes planejem, colaborem e gerenciem seus projetos de forma eficiente. A aplicação oferece funcionalidades para criar e gerenciar tarefas, acompanhar o progresso dos projetos e garantir uma colaboração fluida entre os membros da equipe.

Este repositório contém a **API Backend** desenvolvida em **Spring Boot** com **OAuth2**, **JWT** e **Spring Data JPA**, e o **Frontend** em **ReactJS** para uma experiência de usuário dinâmica e moderna.

## **Tecnologias Utilizadas**

- **Backend**:

  - **Spring Boot** (Java 21)
  - **Spring Security** (OAuth2 + JWT)
  - **Spring Data JPA**
  - **PostgreSQL** (Banco de Dados)
  - **H2 Database** (Para testes locais)
  - **Spring Boot Actuator** (Monitoramento)
  - **Spring Boot Starter Web** (API REST)
  - **Spring Boot Starter Security** (Segurança)

- **Frontend**:

  - **ReactJS**
  - **Redux** (Para gerenciamento de estado)
  - **Axios** (Para requisições HTTP)
  - **Material UI** (Componentes de UI)

- **Autenticação**:

  - **OAuth2** para login social (ex: Google, GitHub) e autenticação baseada em **JWT**.

- **Testes**:
  - **JUnit** e **Mockito** (Testes automatizados)
  - **Cypress** (Testes de UI)

## **Funcionalidades**

- **Gestão de Projetos**:

  - Criação de projetos.
  - Atribuição de membros a projetos.
  - Definição de metas e prazos.

- **Gestão de Tarefas**:

  - Criação, edição e conclusão de tarefas.
  - Atribuição de responsáveis pelas tarefas.
  - Acompanhamento de progresso.

- **Integração de Usuários**:

  - Login com **OAuth2**.
  - Autenticação baseada em **JWT**.

- **Interface de Usuário**:
  - Interface responsiva com **ReactJS** e **Material UI**.
  - Gerenciamento de estado utilizando **Redux**.
  - Interações fluídas e intuitivas.

## **Endpoints da API**

Aqui estão alguns dos principais **endpoints** da API:

- **POST /api/auth/login**: Realiza o login via **OAuth2**.
- **GET /api/projects**: Retorna todos os projetos.
- **POST /api/projects**: Cria um novo projeto.
- **GET /api/projects/{id}**: Retorna detalhes de um projeto específico.
- **GET /api/tasks**: Retorna todas as tarefas.
- **POST /api/tasks**: Cria uma nova tarefa.
- **PUT /api/tasks/{id}**: Atualiza uma tarefa existente.
- **DELETE /api/tasks/{id}**: Exclui uma tarefa.

## **Contribuindo**

Sinta-se à vontade para contribuir com o projeto! Se você tiver alguma sugestão ou melhoria, fique à vontade para abrir uma **issue** ou **pull request**.

## **Licença**

Este projeto está licenciado sob a **GPLv3** - veja o arquivo [LICENSE](./LICENSE.md) para mais detalhes.

## **Contato**

Se você tiver alguma dúvida ou precisar de ajuda, entre em contato comigo em: [soupaulodev.com.br](https://www.soupaulodev.com.br).
