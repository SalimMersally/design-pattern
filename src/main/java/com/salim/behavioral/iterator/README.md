# Iterator
## Definition 
The Iterator pattern is a behavioral design pattern that provides a way to access the elements of a collection 
(such as a list or an array) in a sequential manner, without exposing the underlying implementation of the collection.

The Iterator pattern decouples the traversal of a collection from the implementation of the collection, allowing the 
same traversal code to be used with different types of collections. It also makes it easy to add new types of 
collections without modifying the existing traversal code.

The Iterator pattern typically involves two main classes: the iterator class and the aggregate class. The iterator class
provides a way to access the elements of the aggregate class in a sequential manner, while the aggregate class provides 
a way to create the iterator object.

The iterator class typically has methods like "next" to retrieve the next element in the collection, "hasNext" to check
if there are more elements to retrieve, and "remove" to remove the current element from the collection. The aggregate 
class typically has a method that returns an iterator object, allowing clients to traverse the collection.

Overall, the Iterator pattern provides a convenient and flexible way to traverse a collection of objects, without 
exposing the details of the collection's implementation to the client code.
