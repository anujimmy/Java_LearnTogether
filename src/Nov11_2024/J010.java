package Nov11_2024;

public class J010 {
//    static double pi = 3.14159265358979d;
    static double pi = 3.1415d;

    public static void main(String[] args) {
        float radius = 5.0f;
        double c = circumference(radius);
        System.out.println("circumference is "+ c);
    }
    public static double circumference(float r){
        double circum =  2 * pi * r;
        return circum;
    }
    public static double area(float r){
        double area =  pi * r * r;
        return area;
    }
}
