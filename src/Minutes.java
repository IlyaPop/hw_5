import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количесвто минут: ");
        long minutes = input.nextLong();
        int years = (int) (minutes / 525600);
        int days = (int) minutes / 1440;
        System.out.println("Количество дней в " + minutes + " минут  составляет " + days);
        System.out.println("Количество лет в " + minutes + " минут  составляет " + years);
    }
}