import java.lang.reflect.Field;
import java.util.Date;

public class Debug {

    public static void fields(Object o) throws IllegalAccessException {
        for (Field x: o.getClass().getDeclaredFields()
             ) {
            x.setAccessible(true);
            System.out.println("Pole: " + x.getName() + " => " + x.getType() + ", " + x.get(o));
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        //test1
        System.out.println("----------Test1:");
        Point point = new Point(3, 4.3);
        Debug.fields(point);

        //test2
        System.out.println("----------Test2:");
        Przedmiot przedmiot = new Przedmiot(1L, "Paradygmaty Programowania", 5.0f);
        Debug.fields(przedmiot);

        //test2
        System.out.println("----------Test3:");
        Student darek = new Student(272678L, "Darek", new Date(),5);
        Debug.fields(darek);
    }
}