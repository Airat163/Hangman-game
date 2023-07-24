package hangsman;

import java.util.*;

import static hangsman.Scaffold.*;

public class Game {
    private static final Scaffold[] SCAFFOLDS =
            {ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX};       // отображение состояния виселицы
    private static final int ERROR_MAX = 6;                 // максимальное количество ошибок
    private static String word;                             // загаданное слово
    private static String wordView;                         // отображение загаданного слова
    private static int error;                               // количество ошибок
    private static List<Character> inputLetterList;         // учет введенных букв

    private boolean isGameOver() {
        if (error == ERROR_MAX) {
            System.out.println(SCAFFOLDS[error] + "\n");
            System.out.println("Вы проиграли! \n" + "Загаданное слово это = " + word);
            return true;

        } else if (!wordView.contains("_")) {
            System.out.println("\n Вы выйграли! \n" + "Загаданное слово это = " + word);
            return true;
        }

        return false;
    }

    private char readerKeyboard() {
        System.out.print("Введите букву = ");
        char letter = new Scanner(System.in).nextLine().trim().charAt(0);

        do {
            if (inputLetterList.contains(letter)) {
                System.out.print("\nВы уже вводили эту букву! \nВведите букву = ");
                letter = new Scanner(System.in).nextLine().trim().charAt(0);
            }
        } while (inputLetterList.contains(letter));

        inputLetterList.add(letter);
        return letter;
    }

    private void checkWord() {
        char inputLetter = readerKeyboard();

        if (word.contains(String.valueOf(inputLetter))) {
            char[] charsWord = word.toCharArray();
            char[] charsRiddle = wordView.toCharArray();

            for (int i = 0; i < word.length(); i++) {
                if (charsWord[i] == inputLetter) {
                    charsRiddle[i] = charsWord[i];
                }
            }
            wordView = new String(charsRiddle);
        } else {
            System.out.println("не угадали!");
            error++;
        }
    }

    public void play() {
        word = Words.getWord();
        wordView = "_".repeat(word.length());
        error = 0;
        inputLetterList = new ArrayList<>();

        while (!isGameOver()) {
            System.out.println(SCAFFOLDS[error]);
            System.out.println("Загаданное слово " + wordView + "\nКоличество ошибок " + error);
            checkWord();
        }
    }
}

