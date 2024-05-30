public class Customer {
    private long cash = 100_000;
    private boolean likeDelivery;

    public Customer(){
        this.likeDelivery = true;
    }

    public Order order(Customer customer,Sneakers sneakers , int aMount){
        System.out.println("Sneakers"+sneakers.getS_id()+"가 마음에 들어요."+aMount+" 개 주문 할게요.");
        Order order = new Order(customer,sneakers,aMount);
        return order;
    }

    public long getCash() {
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
    }

    public boolean isLikeDelivery() {
        return likeDelivery;
    }

    public void setLikeDelivery(boolean likeDelivery) {
        this.likeDelivery = likeDelivery;
    }
}
