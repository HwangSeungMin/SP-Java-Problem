public class Sneakers {
    private int s_id;
    private String feature;
    private long price;

    private int aMount;

    public Sneakers(){
        this.aMount=5;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getaMount() {
        return aMount;
    }

    public void setaMount(int aMount) {
        this.aMount = aMount;
    }
}
