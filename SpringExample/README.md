# Coupling Example

Coupling describes the degree to which classes within our system depend on each other. It's a crucial concept in software design as it directly impacts the maintainability, testability, and reusability of our code.

## 1. Tight Coupling

Tight coupling is a scenario where components are highly dependent on each other. This makes it difficult to change one component without affecting others.

### Scenario: Fetch User Details from the Database

This example demonstrates a simple implementation of tight coupling to fetch user information from a database.

### Steps:

1. **Create `UserDatabase` Class**:
   - The `UserDatabase` class is responsible for accessing the database to retrieve user information.
   - It contains the method `getUserDatabase()`, which simulates the database interaction by returning a string with user details.
   
   ```java
   package com.tight.coupling;

   public class UserDatabase {
       public String getUserDatabase() {
           // Directly access database here
           return "User Details from database";
       }
   }
   ```

### 2. Create `UserManager` Class

- The `UserManager` class is responsible for managing user information.
- It interacts with the `UserDatabase` class to retrieve user details.
- In this implementation, an instance of the `UserDatabase` class is created directly within `UserManager`, demonstrating tight coupling.

#### Implementation Steps:

1. **Declare the UserDatabase Instance**:
   - Inside the `UserManager` class, declare a private instance of `UserDatabase`:
     ```java
     private UserDatabase userDatabase = new UserDatabase();
     ```
   - This line creates a new instance of the `UserDatabase` class, establishing a direct dependency.

2. **Define the `getUserInfo()` Method**:
   - Implement the `getUserInfo()` method, which uses the `userDatabase` instance to fetch user details:
     ```java
     public String getUserInfo() {
         return userDatabase.getUserDatabase();
     }
     ```
   - This method calls `getUserDatabase()` on the `userDatabase` instance to retrieve user information.

#### Complete Code Example:

```java
package com.tight.coupling;

public class UserManager {
    // Create instance of UserDatabase class
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo() {
        return userDatabase.getUserDatabase();
    }
}
```


### 3. Create the Main Class

- The `TightCouplingExample` class contains the `main` method, which serves as the entry point for the application.
- This class creates an instance of `UserManager` and calls the `getUserInfo()` method to fetch and display user details.

#### Implementation Steps:

1. **Define the Main Class**:
   - Create the `TightCouplingExample` class and specify the `main` method:
     ```java
     package com.tight.coupling;

     public class TightCouplingExample {
         public static void main(String[] args) {
             // Implementation goes here
         }
     }
     ```

2. **Instantiate UserManager**:
   - Inside the `main` method, create an instance of the `UserManager` class:
     ```java
     UserManager userManager = new UserManager();
     ```

3. **Fetch and Print User Information**:
   - Call the `getUserInfo()` method on the `UserManager` instance and print the returned user details:
     ```java
     System.out.println(userManager.getUserInfo());
     ```

#### Complete Code Example:

```java
package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
```

## 1. Loose Coupling

Loose coupling describe a scenario where software components are not depend on each other. This makes it easy to change one component without affecting others.

### Steps:

1. **Create `UserDataProvider` interface**:
    - it defined the contract for fetching for fetching the user details
2. **Create `UserDatabaseProvider` Class**:
   - To implement `UserDataProvider` interface


# 2. Loose Coupling Example

Loose coupling is a design principle that aims to minimize the dependencies between components in a system. This approach enhances flexibility, maintainability, and testability of the code.

## Scenario: Fetch User Details from the Database

This example demonstrates a loose coupling implementation for fetching user information from a database. It utilizes interfaces to reduce direct dependencies between classes.

### Steps:

1. **Create `UserDataProvider` Interface**:
   - The `UserDataProvider` interface defines a contract for retrieving user details.
   - Any class implementing this interface must provide the implementation for the `getUserDetails()` method.
   
   ```java
   package come.loose.coupling;

   public interface UserDataProvider {
       public String getUserDetails();
   }
   ```

2. **Create `UserDatabaseProvider` Class**:
   - The `UserDatabaseProvider` class implements the `UserDataProvider` interface.
   - It provides the actual implementation of the `getUserDetails()` method, simulating a database interaction.

   ```java
   package come.loose.coupling;

    import com.loose.coupling.UserDataProvider;public class UserDatabaseProvider implements UserDataProvider {
        public String getUserDetails() {
            // Directly access database here
            return "User Details from database";
        }
    }

   ```

