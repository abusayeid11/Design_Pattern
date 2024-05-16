package decorator_example;

class Bluetooth implements computerComponent {
    private computerComponent computer;
    private double cost;

    public Bluetooth(computerComponent computer, double cost) {
        this.computer = computer;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", Bluetooth";
    }

    @Override
    public double getCost() {
        return computer.getCost() + cost;
    }
}
