package Tp3Objetos;
public class Student extends Person
{
    private int incomeYear;
    private double monthlyFee;
    private String career;

    public Student(String name, String surname, int dni, String email, int incomeYear, double monthlyFee, String career, String address)
    {
        super(name, surname, dni, email, address);
        this.incomeYear = incomeYear;
        this.monthlyFee = monthlyFee;
        this.career = career;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
    public int getIncomeYear() {
        return incomeYear;
    }
    public String getCareer() {
        return career;
    }


    @Override
    public String toString() {
        return  "Student = " + name + " " + surname +
                " | DNI = " + dni +
                " | Carrera = " + career +
                " | Email = " + email;
    }
}