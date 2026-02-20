#   DeliveryTech API
API RESTful desenvolvida com Spring Boot 3 e Java 21 para gerenciar um sistema de delivery completo. Este projeto simula as funcionalidades principais de plataformas como iFood e Uber Eats, incluindo autenticação JWT, cache, monitoramento, CI/CD e muito mais.

##Como Rodar o Projeto?

---

### Pré-requisitos

- Java JDK 21
- Maven 3.8+
- Git
- Docker e Docker Compose (opcional, para execução containerizada)
- Redis (para cache, caso rode fora do Docker)

### Instalação e Execução

1º Clone o repositório:
```bash
gitclone https://github.com/LehMoraes08/deliverytech
cd deliverytech
```

2º Instale as partes:
```bash
mvn clean install
```

3º Execute o projeto (via Maven ou via Docker):

###  Via Maven
```bash
git clone https://github.com/seuusuario/delivery-api.git
cd delivery-api
./mvnw spring-boot:run
```

###  Via Docker

```bash
docker-compose up --build
```

---

A documentação completa da API está disponível via Swagger UI. Acesse:
```bash
http://localhost:8080/swagger-ui.html
```


## Funcionalidades

- Cadastro e login de usuários com JWT
- Controle de acesso por perfis (CLIENTE, RESTAURANTE, ADMIN, ENTREGADOR)
- Cadastro de clientes, restaurantes, produtos e pedidos
- Listagem de produtos por restaurante
- Criação de pedidos com itens e cálculo do total
- Atualização de status de pedido
- Cache com Spring Cache
- Testes automatizados com JUnit e Mockito
- Documentação com Swagger/OpenAPI
- Banco de dados em memória com H2
- Containerização com Docker e orquestração com Docker Compose
- Pipeline CI/CD com GitHub Actions (sugestão)

---


## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.2.x
- Spring Data JPA
- Spring Security + JWT
- Spring Validation
- H2 Database
- SpringDoc OpenAPI (Swagger)
- Docker + Docker Compose
- JUnit 5 + Mockito

---

### Principais fluxos:

**Autenticação e Autorização:** Registro, login com geração de JWT e autorização baseada em roles.

**Fluxo de Pedidos:** Cliente faz o pedido, restaurante recebe e processa, atualização de status e entrega ao cliente.

**Gestão de Restaurante:** Cadastro de produtos, gerenciamento de cardápio e controle de pedidos.


## Endpoints de Teste

- `POST /api/auth/register`
- `POST /api/auth/login`
- `GET /api/clientes`
- `POST /api/pedidos`

---