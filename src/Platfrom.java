import java.util.ArrayList;
import java.util.List;

public class Platfrom {
    private Agency agency;
    List<Agency> agencyList = new ArrayList<Agency>();

    public Agency registerAgency(String agencyName){
        Agency agency = new Agency(agencyName);
        agencyList.add(agency);
        return agency;
    }
}
