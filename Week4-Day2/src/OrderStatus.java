public enum OrderStatus {
    DELIVERED("배송 완료"),PAID("주문 완료") , SHIPPED("배송 완료")  , ON_ORDER("주문 중") , NOT_PAID("결제 전");
        private String status;
        OrderStatus(String status) {
            this.status = status;
        }
        public String getStatus() {
            return status;
        }
    }
