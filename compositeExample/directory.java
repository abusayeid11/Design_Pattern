

import java.util.ArrayList;
import java.util.List;

public class directory implements fileSystem{
    private String name;
    private List<fileSystem> children;

    public directory(String name){
        this.name = name;
        children = new ArrayList<>();
    }

    public void addComponent(fileSystem component) {
        children.add(component);
    }

    public void removeComponent(fileSystem component) {
        children.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println("Directory: " + name);
        System.out.println("Contents:");
        for (fileSystem component : children) {
            component.displayDetails();
        }
    }
}