public class CPU extends Computer implements Overclocking{
    private int cpuClockSpeed;
    private double assumedTemperature;
   private double maxSafeTemperature;

    public CPU(String model, String producer, String serialNumber, int cpuClockSpeed, double assumedTemperature, double maxSafeTemperature) {
        super(model, producer, serialNumber);
        this.cpuClockSpeed = cpuClockSpeed;
        this.assumedTemperature = assumedTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }

    public double overclocking(int overcklock){
        double temperatureChange = overcklock/100;
        if (assumedTemperature + 10*temperatureChange<maxSafeTemperature){
            cpuClockSpeed =+ overcklock;
            return assumedTemperature += 10*temperatureChange;
        }else {
            System.out.println("Nie można podkręcić komponentu, ryzyko przegrzania.");
            return assumedTemperature;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "CPU{" +
                "cpuClockSpeed=" + cpuClockSpeed +
                ", assumedTemperature=" + assumedTemperature +
                ", maxSafeTemperature=" + maxSafeTemperature +
                '}';
    }
}
