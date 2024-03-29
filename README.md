# reviewing-patterns

Repo created to review different software patterns

## CREATIONAL PATTERNS

### Singleton Pattern

![alt text](assets/singleton.png)

- Uses
    - Restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual
      machine
- To take into consideration
    - We are playing with global variables which is not thread-safe

    - Mocking static brings a lot of headaches

    - The fact that it is not thread-safe and we using global variables make the state uncertain during tests and that
      create temporal coupling,
      where the tests should be totally independent of each other.

### Builder Pattern

![alt text](assets/builder.png)

- Uses
    - Help to instantiate objects that are complex to create.
    - An example of use

  ```InstanceNeedsBuilder instance = InstanceNeedsBuilder.builder().setAge(9).setName("Name").build();```
- To take into consideration
    - The version of the builder that we review in this repo has a static nested class. this is necessary to be able
      to call this class without an instance of the outer class.
    - Violation of CQS (Command-Query Separation) as the setters in the builder run a command (they set a value) and
      they
      run a query (return the builder class).

### Factory Method Pattern

![alt text](assets/factoryMethod.png)

- Uses
    - Uses **factory methods** to instantiate objects instead of calling the exact class itself using new.
    - Lets think is a mix of Template Method and Abstract Factory (because there is an interface that defines how to
      create) and Factory (cause instead of creating a family, it creates only one object)
    - more in aboutFactories.txt

- To take into consideration
    - We give the responsibility of instantiation to other class rather than the object.
    - https://stackoverflow.com/questions/13029261/design-patterns-factory-vs-factory-method-vs-abstract-factory

### Factory  Pattern

![alt text](assets/factory.png)

- Uses
    - It reminds me of a Facade Pattern for creation purposes. You collect the creation logic into a factory that you
      use to avoid exposing the logic to the client.
- To take into consideration
    - Use of static on the make method in the factory, static modifier makes functionality difficult to test/mock
    - Use of switch to divert the flow. Polymorphism is a solution for this problem.
    - https://stackoverflow.com/questions/13029261/design-patterns-factory-vs-factory-method-vs-abstract-factory
    - more in aboutFactories.txt

### Prototype  Pattern

![alt text](assets/protype.png)

- Uses
    - Use to clone object avoiding dependencies among them. Done carefully, deep copying can be achieved.
- To take into consideration
    - The idea of implementing this way is because we will have access to private objects internally in the object
    - It is necessary to implement prototype not only in the object you want to clone but in the object that compose
      the main one. In this case, Car and GPS implement prototype because we do not only want to clone Car but the GPS
      inside the car.
      Otherwise, different car instances will hold the same GPS instance.

### Abstract Factory Pattern

![alt text](assets/abstractFactory.png)

- Uses
    - Allows you to create different factories to create items of different families.
    - more in aboutFactories.txt
- To take into consideration
    - I used different methods instead of a switch to control the flow what to choose. I guess it depends on the
      context that this may be the best option.
    - The Factory Pattern and Abstract Factory Pattern are both creational design patterns that provide a way to
    - create objects without exposing the creation logic to the client. However, there are some differences between the
      two patterns. The main difference is that the Factory Pattern deals with creating a single product or family of
      related
      products, while the Abstract Factory Pattern deals with creating families of related products. In other words, the
      Factory
      Pattern creates one type of object while the Abstract Factory Pattern creates a family of related objects.
      Another difference is that the Factory Pattern uses a single method or class to create objects, while the Abstract
      Factory Pattern uses a set of related factory methods or classes to create families of related objects. In other
      words, the Factory Pattern has one factory class for each type of product, while the Abstract Factory Pattern has
      one
      factory class for each family of related products.
      Finally, the Factory Pattern is simpler and easier to implement, while the Abstract Factory Pattern is more
      complex and more flexible. The Factory Pattern is suitable for small projects that only require the creation of a
      few types of
      objects, while the Abstract Factory Pattern is suitable for larger projects that require the creation of multiple
      families of related objects.
    - https://stackoverflow.com/questions/13029261/design-patterns-factory-vs-factory-method-vs-abstract-factory

## BEHAVIOURAL PATTERNS

### State Pattern

![alt text](assets/statePattern.png)
For this example, the State Machine for the Vending Machine would be:
![alt text](assets/stateMachine.png)

- Uses
    - An object contains a state and its behaviour is able to mutate depending on its specific state
- To take into consideration
    - Interface Segregation Principle violated over Liskov Substitution Principle, due to the fact that one particular
      state can go to different ones
      there will be combinations that will not make sense. I guess there is a way of fixing this, although I am now
      exploring the pattern. I will
      try to improve in the future.
- ### Strategy Pattern

![alt text](assets/strategyPattern.png)

- Uses
    - Allows you to choose different algorithms at runtime to achieve an objective. In the case of this example,
      it lets us choose what type of payment strategy we want to use to accomplish the objective of paying for items.
    - The difference with visitor is that different strategies are applied to one target. Whereas in visitor,
      we focus on one algorithm that is applied to different targets.
