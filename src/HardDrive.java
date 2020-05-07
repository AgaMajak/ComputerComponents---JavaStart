public class HardDrive extends ComputerComponent {
    private int hardDriveCapacity;

    public HardDrive(String model, String producer, String serialNumber, int hardDriveCapacity) {
        super(model, producer, serialNumber);
        this.hardDriveCapacity = hardDriveCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Dysk twardy - pojemność dysku: %dGB", hardDriveCapacity);
    }
}
