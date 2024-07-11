package Lesson4;

public class BankAccaunt {

    int id =10;
    //String name="Petr";
    String name = new String("Petr");
    double balnce=147.77;
}

class BankAccauntTest{
    public static void main(String[] args) {
        BankAccaunt MyAccaunt = new BankAccaunt();
        BankAccaunt HisAccaunt = new BankAccaunt();
        BankAccaunt YuorAccaunt = new BankAccaunt();

        MyAccaunt.id=1;
        MyAccaunt.name="Zaur";
        MyAccaunt.balnce=12.35;

        HisAccaunt.id=2;
        HisAccaunt.name="Daniil";
        HisAccaunt.balnce=122.35;


        YuorAccaunt.id=3;
        YuorAccaunt.name="Levan";
        YuorAccaunt.balnce=156.35;

        System.out.println(HisAccaunt.name+"\n" + HisAccaunt.id+ "\n" + HisAccaunt.balnce);
    }

}
