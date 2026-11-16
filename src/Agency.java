import java.util.ArrayList;
import java.util.List;

public class Agency {
    private String name;
    private List<Property> propertyList = new ArrayList<>();

    public Agency(String name) {
        this.name = name;
    }

    public void addProperty(Property property) {
        this.propertyList.add(property);
    }

    public void printAllProperties() {
        for (Property property : this.propertyList) {
            property.printDetails();
        }
    }


    static void main(String[] args) {
        Agent rahim = new Agent("Rahim Sheikh","016485548",0.2);
        Property gulshanProperty = new Property("Gulshan,Dhaka",8500000,1,rahim);
        Agency dhakaHomes = new Agency("Dhaka Homes");
        dhakaHomes.addProperty(gulshanProperty);

        Agent karim = new Agent("Karim Abbas", "016486166",0.15);
        Property vatara = new Property("Vatara,Dhaka",8500000,1,karim);
        vatara.markSold();
        dhakaHomes.addProperty(vatara);

        dhakaHomes.printAllProperties();

    }
}
