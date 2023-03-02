**Information about the kata:**
*This kata aims for the developer to use Factory Pattern. It reminds me of a Facade Pattern for creation purposes.
You collect the creation logic into a factory that you use to avoid exposing the logic to the client.*

**Cool Car Factory**
Problem Description
Suppose you are developing a car manufacturing application that needs to create different types of cars based on
 their brand, model, and year. You want to implement a factory pattern that can create cars of different brands,
  models, and years based on the client's request.

Implement the CarFactory class that provides a createCar() method that takes in the brand, model, and year of the
 car and returns a Car object based on the client's request. The CarFactory should be able to create cars of different
 brands, models, and years using a factory method for each brand.

Implement the Car interface and the Car classes for different brands, such as Ford, Toyota, and Honda. Each Car class
 should have a constructor that takes in the brand, model, and year of the car and initializes its properties accordingly.