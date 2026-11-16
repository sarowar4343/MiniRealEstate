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


}
