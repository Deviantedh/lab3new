package Conditions;
public enum Conditionpower {
    on("Включен"),
    off("Выключен");
    private String abbreviation;

    Conditionpower(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
}
