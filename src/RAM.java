public class RAM extends ComputerComponent {
    int ramClockSpeed;
    int memoryCapacity;
    double assumedTemperature;
    double maxSafeTemperature;

    public double overclocking(int overcklock){
       int temperatureChange = overcklock/100;
       if (assumedTemperature + 10*temperatureChange<maxSafeTemperature){
           return assumedTemperature += 10*temperatureChange;
       }else {
           System.out.println("Nie można podkręcić komponentu, ryzyko przegrzania.");
           return assumedTemperature;
       }
    }



}
