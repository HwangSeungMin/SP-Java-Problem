public class OrderSneakersSituation {
    public static void main(String args[]){
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.
        // -> money , sales : 100_000 int 형 변수 설정

        boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부
        // -> 배송주문선호여부를 Setter 메소드 활용

        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 50_000;
        boolean havingNikeSneakersInStore = true; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        /**
         *  필수 인스턴스 생성
         *  Customer, staff, DeliveryManager를 생성하고 시작합니다.
         *  각각 Customer, Staff, DeliveryManager 는 정보 은닉화 를 따르기 때문에 한정된 정보를 가지게 됩니다.
         *
         *  Customer: 자신의 Cache 와 배송 주문선호 여부
         *  Staff: 자신의 매상, Nike 운동화 정보, 매장의 Nike 운동화 재고 보유여부
         *  DeliverManager: 자신의 매상, Nike 운동화 정보, 포장 정보
         * */

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();
        Customer customer4 = new Customer();
        Customer customer5 = new Customer();
        Staff staff1 = new Staff();
        DeliverManager deliverManager1 = new DeliverManager();

        Sneakers sneakers1 = new Sneakers();
        sneakers1.setS_id(0001);
        sneakers1.setFeature(nikeSneakersFeature); // 편안함
        sneakers1.setPrice(nikeSneakersPrice); // 50_000

        Sneakers sneakers2 = new Sneakers();
        sneakers2.setS_id(0002);
        sneakers2.setFeature("가벼움");
        sneakers2.setPrice(80_000);

        // TODO: 클래스를 선언하고, 객체간의 협력으로 구현해주세요.

        // ex1. 신발가격 예산초과로 구매하지 못한 경우
        // -> Staff staffWorkProcess 메소드 내 구현
        Order order1 = customer1.order(customer1,sneakers2,2); // 고객 주문 80_000원 제품 2개 주문
        order1 = staff1.staffWorkProcess(order1);
        checkDelivery(order1,deliverManager1);
        Calculate(order1,staff1);
        // ex2. 신발가격이 예산 안에있고 매장에 재고가 존재하는 경우
        // -> Staff staffWorkProcess 메소드 내 구현
        Order order2 = customer2.order(customer2,sneakers2,1); // 고객 주문 80_000원 제품 2개 주문
        order2 = staff1.staffWorkProcess(order2);
        checkDelivery(order2,deliverManager1);
        Calculate(order2,staff1);
        // ex3. 신발가격이 예산 안에 있으나 , 매장 재고가 없으며 , 고객이 배송을 선호하지 않는 경우
        // -> Staff staffWorkProcess 메소드 내 예외처리
        customer3.setLikeDelivery(false);
        sneakers2.setaMount(0);
        Order order3 = customer3.order(customer1,sneakers2,1); // 고객 주문 80_000원 제품 2개 주문
        order3 = staff1.staffWorkProcess(order3);
        checkDelivery(order3,deliverManager1);
        Calculate(order3,staff1);

        // ex4. 신발과 배송료 모두 예산안에 있고 배송을 통해 신발을 구매하는 경우
        //-> Staff staffWorkProcess 메소드 호출 -> DeliveryManager SneakersPackaging & requestDelivery
        customer4.setLikeDelivery(true);
        Order order4 = customer4.order(customer4,sneakers1,1);
        order4 = staff1.staffWorkProcess(order4);
        checkDelivery(order4,deliverManager1);
        Calculate(order4,staff1);

        // ex5. 신발은 예산 안에 있으나 , 배송료로 인한 예산초과로 중도 환불을 받는 경우
        // -> Staff staffWorkProcess 메소드 내 예외처리
        sneakers1.setaMount(1);
        customer5.setLikeDelivery(false);
        Order order5 = customer5.order(customer5,sneakers1,2);
        checkDelivery(order5,deliverManager1);
        Calculate(order5,staff1);

    }

    public static void Calculate(Order order , Staff staff){
        System.out.println("계산 이전 : 점원 매출 :"+staff.getSales()+"원");
        if(null == order){
            System.out.println("주문 취소 : 점원 매출 :"+staff.getSales()+"원");
            return;
        }
        long sales_price = order.getSneakers().getPrice()*order.getaMount();

            staff.setSales(staff.getSales()+sales_price);
            System.out.println(sales_price+"원 계산이 완료가 안료되었습니다. 안녕히가세요.");
            System.out.println("점원 매출 :"+staff.getSales()+"원");
    }

    public static void checkDelivery(Order order,DeliverManager deliverManager){
        if(null == order){
            return;
        }
        int aMount = order.getaMount();
        if(aMount < 0){
            order.setaMount(aMount*-1);
            deliverManager.requestDelivery(order,deliverManager);
        }
    }
}
