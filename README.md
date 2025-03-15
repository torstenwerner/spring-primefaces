# Spring Boot PrimeFaces Demo

This is a demo application showcasing the integration of Spring Boot with PrimeFaces using JoinFaces. The application provides a simple web interface with PrimeFaces components.

## Technology Stack

- Java 21
- Spring Boot 3.2.3
- PrimeFaces 13.0.0 (via JoinFaces 5.2.2)
- Gradle 8.6

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── primefacesdemo/
│   │               ├── PrimefacesDemoApplication.java
│   │               └── HelloBean.java
│   └── resources/
│       ├── META-INF/
│       │   └── resources/
│       │       └── index.xhtml
│       └── application.properties
```

## Architecture

The application follows a standard JSF web application architecture with Spring Boot integration:

1. **Spring Boot Application**: The main application class (`PrimefacesDemoApplication.java`) bootstraps the Spring Boot application.

2. **Backing Beans**: JSF backing beans (like `HelloBean.java`) handle the application logic and state management. They are annotated with `@Named` for CDI integration and `@ViewScoped` for session management.

3. **Views**: JSF views (`.xhtml` files) define the user interface using PrimeFaces components. They are located in the `META-INF/resources` directory.

4. **JoinFaces**: Provides seamless integration between Spring Boot and JSF/PrimeFaces.

## Getting Started

### Prerequisites

- Java 21 JDK installed
- Gradle installed (or use the included Gradle wrapper)

### Running the Application

1. Clone this repository:
   ```bash
   git clone [repository-url]
   cd spring-primefaces
   ```

2. Build the project:
   ```bash
   ./gradlew build
   ```

3. Run the application:
   ```bash
   ./gradlew bootRun
   ```

4. Access the application:
   Open your web browser and navigate to `http://localhost:8080`

## Features

- Modern UI using PrimeFaces components
- Responsive layout
- Simple greeting functionality demonstrating JSF backing bean integration
- Hot reload support during development (Spring Boot DevTools)

## Development

The project uses Spring Boot DevTools for development, which provides:
- Automatic restart when code changes
- Live reload for browser refresh
- Enhanced development-time experience

## Contributing

Feel free to submit issues and enhancement requests! 