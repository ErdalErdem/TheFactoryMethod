public class FactoryMethodExample {
    public static void main(String[] args) {
        // Creating factories using lambdas
        ShapeFactory circleFactory = Circle::new;
        ShapeFactory squareFactory = Square::new;

        // Using factories to create objects
        Shape circle = circleFactory.create();
        Shape square = squareFactory.create();

        // Using the created objects
        circle.draw();
        square.draw();
    }
    // ShapeFactory is instantiated using lambdas (Circle::new and Square::new).
    //These lambdas serve as the factory methods, defining how to create specific shapes (Circle or Square) when create() is invoked.
    // In the main method, we create instances of Circle and Square using the factories.
    //When calling create() on circleFactory, it instantiates a Circle object.
    //Similarly, when calling create() on squareFactory, it creates a Square object.
    //Invoke Product Methods:
    //
    //We then call the draw() method on these created objects (instances of Circle and Square).
    //This method invocation demonstrates that these objects have been created and can perform their respective operations.
}
