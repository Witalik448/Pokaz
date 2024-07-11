package HomeWorkLesson5;

public class BankAccaunt {
    int id;
    String name;
    String surname;
    int ballance;

    }

class  BankAccauntTest{
    public static void main(String[] args) {
        BankAccaunt client1 = new BankAccaunt();
        client1.id=10;
        client1.name="Иван";
        client1.surname="Жуков";
        client1.ballance=5000;


        BankAccaunt client2 = new BankAccaunt();
        client2.id=11;
        client2.name="Сергей";
        client2.surname="Добрянский";
        client2.ballance=5000;


        BankAccaunt client3 = new BankAccaunt();
        client3.id=12;
        client3.name="Михаил";
        client3.surname="Сорокин";
        client3.ballance=5000;

        System.out.println(client1.id+"\n");
    }
}
