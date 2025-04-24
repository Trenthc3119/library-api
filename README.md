# Library Management API

This is a simple RESTful API for managing books, built with **Spring Boot**, **JPA**, and **H2 in-memory database**.

## Features

- ✅ Add new books
- ✅ View all books
- 🚧 More coming soon (update, delete, search...)

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (in-memory)
- Postman for API testing

## Getting Started

### Run Locally

1. Clone the repository
```bash
git clone https://github.com/Trenthc3119/library-api.git
```

2. Open the project in IntelliJ IDEA or your preferred IDE

3. Run the main class:
```
com.yanch.library.LibraryApplication
```

4. Test APIs using Postman:
- `POST /books` → Add a book
- `GET /books` → List all books

### Sample Book JSON

```json
{
  "name": "三体",
  "author": "刘慈欣",
  "isbn": "9787536692930",
  "borrowed": false
}
```

---

## To Do

- [ ] Add GET by ID
- [ ] Add update/delete endpoints
- [ ] Add Swagger documentation
- [ ] Deploy to cloud

---

## License

MIT
