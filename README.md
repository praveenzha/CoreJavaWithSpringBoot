Employee Management System
Welcome to the Employee Management System! This is a simple Spring Boot project designed for beginners to help you get started with Spring Boot, JPA (Java Persistence API), and basic Spring Security. The application demonstrates how to connect a Spring Boot application to a MySQL database and secure the API endpoints.

Features
Employee Listing: Fetch and display a list of employees from a MySQL database.
Database Integration: Uses JPA to interact with a MySQL database.
Basic Security: Implements basic Spring Security to secure API endpoints.
Prerequisites
To run this project, you'll need:

Java Development Kit (JDK) 8 or later.
Maven (for dependency management and building the project).
MySQL Database installed locally.
Getting Started
Follow these steps to set up and run the application:

1. Clone the Repository
[git clone  https://github.com/praveenzha/CoreJavaWithSpringBoot]

cd employee-management-system

3. Configure the Database
Ensure MySQL is installed and running on your local system. Create a new database named employee_db (or any name you prefer).

Update the application.properties file with your MySQL database credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password

# Hibernate Dialect
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

# Show SQL
spring.jpa.show-sql=true

3. Build and Run the Application
Ensure you have Maven installed. Navigate to the project directory and run the following command to build and start the application:

mvn spring-boot:run

4. Access the Application
Once the application is running, you can access the employee list API endpoint at:

 http://localhost:8080/employees/list

 5. Security Configuration
By default, the application uses basic HTTP authentication to secure the API endpoints. The credentials are defined in the SecurityConfig class. You can customize these credentials or the security configuration as needed.

Project Structure
src/main/java/com/example/employee: Contains the main application code.

Employee.java: JPA entity representing an employee.
EmployeeRepository.java: JPA repository for CRUD operations on employees.
EmployeeService.java: Service class for business logic related to employees.
EmployeeController.java: REST controller handling API requests for employees.
src/main/resources/application.properties: Configuration file for database and security settings.

pom.xml: Maven configuration file for managing dependencies.

Troubleshooting
Database Connection Issues: Ensure MySQL is running and the database credentials in application.properties are correct.
Dependency Errors: Make sure all dependencies are correctly defined in pom.xml and run mvn clean install to resolve them.


. Security Configuration
Basic Spring Security is implemented to secure the API endpoints. Here is the detailed configuration:

Security Configuration
The SecurityConfig class configures in-memory authentication with three users, each having different roles. This class is located in the com.example.springboot.cruddemo.config package.


Explanation:

@Configuration: Indicates that this class contains Spring configuration.
@Bean: Declares the InMemoryUserDetailsManager bean, which is used to provide in-memory user details.
User.builder(): Creates UserDetails objects for each user with specified username, password, and roles.
{noop}: Indicates that the password is stored in plain text. In production, consider using a password encoder like BCryptPasswordEncoder.
The application uses HTTP Basic Authentication. Users must provide one of the defined usernames and passwords to access the secured API endpoints.

Project Structure
src/main/java/com/example/employee: Contains the main application code.

Employee.java: JPA entity representing an employee.
EmployeeRepository.java: JPA repository for CRUD operations on employees.
EmployeeService.java: Service class for business logic related to employees.
EmployeeController.java: REST controller handling API requests for employees.
SecurityConfig.java: Configuration class for basic Spring Security.
src/main/resources/application.properties: Configuration file for database and security settings.

pom.xml: Maven configuration file for managing dependencies.

![image](https://github.com/user-attachments/assets/ec001537-80bd-464b-a9a7-8733e6cb557a)

![image](https://github.com/user-attachments/assets/9245812c-66c6-4da1-8c38-e3275541e61a)

![image](https://github.com/user-attachments/assets/f1001eb3-b6ac-4cf8-bd52-e6dd4b24a698)

![image](https://github.com/user-attachments/assets/c6841146-c107-4da5-9c30-6bf6b72a9679)



 
