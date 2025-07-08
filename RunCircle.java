import java.util.Scanner;
public class RunCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle radius (cm): ");
        double radius = input.nextDouble();
        Circle circle1 = new Circle(radius);
        System.out.println("Radius of the circle (cm): " + circle1.getRadius());
        System.out.printf("Circumference of the circle (cm): %.2f%n", circle1.Circumference(radius));
        System.out.printf("Area of the circle (cm): %.2f%n", circle1.Area(radius));
    }
}
