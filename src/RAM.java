public class RAM extends ComputerComponent implements Overclocking {
    int ramClockSpeed;
    int memoryCapacity;
    double assumedTemperature;
    double maxSafeTemperature;

    @Override
    public double overclocking(int overcklock){
       double temperatureChange = overcklock/100;
       if (assumedTemperature + 15*temperatureChange<maxSafeTemperature){
           ramClockSpeed =+ overcklock;
           return assumedTemperature += 10*temperatureChange;
       }else {
           System.out.println("Nie można podkręcić komponentu, ryzyko przegrzania.");
           return assumedTemperature;
       }
    }

}
