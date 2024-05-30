public class Staff {
    private long sales = 100_000;
    private Sneakers sneakers;
    private boolean havingNikeSneakersInStore;


    public Order staffWorkProcess(Order order){
        long orderPrice = order.getaMount() * order.getSneakers().getPrice();
        if (order.getCustomer().getCash() > orderPrice){ // isValid Customer Cash
            // checkHavingInStore , checkDeliveryLike : return to OrderPrice
            if(checkHavingInStore(order)){
                // ex2. 신발가격이 예산 안에있고 매장에 재고가 존재하는 경우
                return order;
            }else if(order.getCustomer().isLikeDelivery()){
                // ex4. 신발과 배송료 모두 예산안에 있고 배송을 통해 신발을 구매하는 경우
                System.out.println("고객님 죄송하지만 , 재고가 남아있지 않아 배송주문으로 진행 해드리겠습니다.");
                SneakersPackage sneakersPackage = DeliverManager.SneakersPackaging(order);
                System.out.println("고객님 배송주문 처리 완료 되었으며 배송기한은"+sneakersPackage.getDayForDelivery()
                        +" 일 소요되며 , 배송 가격은 "+sneakersPackage.getCostForDelivery()+"입니다.");
                if(order.getCustomer().getCash() > orderPrice+sneakersPackage.getCostForDelivery()){
                    order.setSneakersPackage(sneakersPackage);
                    order.setaMount(order.getaMount()*-1); // 배송상품 기준 설정
                    return order;
                }else{
                    // ex5. 신발은 예산 안에 있으나 , 배송료로 인한 예산초과로 중도 환불을 받는 경우
                    return null;
                }
            }else{
                // ex3. 신발가격이 예산 안에 있으나 , 매장 재고가 없으며 , 고객이 배송을 선호하지 않는 경우
                System.out.println("고객님 다음에 방문하시면 해당 제품을 구비해 놓도록 하겠습니다.");
                return null;
            }
        }else{
            // ex1. 신발가격 예산초과로 구매하지 못한 경우
            System.out.println("고객님 죄송합니다만 요금이 부족합니다 전체 금액은 "+order.getSneakers().getPrice()
                    *order.getaMount() +" 원 입니다.");
            return null;
        }
    }

    public boolean checkHavingInStore(Order order){
        return (order.getSneakers().getaMount() >= order.getaMount())?true:false;
    }

    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public Sneakers getSneakers() {
        return sneakers;
    }

    public void setSneakers(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

    public boolean isHavingNikeSneakersInStore() {
        return havingNikeSneakersInStore;
    }

    public void setHavingNikeSneakersInStore(boolean havingNikeSneakersInStore) {
        this.havingNikeSneakersInStore = havingNikeSneakersInStore;
    }
}
