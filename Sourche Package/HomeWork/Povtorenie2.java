package HomeWork;

public class Povtorenie2 {

    int id;
    String name;
    String surname;
    int age;
    int balance;


    int poplnenie(int plus){
        balance+=plus;
        return plus;
    }

    int snatie(int minus){
        balance-=minus;
        return minus;
    }

    void showInfo(){
        System.out.println("Id:  " + id + "\nName:  " + name + "\nSurname: " + surname + "\nAge:  " + age + "\nBalance:  " + balance + "\n\n\n\n");
    }
}

class Povtorenie2Test{
    public static void main(String[] args) {

        Povtorenie2 klient1 = new Povtorenie2();

        klient1.id = 147787458;
        klient1.name ="Ruben";
        klient1.surname="Ilyasov";
        klient1.age=19;
        klient1.balance=200000;
        klient1.showInfo();
        klient1.poplnenie(200000);
        klient1.showInfo();
        klient1.snatie(150000);
        klient1.showInfo();


        Povtorenie2 klient2 = new Povtorenie2();
        klient2.id = 457899874;
        klient2.name = "Arseniy";
        klient2.surname = "Seredko";
        klient2.age = 19;
        klient2.balance = 0;
        klient2.showInfo();
        klient2.poplnenie(50000000);
        klient2.showInfo();
        klient2.snatie(49999999);
        klient2.showInfo();


        Povtorenie2 klient3 = new Povtorenie2();
        klient3.id=789978542;
        klient3.name="Nadezda";
        klient3.surname="Plum";
        klient3.age=20;
        klient3.balance=4511154;
        klient3.showInfo();
        klient3.poplnenie(1000);
        klient3.showInfo();
        klient3.snatie(4512100);
        klient3.showInfo();


    }
}