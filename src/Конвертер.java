import java.util.Scanner;

public class Конвертер {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input rub course: ");
    double rubCourse = scanner.nextDouble();
    System.out.print("Input rub count: ");
    double rubCount = scanner.nextDouble();
    System.out.println("You can buy "+ convert(rubCourse,rubCount)+" eur.");
}

    static double convert(double rubCourse, double count){
        return count/rubCourse;

    }
}
