package TeamReaderProblem;

public class SuperUser extends User implements AdminRole{

    public SuperUser(String username) {
        super(username);
    }

    @Override
    public void writeReview() {
        System.out.println("ReviewRole을 맡아서 리뷰 작성할 수 있습니다.");
    }

    @Override
    public void giveRating() {
        System.out.println("ReviewRole을 맡아서 점수 평가할 수 있습니다.");
    }


    @Override
    public void order() {
        System.out.printf("유저(%s)은 주문을 할 수 있습니다.\n",super.username);
    }

    @Override
    public void payment() {
        System.out.printf("유저(%s)은 결제를 할 수 있습니다.\n",super.username);
    }

    @Override
    public void manageUsers(){
        System.out.printf("슈퍼유저(%s)은 유저를 매니징 할 수 있습니다.\n",super.username);
    }

    @Override
    public void changeSettings(){
        System.out.printf("슈퍼유저(%s)은 세팅을 변경할 수 있습니다.\n",super.username);
    }
}
