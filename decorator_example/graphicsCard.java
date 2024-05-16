package decorator_example;

class graphicsCard implements computerComponent {
    private computerComponent computer;
    private double cost;

    public graphicsCard(computerComponent computer, double cost) {
        this.computer = computer;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return computer.getDescription() + ", Graphics Card";
    }

    @Override
    public double getCost() {
        return computer.getCost() + cost;
    }
}
