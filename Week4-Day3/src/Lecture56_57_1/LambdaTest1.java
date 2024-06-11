package Lecture56_57_1;

public class LambdaTest1 {
    public static void main(String[] args) {
        MultipleNum m1 = x -> x;
        MultipleNum m2 = (x) -> x*2;
        MultipleNum m3 = (x) -> {return x*3;};
        MultipleNum m4 = (int myInt) -> {return myInt*4;};

        System.out.println(m1.calculate(5));
        System.out.println(m2.calculate(5));
        System.out.println(m3.calculate(5));
        System.out.println(m4.calculate(5));

        StringNum sn1 = (x,y)->System.out.println(x);
        StringNum sn2 = (x,y)->{
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<y;i++){
                sb.append(x);
            }
            System.out.println(sb.toString());
        };
        StringNum sn3 = (String x,int y)->{
            for(int i=0;i<y;i++){
                System.out.println(x);
            }
        };

        sn1.printString("Hello",5);
        sn2.printString("World",5);
        sn3.printString("HI",5);
    }
}