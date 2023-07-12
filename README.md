# API CRUD de Funcionários

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![SpringBoot](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

O projeto é usado pelas seguintes tecnologias **Java 17, Maven, Spring Boot 3, JPA, Hibernate, MySQL e Flyway Migrations.**

## Configuração de Ambiente

1. Clonar o repositório com o seguinte comando abaixo:

```bash
git clone https://github.com/philippemaia/api_crud_funcionarios.git
```

2. Instalar as dependências do maven no arquivo pom.xml

3. Instalar o banco de dados [MySQL](https://dev.mysql.com/downloads/) as tabelas são gerenciadas através de Flyway Migrations.

## Uso da API

Iniciar a aplicação com Maven e a API poderá ser acessada pela url http://localhost:8080

## Endpoints da API
A API possui os seguintes endpoints abiaxo:

```markdown
GET /funcionarios - Retorna uma lista de funcionários desde que esteja com ativo true com paginação.

POST /funcionarios - Cadastra um novo funcionário.

PUT /funcionarios - Atualiza um funcionário.

DELETE /funcionarios/{id} - Ocorre uma exclusão lógica de um produto através do id, ou seja, inativa um funcionário.
```
