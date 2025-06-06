import java.util.Scanner;

import static ru.netology.service.CustomsService.calculateCustoms;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int answer = calculateCustoms(price,weight);
        System.out.println("Размер пошлины (в руб.) составит: " + answer );
    }


}