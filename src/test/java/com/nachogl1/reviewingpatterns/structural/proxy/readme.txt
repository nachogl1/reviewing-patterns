

** Cool Slow Server**

You are working on a program that involves accessing a remote server to retrieve some data.
 However, the server is often slow and unreliable, causing delays and errors in your program.
 To improve the performance and reliability of your program, you decide to use the proxy pattern to create a proxy
  object that will handle the communication with the server.

Your task is to implement the proxy object using the proxy pattern. The proxy should provide the same interface as
 the original object, but it should handle the communication with the server in a more efficient and reliable way.
 The proxy should cache the results of previous requests and use them to respond to subsequent requests whenever
  possible. It should also handle errors and retries as necessary to ensure that the program always receives a response from the server.

Another way of seeing this:

  The server that everybody accesses in your building is 1000km away and contains some heavy weight data.
  Your manager asks you to optimise the way this is used by implementing a proxy that will cache the data in your facilities
  so the calls are not that heavy.

  **Why this is useful**

  The proxy pattern is useful when we want to control access to an object. It allows us to create a proxy object that
  sits between the client and the real object, providing an interface that is similar to the real object, but with some
   added functionality. The proxy object can then be used to control access to the real object, performing additional
   operations before or after the client accesses the real object.

  One common use case for the proxy pattern is to implement caching. In this scenario, the real object represents some
  expensive operation, such as retrieving data from a remote server. The proxy object can be used to cache the data
  retrieved from the real object, so that subsequent requests for the same data can be served from the cache instead
  of making a request to the real object. This can help improve performance and reduce the load on the real object.

  Another use case for the proxy pattern is to implement security. In this scenario, the real object represents some
  sensitive data or functionality that should only be accessed by authorized clients. The proxy object can be used to
   perform authentication and authorization checks before allowing the client to access the real object. This can help
   prevent unauthorized access to sensitive data or functionality.