public class BmiService {

    public int calculate(double height, double weight) {

        int bmi = (int) (weight / height /height);
        return bmi;
    }
}
