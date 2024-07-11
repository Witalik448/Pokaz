package Lesson6;

public class MethodOverLoading2 {
   public int summ(int i1, int i2){
        return i1+i2;
    }
    protected String summ(String s1, String s2){
        return s1+s2;
    }
}

class MethodOverLoading2Test{
    public static void main(String[] args) {
        MethodOverLoading2 mO2 = new MethodOverLoading2();

        int i= mO2.summ(1,1);
        System.out.println(i);
        String s=mO2.summ("Privet,"," moy drug");
        System.out.println(s);
    }
}