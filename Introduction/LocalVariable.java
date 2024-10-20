public class LocalVariable {
    static int x = 11;
    static int y = 33;
    public void method1(int x){
        LocalVariable t = new LocalVariable();
        this.x = 22;
        y = 44;

        System.out.println("Local Variable.x = " + LocalVariable.x);
        System.out.println("t.x = " + t.x);
        System.out.println("t.y = " + t.y);
        System.out.println("y = " + y);


    }

    public static void main(String[] args){
        LocalVariable t = new LocalVariable();
        t.method1(5);
    }
}
