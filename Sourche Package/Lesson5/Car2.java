package Lesson5;

public class Car2 {
    String collor;
    String engine;
    int speed;


    int qaz(int skorost) {
        speed += skorost;
        return skorost;
    }

    int tormoz(int skorost){
        speed -= skorost;
        return skorost;
    }

    void showInfo(){
        System.out.println("Cvet:  " + collor + "\nMotor:  " + engine + "\nSkorost:  " + speed);
    }
}

class Car2Test{
    public static void main(String[] args) {
        Car2 c1 =  new Car2();

        c1.collor="Red";
        c1.engine="V8";
        c1.speed=60;
        c1.showInfo();
        c1.qaz(20);
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();
    }
}

