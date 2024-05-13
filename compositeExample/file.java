   
public class file implements fileSystem{
    private String name;
    private String space;

    public file(String name, String space){
        this.name = name;
        this.space = space;
    }

    @Override
    public void displayDetails() {
        System.out.println("File : " + name + "Memory: " + space);
    }
}