3. **Create `UserManager` Class**:
    - The `UserManager` is responsible for managing user information.
    - It takes a `UserDataProvider`  instance through constructor injection, allowing for flexibility in choosing the data source.

    ```java
    package come.loose.coupling;

    import com.loose.coupling.UserDataProvider;public class UserManager {
        private UserDataProvider userDataProvider;

        public UserManager(UserDataProvider userDataProvider) {
            this.userDataProvider = userDataProvider;
        }

        public String getUserInfo() {
            return userDataProvider.getUserDetails();
        }
    }
   ```

3. **Create `Main` Class**:
    - The `LooseCouplingExample` class contains the `main` method to run the application.
    - It creates an instance of `UserDatabaseProvider` and passes it to the UserManager, demonstrating loose coupling.

    ```java
    package come.loose.coupling;

    import com.loose.coupling.UserDataProvider;public class UserManager {
        private UserDataProvider userDataProvider;

        public UserManager(UserDataProvider userDataProvider) {
            this.userDataProvider = userDataProvider;
        }

        public String getUserInfo() {
            return userDataProvider.getUserDetails();
        }
    }
   ```

### Summary:
- This implementation demonstrates loose coupling between the `UserManager` and `UserDatabaseProvider` classes.
- The `UserManager` class is not tightly bound to any specific data source; instead, it relies on the `UserDataProvider` interface.
- This design allows for greater flexibility, as you can easily swap out the `UserDataProvider` implementation without modifying the `UserManager`.


# Spring Bean Example

This project demonstrates how to create and configure a simple Spring bean using XML-based configuration. The example includes the creation of a `MyBean` class, setting its properties, and configuring it in the Spring XML file.

## 1. Project Structure

The project is organized into the following package:  
`car.example.bean`

## 2. Create First Bean

This section explains the steps involved in creating a simple Spring bean.

### Steps:

1. **Create `car.example.bean` package**:
   - Organize your classes under the `car.example.bean` package.

2. **Create `MyBean` class**:
   - The `MyBean` class represents the bean you want to configure in Spring.

3. **Define a private member `message`**:
   - Create a class property of type `String` called `message`:
     ```java
     private String message;
     ```

4. **Create the `setMessage()` method**:
   - Provide a setter method to set the value of `message`:
     ```java
     public void setMessage(String message) {
         this.message = message;
     }
     ```

5. **Create the `showMessage()` method**:
   - Define a method to print the message:
     ```java
     public void showMessage() {
         System.out.println("Message: " + message);
     }
     ```

6. **Override the `toString()` method**:
   - Override the `toString()` method for string representation of the bean:
     ```java
     @Override
     public String toString() {
         return "MyBean{" +
                 "message='" + message + '\'' +
                 '}';
     }
     ```

### 3. Create the Spring Bean Configuration

7. **Spring Context Configuration**:
   - The Spring container will manage the lifecycle of the `MyBean` class using the configuration file `applicationBeanContext.xml`.

8. **Create the Configuration File**:
   - Go to the resources directory and create a new XML configuration file named `applicationBeanContext.xml`.

9. **Define the Bean in the XML File**:
   - Inside the `applicationBeanContext.xml`, define the bean like this:
     ```xml
     <?xml version="1.0" encoding="UTF-8"?>
     <beans xmlns="http://www.springframework.org/schema/beans"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="
             http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

         <!-- Define MyBean class here -->
         <bean id="myBean" class="car.example.bean.MyBean">
             <property name="message" value="Hello, Spring!"/>
         </bean>

     </beans>
     ```

   - In this configuration:
     - `id="myBean"`: Defines the name of the bean.
     - `class="car.example.bean.MyBean"`: Specifies the location of the bean class.
     - The `<property>` tag sets the `message` field of the `MyBean`.

### 4. Create the `App` Class

10. **Create the `App` class**:
    - The `App` class contains the `main()` method, which loads the Spring context and retrieves the bean from the XML configuration file.

    ```java
    package car.example.bean;

    import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

    public class App {
        public static void main(String[] args) {
            // Load the Spring XML configuration file
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

            // Retrieve the bean from the Spring container
            MyBean myBean = (MyBean) context.getBean("myBean");

            // Print the bean details
            System.out.println(myBean);
        }
    }
    ```

    - The `App` class:
      - Loads the Spring context from the XML configuration file.
      - Retrieves the `myBean` bean using the `context.getBean()` method.
      - Prints the bean’s information by calling the overridden `toString()` method.

---

