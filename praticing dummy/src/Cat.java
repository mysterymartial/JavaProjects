@VeryImportant
public class Cat {
    private String name;
    private String color;
    private String sound;

    public Cat(String name, String color, String sound) {
        this.name = name;
        this.color = color;
        this.sound = sound;
    }


    public String getName() {
            return name;
    }
    public String getColor() {
        return color;
    }
    public String getSound() {
        return "memow";

    }
    @RunImmediately(times = 3)
    public void mewom(){
        System.out.println("mewom");
    }
    public void eat(){
        System.out.println("eating");
    }
}
