import java.util.Scanner;

public class areaoftriangle {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        
        double height = 0;
        double base =0;

        System.out.print("Enter the height of the triangle: ");
        height = scanner.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        base = scanner.nextDouble();

        System.out.println("The area of a triangle is: " + (0.5 * base * height));


        scanner.close();
    }
}