package HomeWork;

public class HomWork2 {
    public static void main (String[] args) {


        byte  b1= 12;  // 10 битная
        byte  b2= 0xC; // 16 битная
        byte  b3= 014; // 8 битная
        byte  b4= 0b1100; // 2 битная

        short s1= -1300;
        short s2= 0xFFFFFAEC;
        short s3= 037777775354;
        short s4= 0b11111111111111111111101011101100;

        int i1= 0;
        int i2= 0x0;
        int i3= 00;
        int i4= 0b0;

        long l1= 123456789L;
        long l2= 0x75BCD15L;
        long l3= 0726746425L;
        long l4= 0b0111010110111100110100010101;

        float f1= 12.365f;
        float f2= 45.00f;

        double d1= 12.25;
        double d2= 45.111;

        boolean a1= true;
        boolean a2= false;

        char c1 = 4454;
        char c2 = 5442;
        char c3 = 5543;
        char c4 = 0001;
        char c5 = '\u554A';
        char c6 = '\u543E';
        char c7 = '\u43ED';
        char c8 = '\u3EEC';


        System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4+
                "\n"+s1+"\n"+s2+"\n"+s3+"\n"+s4+
                "\n"+i1+"\n"+i2+"\n"+i3+"\n"+i4+
                "\n"+l1+"\n"+l2+"\n"+l3+"\n"+l4+
                "\n"+f1+"\n"+f2+
                "\n"+d1+"\n"+d2+
                "\n"+a1+"\n"+a2+
                "\n"+c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n"+c5+"\n"+c6+"\n"+c7+"\n"+c8);


    }
}



