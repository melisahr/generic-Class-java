import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Instance of Object
        MyGenericClass <Integer,Integer> myInt = new MyGenericClass<>(1,5);
        MyGenericClass <Double,Double> myDouble = new MyGenericClass<>(3.14,2.15);
        //MyGenericClass <Character,Character> myChar= new MyGenericClass<>('@','#');
        //MyGenericClass <String,Character> myString = new MyGenericClass<>("Hello", 'y');

        //bounded types = you can create the objects of a generic class
        //          to have data of a specific derived types ex.Number

       //Call method
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());
   }
}