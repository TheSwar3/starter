# starter

Terms:
AOP: Aspect Oriented Programming
JDO: Java Data Objects
EJB: Enterprise Java Beans
DI: Dependancy Injection
    Can help keep app objects decoupled from each other.
    Objects are given their dependancies at creation tme by some third party that coordinates each      object in the system.
    Objects aren't expected to create or obtain their their dependancies.
POJO: plain old Java Objects
    Standard Java object
Constructor injections: AN object is given its depndancy(s) at construction tme as a constructor argument
Loose Coupling: AN object knows it's dependancy by it's interface rather than by implementation or how instantiated.
Wiring: The act of creating associations between app components (think SIMPL signals)
    Common approach has always been XML
Spring Expression Language:
Application context: 
    loads bean definitions and wires them together
    Is fully responsible for creation of wiring of the objects in that make up the application
    Spring has several implementations of application context, varying in how it loads its config 
    
Questions:
xmlns
interface orientation
declarative programming

Thoughts:
    We can create mock objects to test with, but I was having to create special constructors with empty values and/or have null default values.  Tests were littered with having to create fake values to test dependancy class with.  Now we can just test the dependancy is called, without having to really instantiate the class.


Notes:
Spring employs four key strategies: 
    Lightweight and minimally invasive development with POJOs
        Spring avoides littering your code with it's API
        Almost never forces implement Spring-specific interface or extend Spring-specific class
        Classes in a Spring app often have no indication they're being used by spring
        Maybe a Spring annotation
        Spring empowers POJOs by assembling them using DI


    Loose coupling through DI and interface orientation
    Declarative programming through aspects and common conventions
    Eliminating boilerplate code with aspects and templates

Bytes:
A Spring object can be any kind of POJO.
In book - JavaBean synonomous with POJO

Whack-a-mole bug behavior: fixing one bug causes one ore more new bugs

ToLearn:
    Mockito
