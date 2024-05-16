package decorator_example;

public class baseComputer implements computerComponent{


    private String HDD;
    private String RAM;
    private double cost;

    public baseComputer(String HDD, String RAM, double cost){
        this.HDD = HDD;
        this.RAM = RAM;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
       return "HDD: " + HDD + " RAM: " + RAM;
    }

    @Override
    public double getCost() {
       return cost;
    }
    
}
