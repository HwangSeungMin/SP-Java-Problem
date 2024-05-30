public class SneakersPackage extends Sneakers{
    private int dayForDelivery;
    private long costForDelivery;

    private Sneakers sneakers;

    public int getDayForDelivery() {
        return dayForDelivery;
    }

    public void setDayForDelivery(int dayForDelivery) {
        this.dayForDelivery = dayForDelivery;
    }

    public long getCostForDelivery() {
        return costForDelivery;
    }

    public void setCostForDelivery(long costForDelivery) {
        this.costForDelivery = costForDelivery;
    }

    public Sneakers getSneakers() {
        return sneakers;
    }

    public void setSneakers(Sneakers sneakers) {
        this.sneakers = sneakers;
    }
}
