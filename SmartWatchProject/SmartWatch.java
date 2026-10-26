public class SmartWatch implements Fitness, Health {

    private String brand;
    private String model;
    private int steps;
    private int heartRate;

    public SmartWatch() {

    }

    public SmartWatch(String brand, String model, int steps, int heartRate) {
        this.brand = brand;
        this.model = model;
        this.steps = steps;
        this.heartRate = heartRate;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSteps() {
        return this.steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    @Override
    public void showDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Steps: " + this.steps);
        System.out.println("Heart Rate: " + this.heartRate + " BPM");
    }

    @Override
    public void trackSteps() {
        System.out.println("Total Steps: " + this.steps);
    }

    @Override
    public void calculateCalories() {
        System.out.println("Calories Burned: " + (this.steps * 0.04));
    }

    @Override
    public void measureHeartRate() {
        System.out.println("Heart Rate: " + this.heartRate + " BPM");
    }

    @Override
    public void measureBloodPressure() {
        System.out.println("Blood Pressure Monitoring Enabled.");
    }

}
