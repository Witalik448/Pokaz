package HomeWork;

public class Povtorene {

    String collor;
    String engien;
    int speed;


    int qaz(int skorst){
        speed+=skorst;
        return skorst;
    }

    int tormoz(int skorost){
        speed-=skorost;
        return skorost;
    }

    void shofInfio (){System.out.println("Cvet:  " + collor + "\nMotor:  " + engien + "\nCkorost:  " + speed);
    }
}

class PovtoreneTest{
    public static void main(String[] args) {
        Povtorene p1 = new Povtorene();
        p1.collor="Whate";
        p1.engien="V6";
        p1.speed=280;
        p1.shofInfio();
        p1.qaz(100);
        p1.shofInfio();



        Povtorene p2 = new Povtorene();
        p2.collor="Blue";
        p2.engien="V8";
        p2.speed=390;
        p2.shofInfio();
        p2.tormoz(280);
        p2.shofInfio();

    }
}