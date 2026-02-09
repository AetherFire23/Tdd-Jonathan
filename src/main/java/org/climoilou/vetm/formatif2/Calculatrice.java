package org.climoilou.vetm.formatif2;

public class Calculatrice {

    public int add(String string) {
        if (string.isEmpty()) {
            return 0;
        }

        if (string.length() == 1) {
            return Integer.parseInt(string);
        }

        var splitted = string.split(",");

        int sum = 0;
        for (String s : splitted) {
            sum += Integer.parseInt(s);
        }

        return sum;
    }
}
