# Dagger2FundamentalPractice
In this app we will practice Dagger2 fundamental concepts and its annotation. 
1. @Component: The Conductor of Dependency Injection
Think of @Component as the conductor of the dependency injection orchestra. It's an interface that Dagger uses to generate a class with methods for injecting dependencies. We annotate it with a list of @Module-annotated classes, specifying where Dagger should look for dependency providers.
2. @Module: The Provider Factory
@Module is the provider factory, where we declare methods that create and provide instances of our dependencies. It's like a recipe book for Dagger, guiding it on how to cook up the objects we need.

3. @Provides: Serving Dependency Instances
The @Provides annotation marks methods within @Module-annotated classes. These methods return instances of the dependencies we want to inject. Dagger takes these methods as instructions, constructing and providing instances as needed.

4. @Binds: Efficient Interface Injection
@Binds is an optimization of @Provides for interfaces. It's used to tell Dagger to create a direct link between an interface and its implementation. Unlike @Provides, @Binds methods have simpler implementations, reducing boilerplate code.
