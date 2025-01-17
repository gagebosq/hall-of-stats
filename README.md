<p align="center">
  <img src="https://github.com/user-attachments/assets/2c62a0e8-00cc-42c0-9d44-14e1290341d2" alt="logo" width="500" />
</p>

# Hall of Stats Backend

The backend for Hall of Stats is a RESTful API built using Spring Boot and PostgreSQL. It serves as the data provider for the Hall of Stats application, offering endpoints for accessing MLB statistics on hitters, pitchers, and teams spanning over the past two centuries.

## Features

- **RESTful API**:
  - Endpoints to retrieve, search, and filter data for hitters, pitchers, and teams.
- **Data Management**:
  - Integrates with PostgreSQL for robust and efficient data storage.
- **Search Functionality**:
  - Query hitters by `player_name`, pitchers by `player_name`, and teams by `team_name`, with more functions to queries to come.
- **Scalability**:
  - Designed for handling large datasets with millions of records.

---

## Stack

### Backend
- **Language**: Java
- **Framework**: Spring Boot
- **Database**: PostgreSQL
- **Build Tool**: Maven
- **Testing**: JUnit

---

## Project Structure

```plaintext
src
├── main
│   ├── java/com/hos/hall_of_stats
│   │   ├── controller  # Controllers for handling API requests
│   │   ├── entity      # JPA entities mapping to database tables
│   │   ├── repository  # Interfaces for database operations
│   │   └── service     # Business logic and data processing
│   ├── resources
│   │   ├── application.properties  # Configuration file for Spring Boot
│   │   └── data.sql                 # Optional seed data for development
└── test/java/com/hos/hall_of_stats  # Unit tests for backend components
```

---

## Installation

### Prerequisites
- Java 17 or later
- PostgreSQL
- Maven

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/hall-of-stats-backend.git
   cd hall-of-stats-backend
   ```

2. Configure the PostgreSQL database:
   - Create a new PostgreSQL database.
   - Update the `application.properties` file with your database credentials:
     ```properties
     spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
     ```

3. Build and run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Access the API at:
   ```
   http://localhost:8080/api
   ```

---

## API Endpoints

### Hitters
- **Get all hitters**:
  ```http
  GET /api/hitters
  ```

- **Get hitter by name**:
  ```http
  GET /api/hitters/{player_name}
  ```

### Pitchers
- **Get all pitchers**:
  ```http
  GET /api/pitchers
  ```

- **Get pitcher by name**:
  ```http
  GET /api/pitchers/{player_name}
  ```

### Teams
- **Get all teams**:
  ```http
  GET /api/teams
  ```

- **Get team by name**:
  ```http
  GET /api/teams/{team_name}


## Deployment

### Local Deployment
1. Build the application:
   ```bash
   ./mvnw clean package
   ```
2. Run the jar file:
   ```bash
   java -jar target/hall-of-stats-backend-0.0.1-SNAPSHOT.jar
   ```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Acknowledgments

- Spring Boot for simplifying backend development.
- PostgreSQL for robust database support.
- Open-source contributors like Kaggle and the MLB community.

