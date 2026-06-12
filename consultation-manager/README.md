# Consultation Manager

Spring Boot + MySQL based Consultation Management System.

## Features

- JWT Authentication
- User Registration & Login
- Client CRUD Operations
- Consultation CRUD Operations
- Consultation History by Client
- Swagger API Documentation
- MySQL Database Integration

## Tech Stack

- Java 17
- Spring Boot
- Spring Security
- JWT
- MySQL
- Spring Data JPA
- Swagger OpenAPI

## API Endpoints

### Auth
- POST /auth/register
- POST /auth/login

### Clients
- POST /api/clients
- GET /api/clients
- GET /api/clients/{id}
- PUT /api/clients/{id}
- DELETE /api/clients/{id}

### Consultations
- POST /api/consultations
- GET /api/consultations
- GET /api/consultations/{id}
- PUT /api/consultations/{id}
- DELETE /api/consultations/{id}
- GET /api/consultations/client/{clientId}

## Run Project

1. Configure MySQL
2. Update application.properties
3. Run:

mvn spring-boot:run

## Swagger

http://localhost:8080/swagger-ui/index.html
