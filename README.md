# Login and Registration System using JSP, Servlets, and MySQL

## 📌 Overview
This project is a **Login and Registration System** built using **JSP, Servlets, and MySQL**, featuring **secure user authentication**, **dynamic error handling**, and a **modern, user-friendly interface**. The system allows users to **register, log in, update their profiles, and perform CRUD operations** on their data.

## 🚀 Features
- **Secure User Authentication** (Password Hashing & Validation)
- **Login & Registration with Form Validation**
- **Added **email verification** during registration.
- **Dynamic Error Handling for Invalid Inputs**
- **CRUD Operations** (Create, Read, Update, Delete)
- **User Interface with HTML & CSS** (Modern Design)
- **Database Integration with MySQL**

## 🛠️ Tech Stack
- **Frontend:** HTML, CSS
- **Backend:** JSP, Servlets
- **Database:** MySQL
- **Server:** Apache Tomcat
- **Tools:** JDBC, Git, GitHub


## ⚙️ Setup & Installation
### 1️⃣ Clone the Repository
```bash
git clone https://github.com/sonalijadhav8140/Student_Registration_Module_With_CRUD_Op_Using_Jsp_Servlet_Mysql.git
```
### 2️⃣ Set Up the Database
1. Open MySQL and create a database:
   ```sql
   CREATE DATABASE user_management;
   ```
2. Import `users.sql` into the database.
3. Update database credentials in `DBConnection.java`:
   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/user_management";
   private static final String USER = "your_username";
   private static final String PASSWORD = "your_password";
   ```

### 3️⃣ Deploy on Tomcat
1. Add the project to **Apache Tomcat**.
2. Start the server.
3. Access the application:
   ```
   http://localhost:8080/Student_Registration_Module_With_CRUD_Op_Using_Jsp_Servlet_Mysql/login.jsp
   ```

## 🎯 Future Enhancements

- Implement **password reset functionality**.
- Use **Hibernate/JPA** instead of JDBC for better ORM.
- Enhance UI with Bootstrap for better responsiveness.

## 📩 Contact
- **GitHub:** [sonalijadhav8140](https://github.com/sonalijadhav8140)
- **Email:** sonalijadhav6572@gmail.com

