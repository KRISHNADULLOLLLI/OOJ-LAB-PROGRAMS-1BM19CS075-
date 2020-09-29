import java.util.Scanner;

public class QuadraticEquation {
    private static Scanner sc;

    public static void main(String[] args) {
        double a, b, c;
        double root1, root2, imaginary, discriminant;
        sc = new Scanner(System.in);

        System.out.println(" ENTER CO-EFFICIENTS a,b,c : \n");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("\n TWO DISTINCT REAL ROOTS ARE: root1 = %.4f and root2 = %.4f ", root1, root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.printf("\n TWO EQUAL ROOTS: root1 = %.4f and root2 = %.4f",root1, root2);
        } else if (discriminant < 0) {

            System.out.println("\n ROOTS ARE NOT REAL");
        }
    }
}