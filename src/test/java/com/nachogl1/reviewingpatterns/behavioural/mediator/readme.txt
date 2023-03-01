**Information about the kata:**
*This kata aims for the developer to use mediator Pattern. Reduce communication complexity among objects.

** Cool ChatRoom

Implement a chat application where multiple users can send and receive messages in real-time.
 Use the Mediator pattern to decouple the communication between users and ensure that each user
 only communicates with the Mediator, which then relays the messages to the appropriate recipients.
  The Mediator should also be responsible for keeping track of the users who are currently online and
  managing their presence.
 The basic functionality is one chat room with all the users, so if User 1 sends a message, User 2 and 3 will receive
 it.
