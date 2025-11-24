import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("*** КАЛЬКУЛЯТОР ПОШЛИНЫ ***");
        System.out.println("____________________________");

        Scanner scn =  new Scanner(System.in);
        System.out.print("Введите цену товара в рублях (без копеек): ");
        int price = scn.nextInt();
        System.out.print("Введите массу товара в килограммах: ");
        int weight = scn.nextInt();
        int res = CustomsService.dutyCalc(price, weight);
        System.out.print("Сумма пошлины составляет: " + res + " руб.");
    }
}