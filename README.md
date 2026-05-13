# Tomcat Servlet Login Application

## Overview
This project demonstrates a basic Java Servlet-based web application deployed on Apache Tomcat.  
The application implements a simple login system with progressive validation rules using Servlets, JSP, and HTML.

---

# Technologies Used

- Java
- Java Servlets
- JSP (Java Server Pages)
- Apache Tomcat 9
- Maven
- Git & GitFlow
- IntelliJ IDEA

---

# Project Structure

```text
src
 └ main
    ├ java
    │   └ com.bridgelabz
    │        ├ HelloServlet.java
    │        └ LoginServlet.java
    │
    └ webapp
        ├ login.html
        ├ LoginSuccess.jsp
        ├ index.jsp
        └ WEB-INF
            └ web.xml
```

---

# Use Cases Implemented

## UC1 – First Servlet

### Objective
Create a basic servlet to display a simple message through the browser.

### Description
A servlet named `HelloServlet` is implemented to demonstrate the working of Java Servlets in Apache Tomcat.

### Example URL

```text
http://localhost:8080/FirstServletProject/hello
```

### Outcome
- Servlet executes successfully
- Message is displayed in browser
- Basic Tomcat deployment is verified

---

## UC2 – Simple Login with Predefined User

### Objective
Implement a simple login system using Servlets.

### Description
A login page (`login.html`) is created where the user enters:
- Username
- Password

The credentials are validated inside `LoginServlet`.

### Valid Credentials

```text
Username : USER
Password : BridgeLabz
```

### Outcome
- User credentials are validated
- Successful login redirects to `LoginSuccess.jsp`
- Invalid login displays an error message

---

## UC3 – Name Validation

### Objective
Validate the username based on predefined rules.

### Description
The username must satisfy the following conditions:
- Must start with a capital letter
- Must contain a minimum of 3 characters

### Outcome
- Invalid usernames are rejected
- Proper validation messages are displayed
- Input quality is improved

---

## UC4 – Password Validation

### Objective
Validate password strength using multiple conditions.

### Description
The password must satisfy the following rules:
- Minimum 8 characters
- At least 1 uppercase letter
- At least 1 numeric digit
- Exactly 1 special character

---

# Features

- Servlet-based web application
- User login authentication
- Username validation
- Password validation
- JSP integration
- Tomcat deployment support
- Maven project structure

---

# Future Enhancements

- Database integration using MySQL
- Session management
- User registration module
- Forgot password functionality
- Responsive UI design
- Spring Boot migration

---

# Author

**Kaviya S P**
