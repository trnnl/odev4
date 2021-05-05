public class PlayerCheckManager extends BaseUserCheckManager{
    private IdentityValidationService identityValidationService;

    public PlayerCheckManager(IdentityValidationService identityValidationService){
        this.identityValidationService = identityValidationService;
    }

    @Override
    public Result checkIsRealUser(User user) {
        Player player = (Player)user;
        return this.identityValidationService.CheckIfRealPerson(
               player.getId(),player.getFirstName(), player.getLastName());


    }
}
