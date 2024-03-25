import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static double[] solved(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{x1, x2};

        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return new double[]{x};

        } else {
            return new double[]{};
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення коефіцієнтів a, b і c
        System.out.print("Введіть коефіцієнт a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть коефіцієнт b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть коефіцієнт c: ");
        double c = scanner.nextDouble();

        // Розв'язання квадратного рівняння
        solved(a,b,c);
        System.out.println(Arrays.toString(solved(a,b,c)));

        scanner.close();
    }


}
