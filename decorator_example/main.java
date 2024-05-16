package decorator_example;

public class main {
    public static void main (String[] args) {
        // Creating a base computer
        computerComponent baseComputer = new baseComputer("500 GB", "2 GB", 500);

        // Adding optional components using decorators
        computerComponent computerWithGraphicsCard = new graphicsCard(baseComputer, 100);
        computerComponent computerWithBluetooth = new Bluetooth(computerWithGraphicsCard, 50);

        // Output description and cost
        System.out.println("Computer Description: " + computerWithBluetooth.getDescription());
        System.out.println("Computer Cost: $" + computerWithBluetooth.getCost());
    }
}
