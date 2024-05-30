public class Order {
    private static int o_id;
    private Customer customer;
    private int aMount;
    private Sneakers sneakers;
    private SneakersPackage sneakersPackage;


    public Order(Customer customer,Sneakers sneakers, int aMount){
        this.o_id ++;
        this.customer = customer;
        this.aMount = aMount;
        this.sneakers = sneakers;
    }

    public Order(Order order,SneakersPackage sneakersPackage){
        this.o_id = order.getO_id();
        this.aMount = order.getaMount();
        this.customer = order.getCustomer();
        this.sneakersPackage = sneakersPackage;
    }

    public static int getO_id() {
        return o_id;
    }

    public int getaMount() {
        return aMount;
    }

    public void setaMount(int aMount) {
        this.aMount = aMount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Sneakers getSneakers() {
        return sneakers;
    }

    public void setSneakers(Sneakers sneakers) {
        this.sneakers = sneakers;
    }

    public SneakersPackage getSneakersPackage() {
        return sneakersPackage;
    }

    public void setSneakersPackage(SneakersPackage sneakersPackage) {
        this.sneakersPackage = sneakersPackage;
    }
}
