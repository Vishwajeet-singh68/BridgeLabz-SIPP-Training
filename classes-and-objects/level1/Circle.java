public class Circle {
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    double area(){
        double area=22.0/7*radius*radius;
        return area;
    }
}
