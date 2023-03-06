import java.util.Scanner;

public class Metres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество фут: ");
        double futs = input.nextDouble();
        double metres = futs * 0.305;
        System.out.println("Количество метров: " + metres);
    }
}