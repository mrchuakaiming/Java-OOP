public class Circle{
    //Attributes
    private double radius;

    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Setter
    public void setRadius(double radius){
        this.radius = radius;
    }

    //Getter
    public double getRadius(){
        return this.radius;
    }

    //Methods
    public double Circumference(double radius){
        return 2*3.142*radius;
    }
    public double Area(double radius){
        return 3.142*radius*radius;
    }
}