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

    public int getTotalCount(){
    return propertyList.size();
    }

    public int getAvailableCount(){
        int counter = 0;
        for (Property property : this.propertyList) {
            if (!property.isSold()) {
                counter++;
            }
        }
        return counter;
    }

    public void printAvailableProperties() {
        for (Property property : this.propertyList) {
            if(!property.isSold())
            {
                property.printDetails();
            }

        }
    }

    public int getSoldCount(){
        return getTotalCount() - getAvailableCount();
    }


   public void printSummary() {

        IO.println("Properties Sold: " + getSoldCount());
        IO.println("Property Available: " + getAvailableCount());
        IO.println("Total Properties listing:" + getTotalCount());

        printAvailableProperties();
    }
}
