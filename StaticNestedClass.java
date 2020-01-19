/**
 *
 * @author RAMESHA
 */

//Not technically inner class. Static memeber of the outer class.

class Outer1{
    void outerMethod(){
        System.out.println("Outer Method");
    }
    
    public static class StaticNestedClass{
        public static void main(String[] args) {
            new Outer1().outerMethod();
        }
    }
}

