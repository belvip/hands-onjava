# Binary Tree with Loose Coupling and Using Packages

## Project Structure
1. **`com.benarytree.preordermodel`**: Defines the binary tree node.
2. **`com.benarytree.service`**: Contains the traversal logic interface and its implementation.
3. **`com.benarytree.config`**: Contains the Spring configuration.

## Steps

### Step 1: Define the Node Class
- Create a `Node` class in the `preordermodel` package.

### Step 2: Define the Traversal Interface
- Define a `TraversalService` interface in the `service` package. This promotes loose coupling by allowing different traversal implementations to be swapped.

### Step 3: Implement the Preorder Traversal
- Create a class that implements the `TraversalService` interface and performs preorder traversal.

### Step 4: Configure Spring
- Define a configuration class in the `config` package to set up the application context. This configuration handles the instantiation of the `Node` and `TraversalService` beans.

### Step 5: Run the Application
- Create a main application class to retrieve the `TraversalService` bean and perform the traversal.

---

## Explanation of Dependency Injection

### 1. TraversalService Injection in MainApp
In the `MainApp` class, we retrieve the `TraversalService` bean using `context.getBean(TraversalService.class)`. Spring injects an instance of the `PreorderTraversalService` class (the only implementation of `TraversalService` in our code) into `MainApp`.  
This means `MainApp` doesn’t need to know the specific implementation of `TraversalService`, promoting loose coupling.

### 2. Component Scanning for Service Injection
The `@Service` annotation in `PreorderTraversalService` registers it as a Spring bean. Thanks to `@ComponentScan(basePackages = "com.benarytree.service")` in `AppConfig`, Spring will automatically detect and inject `PreorderTraversalService` wherever a `TraversalService` is required.

This approach allows switching to different traversal implementations (like `InorderTraversalService`) without changing code in `MainApp` as long as they implement `TraversalService`.

### 3. Bean Injection for Node Tree Structure
The `binaryTree()` method in `AppConfig` creates and returns a `Node` object representing the root of a binary tree, registered as a Spring bean.  
In `MainApp`, we get this bean using `context.getBean(Node.class)`, which allows us to access the tree structure without directly instantiating `Node` in the `MainApp` class.

---

## Skills Learned

Working on this project developed the following skills:

- **Understanding Dependency Injection**: Using Spring's dependency injection features, such as `@Autowired` and `@Service`, to promote loose coupling between components.
- **Implementing Loose Coupling**: Designing interfaces and using Spring’s component scanning to ensure flexible architecture.
- **Using Spring Configuration**: Setting up an application context using `@Configuration` and `@ComponentScan` to organize and manage beans.
- **Binary Tree Traversal**: Learning about and implementing a preorder traversal of a binary tree.
- **Working with Packages**: Organizing classes into packages, following best practices for project structure and code readability.
- **Spring Bean Management**: Creating and managing beans with `@Bean` and retrieving them from the Spring context.

This project reinforced core concepts of Java, Spring, and binary tree traversal while fostering good software design practices.
