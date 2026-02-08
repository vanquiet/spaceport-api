Spaceport API is a backend application developed using Spring Boot as part of the endterm project.

The purpose of this project is to demonstrate how a RESTful API works with a relational database using modern Java technologies. The application provides functionality to manage pilots and ships in a spaceport system.

The project is built with Java and Maven and uses Spring Boot as the main framework. Spring Data JPA is used for interaction with the PostgreSQL database. The database name used in this project is spaceport_db.

The API supports basic CRUD operations. Data can be retrieved using GET requests and added using POST requests. POST requests are tested and executed using Postman. All responses are returned in JSON format.

The application runs locally on port 8080 and can be accessed via a web browser or API testing tools. Hibernate is used as the ORM layer, and database tables are automatically synchronized with entity classes.

This project follows a layered architecture, including controllers, services, repositories, and entities. It is designed to be simple, clear, and suitable for academic demonstration of backend development concepts.
