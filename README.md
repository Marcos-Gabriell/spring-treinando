# Projeto Básico em Java com Spring Boot, MySQL, Lombok e Postman

Este é um projeto simples em Java usando Spring Boot, MySQL, Lombok e Postman. O projeto contém endpoints para cadastrar um usuário e realizar login.

## Configuração do Ambiente

Certifique-se de ter as seguintes ferramentas instaladas:

- **Java JDK 8 ou superior**
- **Spring Boot**
- **MySQL**
- **Lombok** (utilizado para reduzir a verbosidade do código)
- **Postman** (para testar os endpoints)

## Endpoints

### 1. Cadastrar Usuário
- **Endpoint:** `POST /api/usuarios/cadastro`
- **Descrição:** Cria um novo usuário com as informações fornecidas.
- **Resposta Sucesso:** Status HTTP 200 OK com a mensagem "Usuário cadastrado com sucesso".
- **Resposta Erro:** Status HTTP 500 Internal Server Error com a mensagem "Erro ao cadastrar usuário".

### 2. Excluir Usuário por ID
- **Endpoint:** `DELETE /usuario/{id}`
- **Descrição:** Exclui o usuário com o ID especificado.
- **Exemplo de Uso:** `/usuario/1`
- **Resposta Sucesso:** Status HTTP 200 OK com a mensagem "Deletado com sucesso!".
- **Resposta Erro:** Status HTTP 404 Not Found se o usuário não for encontrado.


## Configuração do Banco de Dados

1. Crie um banco de dados no MySQL para o projeto.
2. Configure as informações do banco de dados no arquivo `application.properties` em `src/main/resources`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
****