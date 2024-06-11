package Lecture56_57_1;

public class LambdaUseTest {
    public static void main(String[] args) {
        MultipleNum mNum = (num) -> num*10;
        printNum(mNum);

        printNum((x) -> x*100);

        GeneticLambda<String> gl1 = (str) -> str.toUpperCase();;
        GeneticLambda<Integer> gl2 = (num) -> num*10;
        GeneticLambda<Boolean> gl3 = (myBool) -> myBool & true;

        System.out.println(gl1.calculate("abc"));
        System.out.println(gl2.calculate(5));
        System.out.println(gl3.calculate(true));
    }

    static void printNum(MultipleNum mNum) {
        int result = mNum.calculate(5);
        System.out.println(result);
    }
}
