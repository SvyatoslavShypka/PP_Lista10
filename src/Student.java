import java.util.Date;

public class Student {
    private long index;
    private String name;
    private Date dataOceny;
    private int ocena;
    private String comment = ";)";

    public Student(long index, String name, Date dataOceny, int ocena) {
        this.index = index;
        this.name = name;
        this.dataOceny = dataOceny;
        this.ocena = ocena;
    }
}
