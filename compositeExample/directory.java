

import java.util.ArrayList;
import java.util.List;

public class directory implements fileSystem{
   
    private int size;
    private List<fileSystem> children;

    public directory(String name){
        this.size = 0;
        
        children = new ArrayList<>();
    }

    public void addComponent(fileSystem component) {
        children.add(component);
    }

    public void removeComponent(fileSystem component) {
        children.remove(component);
    }

    @Override
    public int fileSize() {
      
        for (fileSystem component : children) {
            size += component.fileSize();
        }

        return size;
    }


}