### Summary:

- This project demonstrates how to create and configure a simple Spring bean.
- The `MyBean` class is managed by the Spring container `ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml")` and configured via XML.
- The `App` class loads the context and retrieves the bean, showing how to interact with Spring beans in an application.


# Dependency Injection

Dependency injection (DI) is a design pattern used in software development to achieve **loose coupling** by removing direct dependency instantiation from the dependent class itself. Instead, dependencies are provided externally, improving the flexibility, maintainability, and testability of the system.

## 1. Constructor Injection

In **constructor injection**, dependencies are passed to the dependent class via its constructor. This ensures that the dependent class is provided with everything it needs at the time of its creation, thus enforcing a complete object initialization.

### Steps:

1. **Create `car.example.constructor.injection` package**:
   - Organize your code by creating a new package called `car.example.constructor.injection`.
   
2. **Create `Car` Class**:
   - The `Car` class represents a vehicle and is dependent on the `Specification` class for details about the car's make and model.
   - Define the constructor of the `Car` class to accept a `Specification` object as a dependency, ensuring that the `Car` can only be created when the specification is provided.
   - Create a method `displayDetails()` to print the details of the car.

   ```java
   public class Car {
       private Specification specification;

       // Constructor injection for the 'Specification' dependency
       public Car(Specification specification) {
           this.specification = specification;
       }

       public void displayDetails() {
           System.out.println("Car Details: " + specification.toString());
       }
   }

   ```

3. **Create `Specification` Class**:
    - The `Specification` class is a dependent bean required by the `Car` class. It holdsthe properties of the car, such as its make and model.
    - Create getter and setter methods for the `make` and `model` properties, whichdescribe the car. Example : 
    ```java
    // Getter and setter methods
     public String getMake() {
        return make;
     }
     ```

4. **Create the XML Configuration File:**:
    - The `App` class serves as the entry point for the application.
    - Load the Spring context using `ClassPathXmlApplicationContext` to load the applicationConstructorInjection.xml file.
    - Retrieve the `Car` bean from the Spring container and invoke the displayDetails() method.
    
### Summary:
- **Dependency Injection:** By using constructor injection, we decouple the `Car` class from the `Specification` class. The Spring container manages the dependencies, ensuring that the `Specification` is injected into the `Car` when it is created.
- **Loose Coupling**: The `Car` class does not need to know how to create or configure the `Specification` class; it only knows that it needs a `Specification` to function. This increases flexibility and maintainability.
- **Spring Container:** The Spring container (managed by `ApplicationContext`) loads the bean definitions from the XML configuration file and handles the injection process.


## 2. Setter Injection

**Setter Injection** is another way to inject dependencies in Spring. The dependent object is passed to the class using setter methods rather than through the constructor.

### Steps:

1. **Create `car.example.setter.injection` package**:
   - This package contains the necessary classes to demonstrate `setter injection`.
   
2. **Create `Car` Class**:
   - The `Car` class depends on the `Specification` class, and in this example, the dependency is injected using a setter method.
   - The Car class has a `setSpecification()` method to inject the Specification object.
   - The `displayDetails()` method is used to display car details

   ```java
   public class Car {
        private Specification specification;

        // Setter method for dependency injection
        public void setSpecification(Specification specification) {
            this.specification = specification;
        }

        public void displayDetails() {
            System.out.println("Car Details: " + specification.toString());
        }
    }

   ```

3. **Create `Specification` class**:
   - The `Specification` class is a dependent bean required by the `Car` class. It holdsthe properties of the car, such as its make and model.
   - This class is treated as a dependent bean, and its properties will be injected into the |`Car` class.
    - Create getter and setter methods for the `make` and `model` properties, whichdescribe the car. Example : 
    ```java
    // Getter and setter methods
     public String getMake() {
        return make;
     }
     ```
4. **Create the Configuration File:**
   - Go to the resources directory and create a new XML file named `applicationSetterInjection.xml`.
   - Define the beans and specify the setter injection for the `Car` class.

   ```xml
   <!-- Inject Specification into Car using setter injection -->
   <bean id="myCar" class="car.example.setter.injection.Car">
        <property name="specification" ref="carSpecification"/>
    </bean>
   ```
4. **Create the `App` Class:**
   - The `App` class is the entry point of the application. It loads the Spring application context and retrieves the `Car` bean.
   - It demonstrates the use of setter injection by displaying car details.
   ```java
        // Load the xml file
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
   ```
