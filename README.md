### Creational Patterns
<hr />

* Singleton Pattern
  * constructor will be private
  * Declare static method
  * Declare static member of the same class type in the class
  * can be created with eager or lazy initialization
  * we can mark it as synchronized for thread safety
  * But if we serialize and deserialize the object will be singleton
  * This can be resolved by Object readResolve() method
  * Throw a CloneNotSupportedException() in the clone() method
  * REFLECTION PROBLEMS: singleton can be broken by reflection apis
    * This can be fixed by Enum solution

<hr />

* Factory Pattern
  * Hides object creation process (abstracts)
  * Example JDBC DriverManager
  * It should be a static method in a class


<hr />

* Abstract Factory Pattern
  * Hides creation of factories (ex) JAXP
  * (e.g) DaoMaker -> DaoFactory -> (XMLDaoFactory or DBDaoFactory)
    * Here DaoMaker is Abstract Factory creating Factories
<hr />

* Prototype Pattern
  * Using prototype to create multiple objects
  * using clone() method
  * But shallow copy will be the problem
  * Modify the clone() method to add objects or using copy constructor
  * Ensure there is no circular object dependency as we are re-using the objects
 <hr />

* Builder Pattern 
  * To increase code readability
  * ```
    // Before builder pattern
    HttpClient httpClient = new HttpClient("GET", "https://localhost", "kani", null, null, null);}

  * inner static Builder class will be created
  * for each field there will be a method that returns the same object (i.e) this
  * so the method calls can be chained
  * The final method will be the build() method will pass the current inner static class to the actual Class constructor
  * ``` 
    // Using builder
        HttpClientBuilder builder = new HttpClientBuilder();
        HttpClient httpClient = builder.method("POST").url("testurl").body("{}").build();

<hr />

### Behavioral Patterns

<hr />

* Template Method Pattern
  * base template method from parent class will be leveraged by child class
<hr />

* Command Pattern
  * there are 5 main components in this pattern
    * Client
    * Invoker
    * Receiver
    * Command (i/f)
    * ConcreteCommand (classes)

<hr />

* Iterator Pattern
  * Helps to iterate over a collection
  * Iterator interface will have hasNext() and next() method
  * Implementing class should provide the override



<hr />

* Observer Pattern
  * There is an observer and an observable
    * e.g News Agency, Channels
      * Channel - Observer or Subscriber
      * News Agency - Observable or Publisher

<hr />

### Structural Patterns

<hr />

* Adapter Pattern
  * connecting 2 objects with different inputs
  * (e.g) weatherfinder interface


<hr />

* Flyweight Pattern
  * This is used for reusing objects and saving memory
  * (e.g) for mobile applications
  * Solution:
    * Separate the Extrinsic State
    * Pass them as parameters
    * Create a factory class



<hr />

* Decorator Pattern
  * adds runtime wrapper for the classes

<hr />

* Proxy Pattern
  * Proxy filter component


<hr />

* Facade Pattern
  * Facade class makes the complex calls easy by abstracting the backend
  * Facade is a layer between client and backend
  * To reduce network calls from client