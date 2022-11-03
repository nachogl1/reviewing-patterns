# reviewing-patterns

Repo created to review different software patterns

## CREATIONAL PATTERNS  

### Singleton Pattern
- Uses
  - Restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine
- To take into consideration
  - We are playing with global variables which is not thread-safe

  - Mocking static brings a lot of headaches

  - The fact that it is not thread-safe and we using global variables make the state uncertain during tests and that create temporal coupling,
  where the tests should be totally independent of each other.