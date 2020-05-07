public class ComputerMain {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel Core i5-9400F", "Intel", "9501234AF", 2900, 40, 70);
        RAM ram = new RAM("GoodDRAM IRDM 8GB", "GoodRAM", "1859373F-AG", 2400, 8128, 30, 60);
        HardDrive hardDrive = new HardDrive("Crucial MX500 500GB SSD", "Crucial", "AG 4532535-I", 500);

        ComputerComponent[] computer = {cpu, ram, hardDrive};
        for (ComputerComponent component : computer) {
            System.out.println(component.toString());
        }

        cpu.overclocking(200);
        System.out.println("\nNowe taktowanie procesora: " + cpu.getCpuClockSpeed() + "GHZ");
        cpu.overclocking(200);

        ram.overclocking(200);
        System.out.println("\nNowe taktowanie pamięci: " + ram.getRamClockSpeed() + "MHZ");
        ram.overclocking(200);

    }
}
