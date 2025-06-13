import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int base=in.nextInt();
        int height=in.nextInt();
        float areaInSqIn=1/2*base*height;
        double areaInSqCm=1/2*(base*2.54)*(height*2.54);
        System.out.println("The Area of the triangle in sq in is "+areaInSqIn+" and sq cm is "+areaInSqCm);
    }
}
