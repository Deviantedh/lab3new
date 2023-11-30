package Conditions;
public enum Conditionhp {
    intact("Целый"),
    broken("Сломан");
    private String abbreviation;

    Conditionhp(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }

}
