# 📚 BookShelf Manager

BookShelf Manager is a full-stack Spring Boot web application designed for managing a collection of books. It allows users to perform **Create**, **Read**, **Update**, and **Delete (CRUD)** operations seamlessly through an intuitive and responsive UI built with **Thymeleaf** and **Bootstrap**.

---

## 🚀 Features

- 🔍 View all books in a structured layout  
- ➕ Add new books with validation  
- ✏️ Edit existing book details  
- 🗑️ Delete books from the list  
- 🖥️ Responsive and modern UI with Bootstrap  
- 🧠 Clean MVC Architecture using Spring Boot + Thymeleaf  

---

## 🛠️ Tech Stack

| Layer         | Technology        |
|---------------|-------------------|
| Backend       | Spring Boot       |
| Frontend      | Thymeleaf, HTML5, CSS3, Bootstrap 4 |
| Build Tool    | Maven             |
| Template Engine | Thymeleaf       |
| Language      | Java              |

---

## 🧩 Project Structure

book-shelf-manager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── bookmanager/
│   │   │               ├── controller/
│   │   │               │   └── BookController.java
│   │   │               ├── entity/
│   │   │               │   └── Book.java
│   │   │               ├── repository/
│   │   │               │   └── BookRepository.java
│   │   │               └── BookManagerApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   └── css/
│   │       │       └── styles.css (optional)
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   ├── addBook.html
│   │       │   └── editBook.html
│   │       └── application.properties
├── .gitignore
├── pom.xml
└── README.md


---

## 🚦 Getting Started

```bash

 1️⃣ Clone the Repository


git clone https://github.com/BikrAm2003/book-shelf-manager.git
cd book-shelf-manager 

 2️⃣ Build the Project
bash
Copy
Edit
mvn clean install
3️⃣ Run the Application
bash
Copy
Edit
mvn spring-boot:run
4️⃣ Visit in Browser
arduino
Copy
Edit
http://localhost:8080
