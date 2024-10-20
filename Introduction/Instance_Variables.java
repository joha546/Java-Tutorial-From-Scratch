public class Instance_Variables {
    
    // Declared Instance Variables
    public String m;
    public int i;
    public Integer I;
    public Instance_Variables(){

        // Default Constructor
        // initializing Instance Variable.
        this.m = "Md Khaled Bin Joha";
    }
    public static void main(String[] args){
        // object creation
        Instance_Variables name = new Instance_Variables();

        // Displaying O/P
        System.out.println("My name is: " + name.m);
        System.out.println("Default value for i is: " + name.i);
        // toString() called internally
        System.out.println("Default value for Integer is "+ name.I);
    }
}
