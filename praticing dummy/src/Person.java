import java.util.Objects;

public record Person(String name, String address) {
    public Person(String name , String address) {
        this.name = Objects.requireNonNull(name);
        this.address = Objects.requireNonNull(address);
    }
    public static String NewPerson(String name, String address) {
        return new Person(name, address).toString();
    }
}
