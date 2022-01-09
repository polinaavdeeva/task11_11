package ru.vsu.cs.avdeeva_p_a;

public class NumberingOfSentences {

    public static String numberingOfSentences(String inputText) {
        StringBuilder sentences = new StringBuilder();
        int count = 0;

        for (int i = 0; i < inputText.length(); i++) {
            sentences.append(inputText.charAt(i));

            if ((inputText.charAt(i) == '.' && inputText.charAt(i - 1) != '.')
                    || (inputText.charAt(i) == '!' && inputText.charAt(i - 1) != '!')
                    || (inputText.charAt(i) == '?' && inputText.charAt(i - 1) != '?')) {
                sentences.append("[").append(++count).append("]");
            }
        }
        return sentences.toString();
    }
}
