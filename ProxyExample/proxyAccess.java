import java.util.ArrayList;
import java.util.List;

public class proxyAccess implements access{
    
    private access allAccess;
    private List<String>haveAccess;

    public proxyAccess(){
        allAccess = new allAccess();
        haveAccess = new ArrayList<>();

        haveAccess.add("Admin");
    }

    @Override
    public void check(String validity) {
       if(haveAccess.contains(validity)){
          check(validity);
       }
       else{
        System.out.println(validity + "don't have permission");
       }
    }


}
