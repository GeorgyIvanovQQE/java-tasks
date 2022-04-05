package ru.mail.polis.homework.analyzer;

/**
 * Типы фильтров (2 тугрика)
 */
public enum FilterType {
    SPAM (0),
    TOO_LONG (1),
    NEGATIVE_TEXT (2),
    GOOD (3);

    private final int priority;

    FilterType(int priority) {
        this.priority = priority;
    }

    public int GetPriority() {
        return priority;
    }
}

