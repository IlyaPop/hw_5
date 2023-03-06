import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите радиус цилиндра: ");
        double radius = input.nextDouble();
        System.out.println("Введите длину цилиндра: ");
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        System.out.println("Площадь цилиедра равна: " + area);
        double volume = area * length;
        System.out.println("Объем цилиндра равен: " + volume);
    }
}