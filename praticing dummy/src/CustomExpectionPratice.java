public class CustomExpectionPratice {
    public static void main(String[] args) throws Exception {
        validateAge(-3);

    }
    public static void validateAge(int age) throws InvalidAgeExpection {
        if (age < 0) {
            throw new InvalidAgeExpection("Age is invalid");
        }
    }
}
