package org.climoilou.vetm.formatif2;

import static java.lang.Integer.parseInt;

public class Calculatrice {

    public int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        if (string.length() == 1) {
            return Integer.parseInt(string);
        }

        if (!Character.isDigit(string.charAt(string.length() - 1))) {
            throw new CustomEx("Doesnt work if last is not number ");
        }

        boolean isCustomDelimiter = string.contains("//");

        String trimmedString = "";
        if (isCustomDelimiter) {
            char customDelimiter = string.charAt(2);

            for (int i = 3; i < string.toCharArray().length; i++) {
                Character c = string.charAt(i);
                if (Character.isDigit(c) || c == customDelimiter) {
                    trimmedString += c;
                }
            }
        }

        String toUse = isCustomDelimiter ? trimmedString : string;

        String pattern = determinePattern(string);

        // accumuler en separant la string par le delimiteur
        var splitted = toUse.split(pattern);

        int sum = 0;
        for (String ss : splitted) {
            sum += Integer.parseInt(ss);
        }

        return sum;
    }

    boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }

    public String determinePattern(String str) {
        String pattern = "[,\n]";

        if (str.contains("//")) {
            pattern = "[" + str.charAt(2) + "]";
        }

        return pattern;
    }
}
