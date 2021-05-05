public class BaseProductManager implements ProductService{
    @Override
    public void add(Product product) {
        System.out.println(product.getName()+ " eklenmiştir.");
    }

    @Override
    public void addMultiple(Product[] products) {
        for(Product product : products){
            this.add(product);
        }

    }

    @Override
    public void update(Product product) {
        System.out.println(product.getName()+ " güncellenmiştir. ");

    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getName() + " silinmiştir.");

    }
}
