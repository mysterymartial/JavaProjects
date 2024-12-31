import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestingMyAnnotation {
    public static void main(String[] args) {
        Cat mycat = new Cat("simba", "white", "memow");
        if(mycat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("this is very important");
        } else{
            System.out.println("this is not important");
        }
        for (Method method : mycat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately run = method.getAnnotation(RunImmediately.class);
                for(int count = 0; count < run.times(); count++){
                    //method.invoke(mycat);

                }

            }
        }
        for (Field field : mycat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                //Object objectValue = field.get(mycat);
                //if(objectValue instanceof String stringValue){
                    //System.out.println(stringValue.toUpperCase());

                }

            }
        }

    }
//}
