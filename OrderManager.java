import java.util.Date;

public class OrderManager implements OrderService{
    @Override
    public void add(Order order) {

        Product product = order.getProduct();
        Player player = order.getPlayer();
        Campaign campaign = order.getCampaign();



        System.out.println("|orderId|productName|sellingPrice|playerName|campaignCode|discountedPrice|");
        System.out.println("|---|---|---|---|---|---|");
        System.out.println("|" + order.getId()
                + "|" + product.getName()
                + "|" + player.getFirstName() + " " + player.getLastName()
                + "|" + campaign.getCampaignCode()

        );


    }

    @Override
    public void addMultiple(Order[] orders) {
        for (Order order : orders) {
            this.add(order);
        }
    }

    @Override
    public void update(Order order) {
        System.out.println("Order : " + order.getId() + " updated. ");
    }

    @Override
    public void delete(Order order) {
        System.out.println("Order : " + order.getId() + " deleted. ");
    }


}
