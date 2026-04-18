# Nested List Parser API (Spring Boot)

## 🚀 Overview

This project is a RESTful API built with Java and Spring Boot that parses nested list expressions into structured JSON.
It demonstrates custom parsing logic, tree-based data modeling, and clean backend architecture.

---

## 🧠 Features

* Parse arbitrarily nested list strings (e.g. `[1 [2 3] [4 5]]`)
* Convert input into hierarchical tree structures
* Return JSON-formatted output
* Stack-based parsing for correct nesting
* Recursive traversal of tree data
* Clean separation of concerns (Controller, Service, Parser)

---

## 🏗️ Architecture

The project follows a layered backend architecture:

* **Controller Layer** → Handles HTTP requests
* **Service Layer** → Business logic and transformation
* **Parser Layer** → Core parsing algorithm
* **DTO Layer** → Request/response models

---

## 🧩 Design Pattern

This project implements the **Composite Design Pattern**:

* `ListComponent` → Common interface
* `Item` → Leaf node (integer values)
* `ListComposite` → Composite node (nested lists)

This allows uniform handling of both individual elements and nested collections.

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* REST APIs
* JSON
* Maven
* Object-Oriented Programming (OOP)
* Data Structures (Stack, Tree)

---

## 📡 API Endpoint

### POST `/api/parse`

#### Request Body

```json
{
  "input": "[1 [2 3] [4 5]]"
}
```

#### Response

```json
{
  "result": [1, [2, 3], [4, 5]]
}
```

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/nested-list-parser-api.git
cd nested-list-parser-api
```

### 2. Build the project

```bash
mvn clean install
```

### 3. Run the application

```bash
mvn spring-boot:run
```

### 4. Test the API

Using curl:

```bash
curl -X POST http://localhost:8080/api/parse \
-H "Content-Type: application/json" \
-d '{"input":"[1 [2 3] [4 5]]"}'
```

Or use Postman.

---

## 🔍 Example

Input:

```
[1 [2 3] [4 5] [6 4]]
```

Output:

```
[1, [2, 3], [4, 5], [6, 4]]
```

---

## 🚧 Future Improvements

* Input validation and error handling
* Support for negative numbers and decimals
* Unit testing with JUnit and Mockito
* Swagger/OpenAPI documentation
* Docker containerization
* Deployment to cloud platforms (Render, AWS, etc.)

---

## 💼 Resume Highlight

Developed a Spring Boot REST API that parses nested list expressions into structured JSON using a custom stack-based parser and the Composite Design Pattern.
