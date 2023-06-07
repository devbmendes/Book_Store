 # Book Store API with Swagger
 <p>This is an API with Spring Boot 3.0 in order to implement relational database knowledge with the Hibernate framework.
As the image below shows, the author table has a many-to-many relationship with the book table, consequently generating an intermediate book_author table and finally the book table has a one-to-many relationship with the category table.<p>

  
  
### Technology used:

 - Spring Boot 3.0
 - Spring Web
 - Spring JPA
 - H2 Data Base
 - Validation
 - Swagger UI
 
 

## Feature

 - [ ] Save
	 - [ ] Book
	 - [ ] Category
	 - [ ] Author
 - [ ] Find by ID
	 - [ ] Book
	 - [ ] Category
	 - [ ] Author 
 - [ ] Find a Author by email
 - [ ] Find a category by name
 - [ ] Find a book by name
 - [ ] Get all
	 - [ ] Book
	 - [ ] Author
	 - [ ] Category
 - [ ] Delete by ID
	 - [ ] Book
	 - [ ] Author
	 - [ ] Category
 - [ ] Update
	 - [ ] Book
	 - [ ] Author
	 - [ ] Category
<h2> Getting Started </h2>
<p> To get started with this project, you will need to have the following installed on your local machine: </p>
 
 1. [ ] JDK 17+
 2. [ ] MAVEN 3+

To build and run the project, follow these steps:
 1. Clone the repository: `git clone http://github.com/devbmendes/Book_Store.git`
 2. Navigate to the project directory: cd Book_Store or open a Java IDE like IntelliJ IDEA or STS
 3. Run the project: Run as Spring Boot Application
 4. You can use de Postman tools or whatever you want
 5. It will be available at localhost:8080
 6. Will be redirected to the Swagger interface where you can test the API
