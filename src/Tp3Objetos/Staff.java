package Tp3Objetos;
public class Staff extends Person
{
    private double salary;
    private String workShift;

    public Staff(String name, String surname, int dni, String email, double salary, String workShift, String address)
    {
        super(name, surname, dni, email, address);
        this.salary = salary;
        this.workShift = workShift;
    }

    public double getSalary() {
        return salary;
    }
    public String getWorkShift() {
        return workShift;
    }

    public double annualSalary()
    {
        return salary*12;
    }

    @Override
    public String toString() {
        return "Staff = " + name + " " + surname +
                " | DNI = " + dni +
                " | Work shift = " + workShift +
                " | Email = " + email;
    }
}