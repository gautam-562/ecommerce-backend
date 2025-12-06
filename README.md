# E-Commerce Backend

Spring Boot backend for GIVA-inspired jewelry e-commerce platform.

## Features
- REST API for products and categories
- H2 in-memory database
- CORS configuration for frontend integration
- Sample data initialization

## Technologies
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database
- Maven

## Running Locally

### With Maven
```bash
mvn spring-boot:run
```

### With Docker
```bash
# Build image
docker build -t ecommerce-backend .

# Run container
docker run -p 8080:8080 ecommerce-backend
```

## API Endpoints

### Products
- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product by ID
- `GET /api/products/category/{categoryId}` - Get products by category
- `GET /api/products/featured` - Get featured products

### Categories
- `GET /api/categories` - Get all categories
- `GET /api/categories/{id}` - Get category by ID

## Environment Variables
- `SERVER_PORT` - Server port (default: 8080)
- `SPRING_PROFILES_ACTIVE` - Active profile (default: dev)

## Author
gautam-562
