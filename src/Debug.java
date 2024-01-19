import java.lang.reflect.Field;

public class Debug {

    public static void fields(Object o) throws IllegalAccessException {
        for (Field x: o.getClass().getDeclaredFields()
             ) {
            x.setAccessible(true);
            System.out.println("Pole: " + x.getName() + " => " + x.getType() + ", " + x.get(o));
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Point point = new Point(3, 4);
        Debug.fields(point);
    }
}