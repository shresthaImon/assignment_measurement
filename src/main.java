import models.Measurement;

public class main {
    public static void main(String[] args) {
        Measurement Measure = new Measurement(10);
        System.out.println(Measure.getkm() + "km");
        System.out.println(Measure.getcm() + " cm");
        System.out.println(Measure.getmn() + " mn");
        System.out.println(Measure.getdm() + " dm");
    }
}
