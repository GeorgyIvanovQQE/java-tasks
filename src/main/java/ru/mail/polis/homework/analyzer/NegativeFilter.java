package ru.mail.polis.homework.analyzer;

public class NegativeFilter extends SpamFilter {

    public NegativeFilter() {
        super(new String[] {"=(", ":(", ":|"});
    }

    public FilterType analyze(String text) {
        return super.analyze(text) == FilterType.SPAM
                ? FilterType.NEGATIVE_TEXT
                : FilterType.GOOD;
    }
    @Override
    public FilterType getType() {
        return FilterType.NEGATIVE_TEXT;
    }


}
