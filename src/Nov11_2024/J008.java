package Nov11_2024;

public class J008 {
    String b = " World";//instance variable - outside method
    static String d = " World";//static variable - outside method
    public static void main(String[] args) {
        String a = "Hello"; //local variable
//        int a = 100; not allowed
        System.out.println(a+d);
    }
    public void Jaan(){
        String c = "Hello Jaan";
//        System.out.println(a); local variable can be used in that method where it is instantiated
        System.out.println(c+b+d);
    }
}
