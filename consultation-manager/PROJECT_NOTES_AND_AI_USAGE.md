# Consultation Manager

## Overview
Consultation Manager is a Spring Boot based REST API application developed to manage clients and their consultation records.

## Tech Stack
- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- Maven
- Swagger OpenAPI

## Features
- User Registration
- User Login
- Client CRUD Operations
- Consultation CRUD Operations
- Consultation History by Client
- Swagger API Documentation

## Database
MySQL database is used for persistent storage.

## API Modules
1. Authentication Module
2. Client Management Module
3. Consultation Management Module

## API Endpoints

### Authentication
- POST /api/auth/register
- POST /api/auth/login

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

## Future Improvements
- JWT Authentication
- Role Based Access Control
- Cloud Deployment
- Docker Support
- Pagination and Filtering

---

# AI Usage Declaration

## AI Tools Used
AI tools were used for:

- Understanding Spring Boot concepts
- Generating boilerplate code
- Debugging compilation errors
- API design guidance
- README preparation
- API testing assistance

## Declaration

All generated suggestions were reviewed, modified where required, integrated manually, and tested by me. The final implementation, project setup, debugging, database integration, API testing, GitHub management, and submission preparation were completed by me.

**Developer:** Puneet Goyal

**Project:** Consultation Manager

**Date:** June 2026