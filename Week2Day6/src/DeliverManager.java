import java.sql.DriverManager;
import java.util.HashMap;
public class DeliverManager {
    private static int d_id;
    private static HashMap<Integer,SneakersPackage> order_list;
    private long sales = 100_000;
    private int deliveryDay;
    private long deliveryCost;
    private SneakersPackage sPpackage;

    public DeliverManager() {
        this.d_id ++;
    }

    public static SneakersPackage SneakersPackaging(Order order){
        // ex4. 신발과 배송료 모두 예산안에 있고 배송을 통해 신발을 구매하는 경우
        SneakersPackage sneakersPackage = new SneakersPackage();
        sneakersPackage.setDayForDelivery(3);
        sneakersPackage.setCostForDelivery(15_000);
        sneakersPackage.setSneakers(order.getSneakers());
        return sneakersPackage;
    }


    public static void requestDelivery(Order order ,DeliverManager deliverManager){
        System.out.println(order.getSneakersPackage().getSneakers().getS_id()+"배송 작업 시작...");
        completeDelivery(order.getSneakersPackage().getSneakers().getS_id());
        deliverManager.setSales(deliverManager.getSales()
                +order.getSneakersPackage().getCostForDelivery());
        System.out.println("배달원"+deliverManager.getD_id()+" 매출액 :"+deliverManager.getSales()+"원");
    }

    public static void completeDelivery(int sneakersId){
        System.out.printf("고객님 , %d 상품이 배송완료 되었습니다.\n",sneakersId);


    }


    public long getSales() {
        return sales;
    }

    public void setSales(long sales) {
        this.sales = sales;
    }

    public long getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(long deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public SneakersPackage getsPpackage() {
        return sPpackage;
    }

    public void setsPpackage(SneakersPackage sPpackage) {
        this.sPpackage = sPpackage;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getDeliveryDay() {
        return deliveryDay;
    }

    public void setDeliveryDay(int deliveryDay) {
        this.deliveryDay = deliveryDay;
    }

    public static HashMap<Integer, SneakersPackage> getOrder_list() {
        return order_list;
    }
}
