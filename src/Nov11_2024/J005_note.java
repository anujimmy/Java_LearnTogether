package Nov11_2024;


public class J005_note {
    static int a = 100;
    int c = 1;
    public static void main(String[] args) {
        int b = 500;
        System.out.println("hello Jahnvi How are you ?");
        System.out.println("inside main a" + a);
        anu();
        System.out.println("inside main b" + b);
        System.out.println("inside main a" + a);
    }
    public void jahnvi(){
        int c = a;
    }
    public static void anu(){
        int b = 200;
        System.out.println("inside anu -"+ b);
        System.out.println("inside anu -"+ a);
        a = 600;
    }
}
