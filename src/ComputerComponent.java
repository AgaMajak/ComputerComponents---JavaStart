public abstract class ComputerComponent {
    private String model;
    private String producer;
    private String serialNumber;

    public ComputerComponent(String model, String producer, String serialNumber) {
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return String.format("Model: %s; Producent: %s; Numer seryjny: %s.\n", model, producer, serialNumber);
    }
}
