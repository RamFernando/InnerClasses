/**
 *
 * @author RAMESHA
 */
class Outerclass{ 
    private final String var1 = "variable of Outer";
    
    //can access any private instance variable of outer class. Can have private, protected, public and default.
    
    public class NestedInnerClass {
        public void m(){
            System.out.println("Nested Inner class has "+var1);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Outerclass.NestedInnerClass nic=new Outerclass().new NestedInnerClass();
        nic.m();
    }
}