- To take into consideration
    - I like this pattern, so maybe I got onboard with the details and got the problem too complicated for what it is
      in reality, I hope you can understand it. I really enjoyed it. For sure there are wrong things in the code, but
      the
      objective is to describe the pattern.

- ### Template Pattern

![alt text](assets/templatePattern.png)

- Uses
    - Customise internal steps of a common process
- To take into consideration


- ### Observer Pattern

![alt text](assets/observerPattern.png)

- Uses
    - Notify observers of state changes on observed object
- To take into consideration
    - In this example, the clients can only subscribe to one subject to be observed. But the general idea is to allow
      them to subscribe as many as they want.
    - The user is automatically subscribed on creation as you need the subject to observed when creating the user.
      This is just an example but realistically, the user will decide to subscribe way after the object is created.
    - Possibility of unsubscribe is not in the example

- ### Iterator Pattern (Simple)

![alt text](assets/iteratorPattern.png)

- Uses
    - Iterate your own data structure, and implement custom behaviour
- To take into consideration
    - For this example, we will use a data structure that only accepts Strings. Using Generics we could try to be more
      flexible.
    - For the container interface there is barely functionalities, we could think of adding add(), remove(), etc.
    - Remember that for the iterator we're implementing now, there is no feature that covers going backwards. In order
      to revisit an old element in the data structure you will need a new iterator.

- ### Memento Pattern

![alt text](assets/mementoPattern.png)

- Uses
    - Restore previous state of an object
- To take into consideration
    - the current example covers undo features for Strings, via using Generics we could adapt this to different objects
      types.


- ### Chain Of Responsibility Pattern

![alt text](assets/corPattern.png)

- Uses
    - Chain of objects with different responsibilities towards completing a task
- To take into consideration
    - In the main, the way we cycle handlers is a little awkward because the return, returns the last cycled
      handler if you do everything on a one-liner. Another solution would be to start from the last handler and go back,
      that feels pretty weird.
    - The 'DatabaseConnection' emulates connecting to a DB and checking the username, password and role.
    - cycleHandler() violates CQS as it is a command that also returns an object.


- ### Command Pattern

![alt text](assets/commandPattern.png)

- Uses
    - Requests are wrapped in objects and passed to invoker
- To take into consideration
    - Customer object was added to show that in different classes we can apply commands, that class is empty for this
      example


- ### Visitor Pattern

![alt text](assets/visitorPattern.png)

- Uses
    - Apply an algorithm to different target objects, the difference with Strategy is that we apply one algorithm to
      different targets
- To take into consideration
  -  

- ### Mediator Pattern

![alt text](assets/mediatorPattern.png)

- Uses
    - Reduce communication complexity among objects
- To take into consideration
    - For this example, we created a chat room which makes communication better.
    - Another idea would be to create chatroom for two people to communicate privately. Emulating user-to-user
      communication.
    - The idea for this example is that you canhave as many participants as you want communicating using a the chat room
      as mediator.


- ### Facade Pattern

![alt text](assets/facadePattern.png)

- Uses
    - Group independent functions that solve a final problem under a façade
- To take into consideration
    - In this case, the user may think we can use abstraction for all the calculators but this is one case.
      Maybe the facade gathers services that are not that closely related and abstractions are not of use, that is why
      it was taken into consideration for this example.
    - Another example that I liked: https://www.baeldung.com/java-facade-pattern


- ### Decorator Pattern

![alt text](assets/decoratorPattern.png)

- Uses
    - Wrap original class with decorators to add functionality
- To take into consideration
    - I used the abstract class Pizza Decorator in a way kind of close to template pattern in which I stated what
      I need it to do with the prices and the names, and the only thing left for the decorators is to return their own
      name and price.
    - The reason the base of the pizza is last is that its constructor It is not pushed to have any arguments.


- ### Proxy Pattern

![alt text](assets/proxyPattern.png)

- Uses
    - Placeholder to control access to original object
- To take into consideration
- ### Proxy Pattern

![alt text](assets/flyweightPattern.png)

- Uses
    - Reduce memory footprint by sharing common parts
- To take into consideration
    - Make sure the flyweight objects are immutables
    - Flyweight Factory is advised to access/add objects

![alt text](assets/compositePattern.png)

- Uses
    - Compose objects in a tree structure
- To take into consideration

![alt text](assets/bridgePattern.png)

- Uses
    - Decouple abstractions from implementation so you can mix them
- To take into consideration
    - Maybe we can think of using Artist/Book as an inner class. With a builder (?)

![alt text](assets/adapterPattern.png)

- Uses
    - Adapt two incompatible entities
- To take into consideration
    - Thi idea is that we have 2 certain DB connections (A and B) that follow a contract design by us.
      The problem now is that we want to use a third connection that does not follow that contract but we dont want
      to change our code to adapt to it. So what we do, we create an adapter that allows to plug in the external
      connection (C).