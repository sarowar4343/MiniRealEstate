import java.util.HashMap;
import java.util.Map;

public class Platfrom {
    private Map <String,String> logInMap = new HashMap<>();
    private Map<String,Agency> agencyMap = new HashMap<>();

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

    public Agency getAgency(String userName){
        return this.agencyMap.get(userName);
    }



}
