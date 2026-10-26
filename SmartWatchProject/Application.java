public class Application {

    public static void main(String[] args) {

        SmartWatch sw = new SmartWatch("Samsung", "Galaxy Watch", 5000, 75);

        sw.showDetails();
        sw.trackSteps();
        sw.calculateCalories();
        sw.measureHeartRate();
        sw.measureBloodPressure();

    }

}
