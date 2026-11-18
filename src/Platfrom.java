import java.util.ArrayList;
import java.util.List;

public class Platfrom {
    private Agency agency;
    List<Agency> agencyList = new ArrayList<Agency>();

    public Agency registerAgency(String agencyName) {
        Agency agency = new Agency(agencyName);
        agencyList.add(agency);
        return agency;
    }

    public Agency loginAgency(String agencyName) {
        for (Agency agency : agencyList) {
            if (agency.getName().equals(agencyName)) {
                return agency;
            }
        }
        return null;
    }

}
