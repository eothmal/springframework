what is Spring Bean?  

Element/Tag defined in the Spring Bean Configuration File  
Objects that are managed by our spring application container  
we use bean to create instances of classes throught our spring application.  
Mapping of application classes with uniquie identifiers that spring can use 

* unique id  
* reference to a class  
* class should have default no argument constructor 

Spring Bean Scopes

Singleton:  (stateless bean)  
 single instance per IoC container

Prototype: (statefull bean)  
 multiple instances per IoC container

Request:   
 One instance per HTTP Request

Session:   
 One instance per HTTP Session

Global Session
 One instance per global HTTP Session
 (Portlet-based web applications)
  
Configure Spring Bean with Non-default Constructor    
Setting Bean Properties  
Setting Collection Type Bean Properties  
Setting Bean Properties Using th p-namespace  
Configuring Spring Bean via Setter Injection  
Configuring Spring Bean via Constructor Injection  
Inner and Outer Beans  
Setting Init and Destroy Method on Beans  
  
Autowiring byType
AutoWiring byName
Autowiring byConstructor
Default Autowiring

  


