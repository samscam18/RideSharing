# RideSwift - Ride-Sharing Application Backend

This project is the backend server for **RideSwift**, a conceptual ride-sharing application similar to Uber or Ola. It is built with Java and the Spring Boot framework, focusing on clean Object-Oriented principles and RESTful API design.

The system handles the core functionalities of a ride-sharing service, including registering drivers and riders, and processing ride requests by matching available drivers to riders.

---

## Technologies Used

* **Java 17**: The core programming language.
* **Spring Boot 3**: Framework for building the web application and REST APIs.
* **Spring Data JPA**: For database interaction and object-relational mapping (ORM).
* **H2 Database**: An in-memory database, perfect for development and testing.
* **Maven**: For project build and dependency management.

---

## Project Setup and How to Run

### Prerequisites

* Java Development Kit (JDK) 17 or higher.
* Apache Maven.
* An IDE like IntelliJ IDEA or VS Code.
* An API testing tool like [Postman](https://www.postman.com/downloads/).

### Running the Application

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-url>
    cd ridesharing
    ```

2.  **Build the project:**
    Use Maven to build the project and download all dependencies.
    ```bash
    mvn clean install
    ```

3.  **Run the application:**
    You can run the application directly from your IDE by running the `main` method in `RidesharingApplication.java`, or by using the following Maven command:
    ```bash
    mvn spring-boot:run
    ```

The server will start on `http://localhost:8080`.

---

## API Endpoints

The following are the core API endpoints available.

### 1. Register a New Driver

Registers a new driver and their vehicle in the system.

* **URL:** `/api/drivers/register`
* **Method:** `POST`
* **Body (JSON):**
    ```json
    {
        "name": "Ravi Kumar",
        "email": "ravi@driver.com",
        "vehicle": {
            "model": "Toyota Etios",
            "licencePlate": "KA-01-AB-1234",
            "type": "Sedan"
        }
    }
    ```
* **Success Response (200 OK):** Returns the created driver object with its new `id`.

### 2. Register a New Rider

Registers a new rider in the system.

* **URL:** `/api/riders/register`
* **Method:** `POST`
* **Body (JSON):**
    ```json
    {
      "name": "Priya Sharma",
      "email": "priya@example.com"
    }
    ```
* **Success Response (200 OK):** Returns the created rider object with its new `id`.

### 3. Request a Ride

A registered rider requests a new ride. The system finds the first available driver and assigns them to the ride.

* **URL:** `/api/rides/request`
* **Method:** `POST`
* **Body (JSON):**
    ```json
    {
      "riderId": 1,
      "pickupLocation": "Kempegowda International Airport"
    }
    ```
* **Success Response (200 OK):** Returns the newly created `Ride` object, including the details of the assigned `driver` and `rider`.
* **Error Response (500 Internal Server Error):**
    * If the `riderId` is not found.
    * If there are no available drivers.

---
