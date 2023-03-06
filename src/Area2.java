import java.util.Scanner;

public class Area2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сторону шестиугольника: ");
        int side = input.nextInt();
        double area = 3*Math.sqrt(3)/3*side*side;
        System.out.println("Площадь шестиугольника составляет: " + area);
    }
}