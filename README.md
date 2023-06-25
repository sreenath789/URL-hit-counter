# URL-hit-counter
## Frameworks and languages used
###### SpringBoot

## Data Flow

### Controller
###### List<User> getAllUsers() --> get all users ,String addUser ---> add the user , int getHitCount --> get hit count , getUserHitCount(name) -->get user hit count

### Service
###### it is autowired in Controller so that it can perform required business logic

### Repository
###### It Consists data which is posted from postman Application. It is autowired in Service application

### Model
###### private int count;private String userName;

### Factory
###### BeanFactory class it will initialize object by spring

## Summary
###### Perfoming get hit count everytime requests api && get hit count by username