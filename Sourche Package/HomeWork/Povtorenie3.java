package HomeWork;

public class Povtorenie3{
    int id;
    int age;
    String name;
    String surname;

    Student student;
    SredniyBallPoPredmetam sredBall;

    void Info(){
        System.out.println("\nNomer studenchiskogog:  " + student.namberStudent +
                "\nName: " + student.name +
                "\nSurname: " + student.surname +
                "\nVozrost: " + student.age +
                "\nSredniy ball Match:" + sredBall.sredniyBallPoMAtch +
                "\nSredniy ball Econom:" + sredBall.sredniyBallPoEconom +
                "\nSredniy ball Englis:" + sredBall.sredniyBallPoEnglis + "\n");
    }


}

class Student{
     Student(int namberStudent, int age, String name,String surname){
         this.namberStudent=namberStudent;
         this.age=age;
         this.name=name;
         this.surname=surname;
     }
    int namberStudent;
    int age;
    String name;
    String surname;
}

class SredniyBallPoPredmetam{
    SredniyBallPoPredmetam(double sredniyBallPoMAtch, double sredniyBallPoEconom, double sredniyBallPoEnglis){
        this.sredniyBallPoMAtch=sredniyBallPoMAtch;
        this.sredniyBallPoEconom=sredniyBallPoEconom;
        this.sredniyBallPoEnglis=sredniyBallPoEnglis;

    }

    double sredniyBallPoMAtch;
    double sredniyBallPoEconom;
    double sredniyBallPoEnglis;
}


class Povtorenie3Test{
    public static void main(String[] args) {
        Povtorenie3 h = new Povtorenie3();
        h.student = new Student(14,19,"Ruben","Ilyasov");
        h.sredBall = new SredniyBallPoPredmetam(5.5,9.2,7.8);
        h.Info();

        Povtorenie3 h1 = new Povtorenie3();
        h.student = new Student(15,21,"Vitaliy","Jabrailov");
        h.sredBall = new SredniyBallPoPredmetam(10,10,10);
        h.Info();
    }
}
