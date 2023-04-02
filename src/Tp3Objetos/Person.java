package Tp3Objetos;

public class Person
{
    protected int dni;
    protected String name;
    protected String surname;
    protected String email;
    protected String address;

    public Person()
    {
        this.dni = -1;
        this.name = "x";
        this.surname = "x";
        this.email = "x@x";
        this.address = "x1";
    }

    public Person(String name, String surname, int dni, String email, String address)
    {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getSurname() {
        return surname;
    }
    public int getDni() {
        return dni;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
