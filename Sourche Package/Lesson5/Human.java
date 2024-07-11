package Lesson5;

public class Human {
    String name;
    Car3 car3;
    BankAccaunt bA;

void Info(){
    System.out.println("Imya:  " + name + "\ncvet machinyi:  " + car3.collor + "\nbalance bankovskogo scheta:  " + bA.balnce);
    }

}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name="Zaur";
        h.car3= new Car3("Red","V8");
        h.bA= new BankAccaunt(10,255546);
        h.Info();
    }
}


class Car3{
    Car3(String c , String e){
        collor=c;
        engine=e;
    }

    String collor;
    String engine;
}

class BankAccaunt{
    BankAccaunt(int id2,double balnce2){

        id=id2;
        balnce=balnce2;
    }
    int id;
    double balnce;

    }
