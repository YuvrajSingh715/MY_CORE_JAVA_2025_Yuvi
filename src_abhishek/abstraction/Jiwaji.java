package abstraction;

public class Jiwaji implements University, University2 {


    @Override
    public void doDegree() {
        System.out.println("BA");
    }

    @Override
    public void doDiploma() {
        System.out.println("Diploma");
    }
}
