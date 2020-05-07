public class CPU extends ComputerComponent implements Overclocking{
    int cpuClockSpeed;
    double assumedTemperature;
    double maxSafeTemperature;

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

}
