package abstraction;

// Client
public class Student {

    public static void main(String[] args) {

        University university = new Jiwaji();

        university.doDegree();

        University university2 = new RJPV();

        university2.doDegree();

    }
}
