public class CPU extends ComputerComponent implements Overclocking {
    private double maxSafeTemperature;
    private int cpuClockSpeed;
    private double assumedTemperature;

    public CPU(String model, String producer, String serialNumber, int cpuClockSpeed, double assumedTemperature, double maxSafeTemperature) {
        super(model, producer, serialNumber);
        this.cpuClockSpeed = cpuClockSpeed;
        this.assumedTemperature = assumedTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }

    public int getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    @Override
    public double overclocking(int overcklock) {
        double temperatureChange = overcklock / 100;
        if (assumedTemperature + 10 * temperatureChange <= maxSafeTemperature) {
            cpuClockSpeed += overcklock;
            return assumedTemperature += 10 * temperatureChange;
        } else {
            System.out.println("Nie można podkręcić komponentu o podaną wartość, ryzyko przegrzania.");
            return assumedTemperature;
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Procesor - taktowanie: %dGHz; Temperatura: %.1fC; Maksymalna temperatura: %.1fC.\n", cpuClockSpeed, assumedTemperature, maxSafeTemperature);
    }

}
