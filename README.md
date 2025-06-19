# Simple REST API with Spring Boot

## Programming Language and Framework

- **Language:** Java
- **Framework:** Spring Boot

## How to Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/ahmedonly00/Simple-Rest-Api.git
   cd RestApi
   ```
2. **Build and run the application:**
   ```sh
   ./mvnw spring-boot:run
   ```
   Or on Windows:
   ```sh
   mvnw.cmd spring-boot:run
   ```

The API will be available at `http://localhost:8080`.

## API Endpoints

### Create a User

- **Endpoint:** `POST /users/create`
- **Request Body:**
  ```json
  { "name": "John Doe", "email": "john@example.com" }
  ```
- **Example cURL:**
  ```sh
  curl -X POST http://localhost:8080/users/create \
    -H "Content-Type: application/json" \
    -d '{"name": "John Doe", "email": "john@example.com"}'
  ```

### Get a User by ID

- **Endpoint:** `GET /users/{id}`
- **Example cURL:**
  ```sh
  curl http://localhost:8080/users/<user-id>
  ```

## Testing with Postman

You can also test the API using [Postman](https://www.postman.com/downloads/):

1. **Start your application** as described above.
2. **Create a User:**
   - Set method to `POST`
   - URL: `http://localhost:8080/users/create`
   - Go to the **Body** tab, select **raw** and choose **JSON**
   - Enter:
     ```json
     {
       "name": "John Doe",
       "email": "john@example.com"
     }
     ```
   - Click **Send** to create a user.
3. **Get a User by ID:**
   - Set method to `GET`
   - URL: `http://localhost:8080/users/<user-id>` (replace `<user-id>` with the actual id from the previous response)
   - Click **Send** to fetch the user.

## Notes

- User data is stored in memory (no database).
- Returns JSON responses.
- Handles errors for missing fields and user not found.
