# adapter 
Adapter pattern allows objects with incompatible interfaces to collaborate
It happens by an Adapter object that has the ability to change the interface of an object so that the adaptee (could be an external library for example) can understand it 

pros: 
    - can seperate interface or data conversion code from primary business logic
    - we can introduce as many types of adapters as we want without breaking client code
