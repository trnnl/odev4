public class MernisAdapter implements IdentityValidationService {


    @Override
    public Result CheckIfRealPerson(String identityNumber, String firstName, String lastName) {
        if (identityNumber.equals("1") || identityNumber.equals("2") || identityNumber.equals("3")) {
            
        }

        return null;
    }

}

