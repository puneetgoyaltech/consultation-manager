# Consultation Manager

## Overview

Consultation Manager is a Spring Boot based application for managing clients and consultations.

## Tech Stack

* Java 17
* Spring Boot
* Spring Security
* JWT Authentication
* MySQL
* Swagger UI
* Maven

## Features

* User Registration
* User Login
* JWT Authentication
* Client CRUD Operations
* Consultation CRUD Operations
* Consultation History by Client
* Swagger API Documentation

## API Endpoints

### Authentication

* POST /auth/register
* POST /auth/login

### Clients

* POST /api/clients
* GET /api/clients
* GET /api/clients/{id}
* PUT /api/clients/{id}
* DELETE /api/clients/{id}

### Consultations

* POST /api/consultations
* GET /api/consultations
* GET /api/consultations/{id}
* PUT /api/consultations/{id}
* DELETE /api/consultations/{id}
* GET /api/consultations/client/{clientId}

## Database

MySQL

## Swagger

http://localhost:8080/swagger-ui/index.html

## Author

Puneet Goyal
