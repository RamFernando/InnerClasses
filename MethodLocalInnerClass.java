/**
 *
 * @author RAMESHA
 */
class Outer {

    public void outerMethod() {
        
        //can be final(only final until JDK 1.8) and non-final
        final String var1 = "Outer method varible";
        
        //cannot be private, protected, static and transient but can be marked as abstract and final but not at the same time
        class MethodLocalInnerClass {
            void innerMethod(){
                System.out.println("Inner Method has access to "+var1);
            }
        }
        
        MethodLocalInnerClass classInner = new MethodLocalInnerClass();
        classInner.innerMethod();
    }
    
    public static void main(String[] args) {
        new Outer().outerMethod();
    }
}
