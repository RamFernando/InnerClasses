package innerclasses;

/**
 *
 * @author RAMESHA
 */

//This test class can be a interface too
class TestSubject {

    void testMethod() {
        System.out.println("Test Method");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {
        TestSubject subject = new TestSubject() {
            @Override
            void testMethod() {
                System.out.println("Overriden Test Method");
            }
        };
        
        subject.testMethod();
    }
}
