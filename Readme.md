Java Spring Framework and Spring Boot
1. Package com.example.spring.framework.DependencyInjection contains the different way of using dependency injection.

Annotations:-

@Component -> Can be singleton or protocol. By default it is singleton.
The instance of such classes are created by Spring IoC container.
Singleton - Only one instance of each class defined as @Component are created. Created in the beginning before invoking.
Protocol - Multiple instances can be created but created only on Invoke.
https://www.youtube.com/watch?v=K43qyHJXmWI&list=PLsyeobzWxl7oA8QOlMtQsRT_I7Rx2hoX4&index=5
@Autowired -> Is used for automatic dependency injection. Handles by IoC container.
https://www.youtube.com/watch?v=K43qyHJXmWI&list=PLsyeobzWxl7oA8QOlMtQsRT_I7Rx2hoX4&index=5

@Primary -> used to give higher preference to a bean when there are multiple beans of the same type.
https://www.youtube.com/watch?v=If1Lw4pLLEo&list=WL&index=1

@Qualifier -> The @Qualifier annotation in Spring is used to differentiate a bean among the same type of bean objects.
If we have more than one bean of the same type and want to wire only one of them then use the
@Qualifier annotation along with @Autowired to specify which exact bean will be wired.
https://www.youtube.com/watch?v=If1Lw4pLLEo&list=WL&index=1

@ComponentScan -> annotation along with the @Configuration annotation to specify the packages that we want to be scanned.
@ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.
https://www.youtube.com/watch?v=If1Lw4pLLEo&list=WL&index=1

@Configuration -> @Configuration annotation which indicates that the class has @Bean definition methods,
So Spring container can process the class and generate Spring Beans to be used in the application.

@Bean -> A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.

@Controller / @RestController -> the controller class is responsible for processing incoming REST API requests, preparing a model,
and returning the view to be rendered as a response. The controller classes in Spring are annotated
either by the @Controller or the @RestController
