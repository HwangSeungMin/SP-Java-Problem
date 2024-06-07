import java.util.*;
public class Calculator {
    public static void main(String[] args) throws InvalidNumberException{
        // 변수 선언 및 초기화
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        Scanner sc = new Scanner(System.in);
        try {
            // 숫자1 입력
            System.out.print("숫자 1 입력 : ");
            String nextLine1 = sc.nextLine();
            if((Double.parseDouble(nextLine1))%1==0){
                num1 = Integer.parseInt(nextLine1);
            }else{
                throw new InvalidNumberException("지원하지 않는 숫자 형식 입니다. ");
            }
            // 숫자2 입력
            System.out.print("숫자 2 입력 : ");
            String nextLine2 = sc.nextLine();
            if((Double.parseDouble(nextLine2))%1==0){
                num2= Integer.parseInt(nextLine2);
            }else{
                throw new InvalidNumberException("지원하지 않는 숫자 형식 입니다. ");
            }
            // 연산자 입력
            System.out.print("연산자 입력 : ");
            String op = sc.nextLine();
            char c_op = (char)op.charAt(0);
            // calculate 메소드 호출
            result = calculate(num1,num2,c_op);
            // 결과 출력
            System.out.println(result);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (InvalidNumberException e){
                System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        } finally {
            sc.close();
        }
    }
    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        int result = 0;

        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if(num2 == 0){throw new DivideByZeroException("나누는 수가 0이 될 수 없습니다.");}
                result = num1/num2;
                break;
            default:
                throw new InvalidOperatorException("올바른 사칙연산의 연산자가 아닙니다. [ +,-,*,/ ]");

        }
        // 사칙연산 수행 및 예외 처리
        return result;
    }
}