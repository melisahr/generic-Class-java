//Generic class can have two parameters
public class MyGenericClass <Thing extends Number, Thing2>{
    //Variable
    Thing x;
    Thing2 y;

    //constructor
    MyGenericClass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }
    public Thing2 getValue(){
        return y;
    }
}
