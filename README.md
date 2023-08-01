# spring-boot-microservice-practice
The purpose is to understand microservice concepts as well as practice with a simple microservice-based application using Spring Boot

1. The API gateway
> Theory
- Provides a single-entry point for certain groups of microservices.
- The API gateway sits between the client app and the microservices, which acts as a reverse proxy, routing requests from clients to services.
- Can also provide other cross-cutting features such as authentication, SSL termination, and cache.
> Key features and functionalities
- API Routing and Aggregation: Can handle routing client requests to the appropriate backend services and can aggregate multiple requests from the client to various services into a single request, reducing the number of round trips
- Protocol Translation: Can handle different types of protocols and translate them into a format that backend services understand.
- Authentication and Authorization: 
- Request and Response Transformation: Can modify request and response data (A man-in-the middle approach)
- Load Balancing: Can distribute incoming requests across multiple instances of backend services for maintaining high availability and improving performance.
- Caching: Can implement caching mechanisms to store and serve frequently requested data, reducing the load on backend services and improving response times.
- Rate limiting: To prevent abuse or overloading of backend services.
- Monitoring and Analytics: Can log and analyze incoming requests and responses, providing insights into the performance and usage of the APIs.
- Security: Acts as an additional layer of security, the smaller the attack surface is, the more secure the application can be.
- Versioning: Can handle different versions of APIs and manage the transition from older versions to newer ones seamlessly.

2. Discovery Server
> Theory
- 
