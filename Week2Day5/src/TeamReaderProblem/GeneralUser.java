package TeamReaderProblem;

public class GeneralUser extends User implements CustomerRole{
    public GeneralUser(String username) {
        super(username);
    }
    @Override
    public void order() {
        System.out.printf("유저(%s)은 주문을 할 수 있습니다.\n",super.username);
    }

    @Override
    public void payment() {
        System.out.printf("유저(%s)은 결제를 할 수 있습니다.\n",super.username);
    }
}