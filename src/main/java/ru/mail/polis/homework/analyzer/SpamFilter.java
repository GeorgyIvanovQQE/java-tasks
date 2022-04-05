package ru.mail.polis.homework.analyzer;

public class SpamFilter implements TextAnalyzer {

    private final String[] restrictedWords;

    public SpamFilter(String[] restrictedWords) {
        this.restrictedWords = restrictedWords;
    }

    @Override
    public FilterType analyze(String text) {
        if (text == null) {
            return FilterType.GOOD;
        }

        for (String restrictedWords : restrictedWords) {
            if (text.contains(restrictedWords)) {
                return FilterType.SPAM;
            }

        }
        return FilterType.GOOD;
    }

    @Override
    public FilterType getType() {
        return FilterType.SPAM;
    }
}
