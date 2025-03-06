import java.nio.file.Path;

public class PathPlay {
    public static void main(String[] args) {
        String fileLocation = "a/b/c";
//        Path path = (Path) Paths.get(fileLocation);
          Path path = Path.of(fileLocation);
          //Path path1 = Paths.get(fileLocation);
          System.out.println(path);
        System.out.println(path.getFileName().toString());
        System.out.println(path.getFileSystem());
          //Path path1 = Path.of("c","v", "e");
    }
}
