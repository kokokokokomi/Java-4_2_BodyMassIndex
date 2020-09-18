public class BmiService {
    public float calculate(float squareHeight, float weight) {
        float bmi = weight / squareHeight;
        return bmi;
    }
}