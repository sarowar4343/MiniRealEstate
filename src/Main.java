public class Main {
    static void main(String[] args) {
        Agent rahim = new Agent("Rahim", "01712345678", 0.02);
        Property house = new Property("House 12, Dhanmondi", 8500000, 3, rahim);

        house.printDetails();          // Status: Available
        house.markSold();
        house.printDetails();          // Status: Sold

        try {
            house.setPrice(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Agent rahimSheikh = new Agent("Rahim Sheikh","016485548",0.02);
        Property gulshanProperty = new Property("Gulshan,Dhaka",8500000,1,rahimSheikh);
        Agency dhakaHomes = new Agency("Dhaka Homes");
        dhakaHomes.addProperty(gulshanProperty);

        Agent karim = new Agent("Karim Abbas", "016486166",0.015);
        Property vatara = new Property("Vatara,Dhaka",8500000,1,karim);
        vatara.markSold();
        dhakaHomes.addProperty(vatara);

        dhakaHomes.printAllProperties();
    }
}
