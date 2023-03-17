You are developing a music streaming service that allows users to listen to their favorite songs.
The service should support different audio formats, such as MP3, WAV, and FLAC. Implement the audio
streaming functionality using the flyweight pattern to minimize memory usage and improve performance.


The flyweight pattern is useful in scenarios where large numbers of objects need to be created and maintained,
 but creating a separate object for each instance would result in a large memory footprint and reduced performance.

In the example implementation for the music streaming service, the flyweight pattern is used to reduce memory
usage and improve performance by reusing the same flyweight object for multiple audio objects that share the same
data. This means that if multiple users are listening to the same audio file, only one flyweight object needs to be
created and shared among them, rather than creating a new object for each user.

The flyweight pattern can also improve performance by reducing the time it takes to create new objects, since
flyweight objects are typically pre-created and stored in a pool. When a new object is needed, the factory checks
the pool for an existing flyweight object that can be reused, rather than creating a new one from scratch.

Overall, the flyweight pattern can help improve the performance and scalability of an application by reducing memory
 usage, reducing object creation time, and improving overall application speed.





