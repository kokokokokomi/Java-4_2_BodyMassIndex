public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.70f;
        float weight = 70.1f;
        float squareHeight = height * height;
        float bmi = service.calculate(squareHeight, 70.1f);
        System.out.println(bmi);
    }
}