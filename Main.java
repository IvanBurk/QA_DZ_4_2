public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = service.calculate(82.5, 176.5);
        System.out.println(mass);
    }
}