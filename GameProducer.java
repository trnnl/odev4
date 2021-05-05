public class GameProducer extends User{
    private String name;
    private String description;

    public GameProducer(String firstName, String lastName, String id, String name, String description) {
        super(firstName,lastName,id);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
