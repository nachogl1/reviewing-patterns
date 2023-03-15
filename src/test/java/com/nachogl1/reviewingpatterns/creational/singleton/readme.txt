**Information about the kata:**
*This kata aims for the developer to use Singleton Pattern*

**Cool Logger**

Implement a Singleton pattern to create a "Logger" object that maintains a single instance throughout the application.
The Logger class should have a private constructor and a static method, "getInstance()",
 that returns the single instance of the Logger object.

The Logger class should have a public method, "log()", that accepts a message string and writes it to a log file or
 console. The Logger object should use lazy initialization to create the instance only when the getInstance() method is first called.

Create a test case that demonstrates the use of the Singleton pattern to obtain the single instance of the Logger
 object and use its log() method to write messages to the log file or console. The test case should create multiple
 threads and show that each thread obtains the same instance of the Logger object,
  ensuring that there is only one instance of the Logger throughout the application.

Extra points for implementing thread-safe initialization to avoid any race conditions that may occur when multiple
threads attempt to obtain the Logger instance simultaneously.

**Something interesting to remember**
- Go for a singleton if we:

  Require a complete object-oriented solution for the application
  Need only one instance of a class at all given times and to maintain a state
  Want a lazily loaded solution for a class so that it's loaded only when required

- Use static classes when we:

  Just need to store many static utility methods that only operate on input parameters and do not modify any internal state
  Don't need runtime polymorphism or an object-oriented solution

- Assess if using AOP