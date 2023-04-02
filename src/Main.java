import Tp3Objetos.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("=======Exercise 1=======");

        Cylinder cilindro1 = new Cylinder();
        cilindro1.setRadio(2.0);
        cilindro1.setHeight(1.5);
        System.out.println(cilindro1);
        System.out.println(cilindro1.volume());
        System.out.println(cilindro1.area());


        System.out.println("=======Exercise 2=======");


        Student jose = new Student("Jose", "Perez", 43092203, "jose@gmail.com", 2020, 1700.0, "TUA", "Fake 111");
        Student mario = new Student("Mario", "Gimenez", 23456012, "mario@gmail.com", 2022, 2000.0, "TUP", "Fake 222");
        Student josefa = new Student("Josefa", "Degem", 42001361, "josefa@gmail.com", 2021, 1500.0, "TUAP", "Fake 333");
        Student pedro = new Student("Pedro", "Carui", 45012443, "pedro@gmail.com",  2023, 2000.0, "TUP", "Fake 444");

        Staff juana = new Staff("Juana", "Del Mar", 36658909, "juana@gmail.com", 30000.0, "Afternoon", "Fake 555");
        Staff roberto = new Staff("Roberto", "Ciel", 22491882, "roberto@gmail.com", 100000.0, "Morning", "Fake 666");
        Staff silvia = new Staff("Silvia", "Rodriguez", 30836901, "silvia@gmail.com", 300000.0, "Morning", "Fake 777");
        Staff elena = new Staff("Elena", "Ancel", 16422947, "elena@gmail.com", 30000.0, "Morning", "Fake 888");

        Person[] utn = new Person[8];

        utn[0] = jose;
        utn[1] = mario;
        utn[2] = josefa;
        utn[3] = pedro;
        utn[4] = juana;
        utn[5] = roberto;
        utn[6] = silvia;
        utn[7] = elena;

        int e = 0;//Amount of students
        int s = 0;//Amount of staffs
        int studentsIncome = 0;//income from students to the institution

        for(Person a: utn)
        {
            if(a instanceof Student) { ++e; studentsIncome += ((Student) a).getMonthlyFee();  }
            else if(a instanceof Staff) { ++s; }
        }

        System.out.println("Amount of students = " + e);
        System.out.println("Amount of staffs = " + s);
        System.out.println("Income from students to the institution = " + studentsIncome);

        System.out.println("======Exercise 3======");

        Circle circle = new Circle("Red", 1.5);
        Rectangle rectangle = new Rectangle(10.0, 20.0, "Red");
        Square square = new Square(2, "Red");

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


    }
}