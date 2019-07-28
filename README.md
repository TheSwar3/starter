# starter

Terms:
AOP: Aspect Oriented Programming
    Allows you to capture functionality that's used throuought app in reusable components.
    'Promotes separation of conerns.'
Cross-Cutting Concerns: 
    System services that cut across multiple components in a system.
JDO: Java Data Objects
EJB: Enterprise Java Beans
DI: Dependancy Injection
    Can help keep app objects decoupled from each other.
    Objects are given their dependancies at creation tme by some third party that coordinates each      object in the system.
    Objects aren't expected to create or obtain their their dependancies.
POJO: plain old Java Objects
    Standard Java object
Constructor injections: AN object is given its depndancy(s) at construction tme as a constructor argument
Loose Coupling: 
    i.e. interface orientation.  By focusing on the interface rather than an instantiated object we 'loosly couple' the dependancy - decoupling it so the dependant class does not need a direct reference to the dependancy object - just the interface.  Spring wires the dependancies to their dependants at construct time using the config file or automatically (more on that later). 
Wiring: The act of creating associations between app components (think SIMPL signals)
    Common approach has always been XML
Spring Expression Language:
Application context: 
    loads bean definitions and wires them together
    Is fully responsible for creation of wiring of the objects in that make up the application
    Spring has several implementations of application context, varying in how it loads its config 
Interface orientation: 
    Focusing on a class interface rather than instantiation.  When we inject the dependancy we inject the class interface not an actual object.  This decouples the dependancy.  Loose coupling.
Before Advice: 
    Declaration in Spring aoc config namespace to run a method before a given method (i.e. from a different module/class)
After Advice:
    Declaration in Spring aop config namespace to run a method after a given method (i.e. from a different module/class)
    
Questions:
xmlns
declarative programming
secure vs transactional

Spring Bad Ass:
    Using templates, it's returns have their own returns (think the mouth thing from Alien).

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
        Loose coupling through DI and interface orientation:
            Objects are no longer dependant on each other. Dependancies are injected at construction and classes are referenced in their dependant classes by interface rather than instantiations.
        Declarative programming through aspects and common conventions:
            System services can be attached through AOP config so that POGO classes do not have to manage them.  This keeps the busniness logic classes clean of any code that is not their core responsabiity and in a security way removes references to system services from business classes.  THe Knight does not have to manage, or even be aware of his minstrel. The Minstrel does his job without having to be asked to in the knight's methods.
            This also helps remove boilerplate code.
        Eliminating boilerplate code with aspects and templates:
            Using Spring templates common boilerplate code, such as JBDC connection, query, cleanup, etc code is removed.  This again keeps busniess logic classes clean, and allows them to focus on their work and lets Spring take care of the tedious repetative parts. It also allows things such as DB connection properties (addresses, credentials) to be kept in a single location so that changing the DB password does not take an hour to hunt down in every method that uses it.
    AOP expression syntax - AspectJ pointcut expression language

    Containing Your Beans:
        

Bytes:
A Spring object can be any kind of POJO.
In book - JavaBean synonomous with POJO

Whack-a-mole bug behavior: fixing one bug causes one ore more new bugs

ToLearn:
    Mockito
    Dependancy Injection Dhanji R. Presanna