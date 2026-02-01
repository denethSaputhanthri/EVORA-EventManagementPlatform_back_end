# ⚙️ EVORA – Event Management Platform (Backend)

The **EVORA Backend** powers the core functionality of the EVORA Event Management Platform.  
It provides secure, scalable, and structured APIs to manage events, users, and platform operations.

This repository focuses on **business logic, data management, and API communication**, acting as the backbone for the EVORA front-end application.

---

## 🚀 Project Overview

The backend is responsible for:
- Managing event data
- Handling user interactions
- Providing RESTful APIs for the front end
- Ensuring data consistency and security

It is designed following clean architecture principles to support future expansion and integration.

---

## ✨ Key Features

- 🔐 **User Management** – Authentication & authorization ready
- 🎫 **Event Management** – Create, update, delete, and retrieve events
- 📡 **RESTful APIs** – Well-structured endpoints for front-end integration
- 🗄️ **Database Integration** – Persistent data storage
- 🧩 **Scalable Architecture** – Modular and maintainable design

---

## 🧠 Tech Stack

| Category | Technology |
|--------|-----------|
| Language | Java |
| Framework | Spring Boot |
| API Style | REST |
| Database | MySQL / PostgreSQL *(as configured)* |
| ORM | JPA / Hibernate |
| Build Tool | Maven |
| Version Control | Git & GitHub |

---

## 🗂️ Project Structure

src/
├── controller/ # REST API controllers
├── service/ # Business logic
├── repository/ # Data access layer
├── model / entity # Database entities
├── dto/ # Data Transfer Objects
├── config/ # Configuration files
└── EvoraApplication.java # Application entry point


---

## 🛠️ Getting Started

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/denethSaputhanthri/EVORA-EventManagementPlatform_back_end.git
```

### 2️⃣ Configure the Database
Update application.properties or application.yml:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/evora_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3️⃣ Build & Run the Application
``` bash
mvn clean install
mvn spring-boot:run
```

The backend server will start on:
```bash
http://localhost:8080
```

## 🔗 API Integration

The backend is designed to seamlessly integrate with the EVORA Front End.
```
http://localhost:8080/swagger-ui/index.html#/
```

## 🎯 Learning Outcomes

- Building RESTful APIs using Spring Boot
- Layered backend architecture
- Database design and ORM mapping
- Backend–frontend integration
- Clean and maintainable code practices

## 🔮 Future Enhancements

- JWT-based authentication
- Role-based access control (Admin / Organizer / User)
- API documentation with Swagger
- Cloud deployment
- Performance & security optimizations

## 👥 Contributors
- Shanuka Upendra
- Deneth Saputhanthri

## ⭐ Support
If you find this project useful, please give it a star ⭐ on GitHub!

