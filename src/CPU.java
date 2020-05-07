public class CPU extends ComputerComponent implements Overclocking {
    private int cpuClockSpeed;
    private double assumedTemperature;
    private final double maxSafeTemperature;

    public CPU(String model, String producer, String serialNumber, int cpuClockSpeed, double assumedTemperature, double maxSafeTemperature) {
        super(model, producer, serialNumber);
        this.cpuClockSpeed = cpuClockSpeed;
        this.assumedTemperature = assumedTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }


    @Override
    public double overclocking(int overcklock) {
        double temperatureChange = overcklock / 100;
        if (assumedTemperature + 10 * temperatureChange <= maxSafeTemperature) {
            cpuClockSpeed = +overcklock;
            return assumedTemperature += 10 * temperatureChange;
        } else {
            System.out.println("Nie można podkręcić komponentu o podaną wartość, ryzyko przegrzania.");
            return assumedTemperature;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CPU{" +
                "cpuClockSpeed=" + cpuClockSpeed +
                ", assumedTemperature=" + assumedTemperature +
                ", maxSafeTemperature=" + maxSafeTemperature +
                '}';
    }

}
