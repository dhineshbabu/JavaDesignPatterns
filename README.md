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