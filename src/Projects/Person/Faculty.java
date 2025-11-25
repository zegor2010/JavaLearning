package Projects.Person;

public class Faculty extends Employee {

    private int workedHours;
    public String rank;

    public int getHours() {
        return workedHours;
    }
    public void setHours(int workedHours) {
        this.workedHours = workedHours;
    }
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public Faculty(String name, String address, int phone, String email, String office, double salary, String dateHired, int workedHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.workedHours = workedHours;
        this.rank = rank;
    }
}