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
    }
}
