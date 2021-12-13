package com.cherepakha.homework8;

import java.util.Random;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        /*
        2. Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ.
        Необходимо вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение.
         */
        Scanner scanner = new Scanner(System.in);
        String secondTask = scanner.nextLine();
        char chars = scanner.next().charAt(0);
        String test = scanner.nextLine();

        System.out.println(findSymbolOcсurance(secondTask, chars));


        /*
        3. Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
        Необходимо выяснить, является ли target (подстрока) частью строки source.
        Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.
         */
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        System.out.println(findWordPosition(firstWord, secondWord));

        /*
        4. Создать метод stringReverse.
        Метод принимает в качестве параметра строку.
        Необходимо ее развернуть и вернуть измененный вариант.
         */

        String fourthTask = scanner.nextLine();
        System.out.println(stringReverse(fourthTask));

        /*
        Создать метод isPalindrome. Метод принимает в качестве параметра строку.
        Необходимо Проверить является ли переданная строка палиндромом. Если да, тогда вернут true, иначе false.
         */
        String fifthTask = scanner.nextLine();
        System.out.println(isPalindrome(fifthTask));


        /*
        6. * Создать массив из слов
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
         */


        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        checkWord(words, scanner);


    }

    public static void checkWord(String[] words, Scanner scanner) {
        int min = 0;
        int max = words.length - 1;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        System.out.println(i);
        String prompt = "###############";
        String zeroing = "###############";


        while (true) {
            String fifthTask = scanner.nextLine();

            int k = 0;
            if (fifthTask.length() > words[i].length()) {
                k = words[i].length();
            } else if (fifthTask.length() < words[i].length()) {
                k = fifthTask.length();
            }

            if (fifthTask.equals(words[i])) {
                System.out.println("Слово угадано!");
                return;
            } else {
                for (int j = 0; j < k; j++) {
                    if (fifthTask.charAt(j) == words[i].charAt(j)) {
                        prompt = changeCharInPosition(j, fifthTask.charAt(j), prompt);
                    }
                }
                System.out.println(prompt);


            }
            prompt = zeroing;

        }
    }

    public static String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }


    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < (length / 2); ++i) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static String stringReverse(String word) {
        char[] array = word.toCharArray();
        int firstIndex = 0;
        int listIndex = array.length - 1;
        char temp;
        while (listIndex > firstIndex) {
            temp = array[firstIndex];
            array[firstIndex] = array[listIndex];
            array[listIndex] = temp;
            listIndex--;
            firstIndex++;
        }
        return new String(array);
    }


    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static int findSymbolOcсurance(String word, char cha) {
        int count = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == cha) {
                count++;
            }
        }
        return count;
    }
}
