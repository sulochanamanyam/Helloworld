public class HelloWorld {

    int a=1;
    HelloWorld() {
        System.out.println("Constructor");
    }

    HelloWorld(int a) {
        System.out.println("Constructor");
    }

    {
        System.out.println("IIB form HelloWorld");
    }

    static {
        System.out.println("SIB from HelloWorld");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld hello=new HelloWorld();
        Operations operations=new Operations();
        Operations operations1=new Operations();
        operations.add(1,2);
        operations.value=100;
        operations1.add(1,2);
    }

}

class Operations  {

    Operations() {
        System.out.println("constructor from Operations");

    }
    int value=5;
    public void add(int a, int b) {
        int sum=a+b;
        System.out.println("Hello from test method from Operations and Sum:"+ sum);

    }

    {
        System.out.println("IIB form Operations");
    }

    static {
        System.out.println("SIB from Operations");
    }
    public static void main(String[] args) {
        System.out.println("ksfksdj");
    }
}
