package com.cherepakha.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ThirdTask {
    public static void main(String[] args) throws IOException {
        /*
        Every valid email consists of a local name and a domain name,
        separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.

        For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.

        If you add periods '.' between some characters in the local name part of an email address,
        mail sent there will be forwarded to the same address without dots in the local name.
        Note that this rule does not apply to domain names.

        For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.

        If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
        This allows certain emails to be filtered. Note that this rule does not apply to domain names.

        For example, "m.y+name@email.com" will be forwarded to "my@email.com".

        It is possible to use both of these rules at the same time.

        Given an array of strings emails where we send one email to each email[i],
        return the number of different addresses that actually receive mails.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер массива строк: ");
        String stringReader = reader.readLine();
        int arrayLength = Integer.parseInt(stringReader);

        String[] array = new String[arrayLength];
        System.out.println("Заполним массив строк.");
        for (int i = 0; i < array.length; i++) {
            String arrayReader = reader.readLine();
            array[i] = arrayReader;
        }

        int number = numUniqueEmails(array);
        System.out.println("The number of different addresses that actually receive mails : " + number);

        reader.close();
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            int charIndex = email.indexOf('@');
            String rest = email.substring(charIndex);
            String local = email.substring(0, charIndex);

            StringBuilder strBuild = new StringBuilder(email.length());
            for (char symbol : local.toCharArray()) {
                if (symbol == '.') {
                    continue;
                } else if (symbol == '+') {
                    break;
                }
                strBuild.append(symbol);
            }

            set.add(strBuild.append(rest).toString());
        }

        return set.size();
    }
}
