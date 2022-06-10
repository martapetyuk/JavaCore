package HomeWork6;

import java.util.Scanner;

public class Interface {

    private Controller controller = new Controller();

    public static void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введитегород: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения погоды на сегодня;" +
                    "Введите 5 для прогноза на 5 дней");

            String command = scanner.nextLine();

        }
    }
}
