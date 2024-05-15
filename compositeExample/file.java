   
public class file implements fileSystem{
    
    private int size;

    public file(int size){
       this.size = size;
    }

    @Override
    public int fileSize() {
       return size;
    }
}

