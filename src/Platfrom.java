import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Platfrom {
    Map <String,String> logInMap = new HashMap<>();
    Map<String,Agency> agencyMap = new HashMap<>();

    public boolean registerAgency (String userName,String password, String agencyName){
       for(Agency agency : agencyMap.values()){
           if (agency.getName().equals(agencyName)){
               return false;
           }
       }
       if (agencyMap.containsKey(agencyName)){
           return false;
       }

        this.logInMap.put(userName,password);
        this.agencyMap.put(userName,new Agency(agencyName));
        return true;
    }

    public boolean loginValidation(String name, String password){
        String savePassword = this.logInMap.get(name);
       return savePassword.equals(password);
    }

    public Agency getAgency(String agencyName){
        return this.agencyMap.get(agencyName);
    }



}
