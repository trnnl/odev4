import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new GameManager();
        Product game1 = new Game(1,"GTA","TPS, AÇIK DÜNYA", "300 TL");
        Product game2 = new Game(2,"Fifa 21","SPOR, FUTBOL", "250 TL");

        productService.addMultiple(new Product[]{game1,game2});
        productService.delete(game1);
        productService.delete(game2);
        System.out.println("*****************************************************************");

        UserService userService = new PlayerManager(new PlayerCheckManager(new MernisAdapter()));
        User player1 = new Player("Ali","Veli","1","AV",new GregorianCalendar(1995,12,5).getTime());
        User player2 = new Player("Osman","Ocak","2","OO",new GregorianCalendar(1992,7,2).getTime());
        userService.addMultiple(new User[]{player1,player2});



        System.out.println("*****************************************************************");
        CampaignService campaignService = new CampaignManager();
        Campaign campaign1 = new Campaign("1","546","Kampanya 1", "Bahar Kampanyası", 50.0, game1) ;
        campaignService.add(campaign1);


        System.out.println("*****************************************************************");
        OrderService orderService = new OrderManager();
        Order order1 = new Order(1,new Date(),(Player)player1,game1,campaign1);
        orderService.add(order1);




    }


}