package foundations;

import java.lang.annotation.*;

// Step 1: Define a custom annotation
@Retention(RetentionPolicy.RUNTIME) // This annotation will be available at runtime
@Target(ElementType.TYPE) // This annotation can be applied to classes
@interface CustomAnnotation {
    String value() default "Default Value"; // Element with a default value
}

// Step 2: Create a class using built-in annotations and custom annotations
@CustomAnnotation("My Custom Class")
public class AnnotationsDemo {

    @Deprecated // Built-in annotation indicating this method is deprecated
    public void oldMethod() {
        System.out.println("This is an old method.");
    }

    public void newMethod() {
        System.out.println("This is the new method.");
    }

    public static void main(String[] args) {
        // Step 3: Use reflection to read the custom annotation
        Class<AnnotationsDemo> obj = AnnotationsDemo.class;

        // Check if the CustomAnnotation is present
        if (obj.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation annotation = obj.getAnnotation(CustomAnnotation.class);
            System.out.println("Custom Annotation Value: " + annotation.value());
        }

        // Step 4: Using built-in annotations
        AnnotationsDemo demo = new AnnotationsDemo();
        demo.oldMethod(); // This will show a warning in the IDE or compile time
        demo.newMethod();
    }
}