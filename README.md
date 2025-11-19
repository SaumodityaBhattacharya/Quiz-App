# Quiz App (Spring Boot + JWT Authentication)

A backend Quiz Application built using **Spring Boot**, following a clean REST API architecture with secure **JWT-based authentication**.  
Users can register, log in, and access protected quiz resources using JWT tokens.  
Suitable for learning Spring Security, JWT, and building scalable microservice-style APIs.

---

## 🚀 Features

### 🔐 Authentication
- User registration (`/auth/register`)
- User login with JWT token generation (`/auth/login`)
- Password encryption using **BCrypt**
- Stateless authentication using **JWT**
- Custom `JwtAuthenticationFilter`
- Spring Security config with role-based route authorization

### 📝 Quiz Management
- Add questions  
- Fetch questions  
- Evaluate quiz submissions  
- Dedicated QuestionController and Service layer

### 🧱 Project Layers
- **Controller Layer** → Handles API routes  
- **Service Layer** → Contains business logic  
- **Repository Layer** → Database interactions using Spring Data JPA  
- **Models/Entities** → User, Roles, Questions, etc.

### 🛠️ Tech Stack
- Java 17+
- Spring Boot 3.5.x
- Spring Security 6
- JWT (JSON Web Token)
- Maven
- JPA + Hibernate
- H2/MySQL (whichever you configure)

---

## 📂 Project Structure

