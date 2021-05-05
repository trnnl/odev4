public class BaseUserManager implements  UserService{

    @Override
    public void add(User user) {
        System.out.println(user.getId()+" id numaralı "+ user.getFirstName() + " eklenmiştir.");
    }

    @Override
    public void addMultiple(User[] users) {
        for(User user: users){
            this.add(user);
        }

    }

    @Override
    public void update(User user) {
        System.out.println(user.getId()+" id numaralı "+ user.getFirstName() + " güncellenmiştir.");

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getId()+" id numaralı "+ user.getFirstName() + " silinmiştir.");

    }
}
