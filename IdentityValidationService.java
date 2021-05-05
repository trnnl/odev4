public interface IdentityValidationService {
    Result CheckIfRealPerson(String identityNumber, String firstName, String lastName);

}
