package Projects.Person;

public class Student extends Person {
    public String FRESHMAN = "freshman";
    public String SOPHOMORE = "sophomore";
    public String JUNIOR = "junior";
    public String SENIOR = "senior";

    public Student(String name, String address, int phone, String email, String status) {
        super(name, address, phone, email);
    }
}

