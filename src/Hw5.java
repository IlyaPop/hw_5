import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму денег: ");
        double sum = input.nextDouble();
        double cent = sum * 100;
        System.out.println("Сумма в центах: " + cent);
        int dollar = (int) cent / 100;
        System.out.println("Сумма в долларах: " + dollar);
        cent = cent % 100;
        System.out.println("Остаток центов: " + cent);
        int quarter = (int) cent / 25;
        cent = cent % 25;
        System.out.println("Сумма четвертаков составляет " + quarter);
        int dime = (int) cent / 10;
        cent = cent % 10;
        System.out.println("Сумма десятицентников составляет: " + dime);
        int nickel = (int) cent / 5;
        cent = cent % 5;
        System.out.println("Сумма никелей составляет: " + nickel);
        int penny = (int) cent;
        System.out.println("Сумма пенни составляет: " + penny);
    }
}