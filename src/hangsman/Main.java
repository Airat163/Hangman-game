package hangsman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        while (true) {
            System.out.println("Начать новую игру - (g)");
            System.out.println("Выход - (c)");
            System.out.print("Ввод = ");
            char input = new Scanner(System.in).nextLine().charAt(0);

            if (input == 'g') {
                game.play();
            } else if (input == 'c') {
                System.out.println("Программа завершена!");
                break;
            } else {
                System.out.println("Вы ввели не тот символ!");
            }
        }
    }
}
