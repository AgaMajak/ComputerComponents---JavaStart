public class RAM extends ComputerComponent implements Overclocking {
    private int ramClockSpeed;
    private int memoryCapacity;
    private double assumedTemperature;
    private double maxSafeTemperature;

    public RAM(String model, String producer, String serialNumber, int ramClockSpeed, int memoryCapacity, double assumedTemperature, double maxSafeTemperature) {
        super(model, producer, serialNumber);
        this.ramClockSpeed = ramClockSpeed;
        this.memoryCapacity = memoryCapacity;
        this.assumedTemperature = assumedTemperature;
        this.maxSafeTemperature = maxSafeTemperature;
    }

    public int getRamClockSpeed() {
        return ramClockSpeed;
    }

    @Override
    public double overclocking(int overcklock) {
        double temperatureChange = overcklock / 100;
        if (assumedTemperature + 15 * temperatureChange <= maxSafeTemperature) {
            ramClockSpeed += overcklock;
            return assumedTemperature += 10 * temperatureChange;
        } else {
            System.out.println("Nie można podkręcić komponentu o podaną wartość, ryzyko przegrzania.");
            return assumedTemperature;
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                String.format("Pamięć RAM - taktowanie pamięci: %dMHz; Pojemność pamięci: %d MB; Temperatura: %.1fC; Maksymalna temperatura: %.1fC.\n", ramClockSpeed, memoryCapacity, assumedTemperature, maxSafeTemperature);
    }


}
