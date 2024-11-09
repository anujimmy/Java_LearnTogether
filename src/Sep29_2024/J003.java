package Sep29_2024;

public class J003 {
    int  num = 10;
    public void anu(){
        int i = 10; //local variable
        System.out.println("chak de");
        System.out.println(num);
    }
    public static void main(String[] a){

        J002 j = new J002();
//        System.out.println(i); -> error
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[3]);

    }
}
