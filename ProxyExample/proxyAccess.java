import java.util.ArrayList;
import java.util.List;

public class proxyAccess implements access{
    
    private allAccess allAccess;
    private List<String> reqAccess;

    public proxyAccess(){
        allAccess = new allAccess();
       reqAccess = new ArrayList<>();

        reqAccess.add("rm -rf");
    }

   
    @Override
    public void exe(String req) {
       if(reqAccess.contains(req) && user.role != "admin"){
        System.out.println("Can not execute request");
       }
       else{
           allAccess.exe(req);
       }
    }


}
