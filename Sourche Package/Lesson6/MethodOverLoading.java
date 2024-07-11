package Lesson6;

public class MethodOverLoading {
    void shofw (int i1){
        System.out.println(i1);
    }
    void shofw(boolean b1){
        System.out.println(b1);
    }
    void showf(String s1 ,String s2){
        System.out.println(s1+s2);
    }
    void showf (String s1,int a1){
        System.out.println("String: " + s1 + " " + "int: " + a1);
    }
}
class MethodOverLoadingTest{
    public static void main(String[] args) {
        MethodOverLoading mO = new MethodOverLoading();
        int a = 500;
        mO.shofw(a);
        mO.shofw(700);
        mO.shofw(true);
        mO.shofw(false);
        mO.showf("Petr","Senya");
        mO.showf("Privet",10);
    }
}