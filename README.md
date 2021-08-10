## RAK Bank - Book Store Assessment API

##### Requirement / Instructions :

We would like you to build a restful API that provides Book store APIs. Your API must be able to handle all CURD operations: 


## Technology Used

	1. Java 8
	2. Spring boot 2.x
	4. MapStruct 1.3.0
	5. lombok
	6. JPA
	7. H2 Database
	8. Maven


### Constrain

Its recommended to compile and start the application through terminal. if you are going to run through IDE, we need to follow necessary steps to annotation picks up and applies the annotation processor settings automatically for **mapstruct**.

Please find the below link to IDE support of  mapstrct to process annotation based auto generated code,

[IDE Support](http://mapstruct.org/documentation/ide-support/ "mapstruct IDE support")

## How to Run and Build


To Build the application, just execute:

```mvn clean install```

To run the application, just execute:

```mvn spring-boot:run```

Please use **http://localhost:8080/swagger-ui.html**  or you can use any web service testing tools to test the same by using below APIs.

	http://localhost:8080/bookstore/1.0.0/books 	                                         -X GET
	http://localhost:8080/bookstore/1.0.0/books 	                                         -X POST
	http://localhost:8080/bookstore/1.0.0/books/{book_id} 	                                 -X DELETE
	http://localhost:8080/bookstore/1.0.0/books/{book_id} 	                                 -X PUT 
    http://localhost:8080/bookstore/1.0.0/books/{book_id} 	                                 -X GET
    http://localhost:8080/bookstore/1.0.0/books/{book_id}?author=&price=&classification= 	 -X PATCH



## Design Pattern

* Builder design Pattern


### Builder design Pattern

I decided to use **_Builder design Pattern_** to store book details and retrieve the same from repository since its providing a more flexible way to separate the object creation, functionality from service layer and scalable.

### Auto Mapper with mapstruct

MapStruct is a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention over configuration approach.The generated mapping code uses plain method invocations and thus is fast, type-safe and easy to understand.

 
## Way to Test API

Once the server is started, we can test this API in **_three ways_**.

##### Swagger
	
This project completely integrated with Swagger API's to test API in a more convenient and easy way. To launch swagger and test, Please use this below URL in any browser.
	
http://localhost:8080/swagger-ui.html
		
##### Curl

```	
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' -d '{ \ 
   "authorEmailAddress": "user%40example.com", \ 
   "authorName": "string", \ 
   "category": "string", \ 
   "classification": "FICTION", \ 
   "description": "string", \ 
   "id": 0, \ 
   "isbn": "string", \ 
   "name": "string", \ 
   "price": 15 \ 
 }' 'http://localhost:8080/bookstore/1.0.0/books'
```

#### Webservice Testing Tool
```	

http://localhost:8080/bookstore/1.0.0/books 	                                         -X GET
http://localhost:8080/bookstore/1.0.0/books 	                                         -X POST
http://localhost:8080/bookstore/1.0.0/books/{book_id} 	                                 -X DELETE
http://localhost:8080/bookstore/1.0.0/books/{book_id} 	                                 -X PUT 
http://localhost:8080/bookstore/1.0.0/books/{book_id} 	                                 -X GET
http://localhost:8080/bookstore/1.0.0/books/{book_id}?author=&price=&classification= 	 -X PATCH
```

