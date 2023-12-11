# Projeto Básico em Java com Spring Boot, MySQL, Lombok e Postman

Este é um projeto simples em Java usando Spring Boot, MySQL, Lombok e Postman. O projeto contém endpoints para cadastrar um usuário e realizar login.

## Configuração do Ambiente

Certifique-se de ter as seguintes ferramentas instaladas:

- **Java JDK 8 ou superior**
- **Spring Boot**
- **MySQL**
- **Lombok** (utilizado para reduzir a verbosidade do código)
- **Postman** (para testar os endpoints)

## Configuração do Banco de Dados

1. Crie um banco de dados no MySQL para o projeto.
2. Configure as informações do banco de dados no arquivo `application.properties` em `src/main/resources`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
****
