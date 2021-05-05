public class PlayerManager extends BaseUserManager{
    private UserCheckService userCheckService;

    public PlayerManager(UserCheckService userCheckService) {
        this.userCheckService = userCheckService;
    }

    @Override
    public void add(User user) {
        Result result = ServiceUtils.runChecks(
                userCheckService.checkIsRealUser(user)

        );
        if(!result.isSuccess()){
            System.out.println(result.getMessage());
            return;
        }
        super.add(user);
    }

    @Override
    public void addMultiple(User[] users) {
        super.addMultiple(users);
    }

    @Override
    public void update(User user) {
        super.update(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }
}
