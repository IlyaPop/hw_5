import java.util.Scanner;

public class Kilogramms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Напишите количество фунтов: ");
        double funts = input.nextDouble();
        double killograms = funts * 0.454;
        System.out.println("Количество килограмм: " + killograms);
    }
}