Create a system that allows users to order drinks from a coffee shop menu. Use the decorator pattern to add additional
options to drinks, such as extra shots of espresso or flavored syrups, while keeping the base functionality of
 ordering and pricing drinks intact.

 - Baseline price expresso: 2
 - + Syrup Shot: +1
 - + Special Milk: +1
 - + Coffee shot: +1


 The decorator pattern is useful for adding or modifying the behavior of an object at runtime, without changing its
 original implementation. It allows you to add new features to an object by wrapping it with one or more decorator
  objects, rather than creating a new subclass for each combination of features.

 In the coffee shop example, using the decorator pattern allows you to easily customize drinks by adding or removing
  options, such as adding extra shots of espresso or flavored syrups, without modifying the base Coffee class or
   creating new subclasses for each combination of options. This makes the code more flexible and maintainable,
    as well as easier to test and debug, since the behavior of the decorated objects can be easily isolated and tested separately.

 Overall, the decorator pattern promotes the "open-closed" principle of software design, which states that a class
 should be open for extension but closed for modification. This makes it easier to add new features to the codebase
  in the future, without breaking existing code or introducing new bugs.