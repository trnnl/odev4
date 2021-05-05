public class Campaign {
    private String id;
    private String campaignCode;
    private String campaignName;
    private String campaignDescription;
    private double discountPercent;

    private Product product;

    public Campaign(String id, String campaignCode, String campaignName, String campaignDescription, double discountPercent, Product product) {
        this.id = id;
        this.campaignCode = campaignCode;
        this.campaignName = campaignName;
        this.campaignDescription = campaignDescription;
        this.discountPercent = discountPercent;
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
