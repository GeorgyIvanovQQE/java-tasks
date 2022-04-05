package ru.mail.polis.homework.analyzer;

public class TooLongFilter implements TextAnalyzer{

    private final long maxLength;

    public TooLongFilter(long maxLength) {
        this.maxLength = maxLength;

    }

    public FilterType analyze(String text) {

        if (text == null) {
            return FilterType.GOOD;
        }

        return text.length() > maxLength
                ? FilterType.TOO_LONG
                : FilterType.GOOD;
    }

    @Override
    public FilterType getType() {
        return FilterType.TOO_LONG;
    }


}

