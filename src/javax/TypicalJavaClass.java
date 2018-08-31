package javax;

import kotlinx.functions.DefaultFunctions;

public class TypicalJavaClass {

    public static void main(String...args){
       // System.out.println(SimplyAdd.add(1,3,4)); //From JVMName ::
        System.out.println(DefaultFunctions.area(8)); //From JVMName ::

    }

    public double area(int radius){
        return 3.14 * radius * radius;
    }
}
