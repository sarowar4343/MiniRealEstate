public class Agent {
    private String name;
    private String phone;
    private double commissionRate;

    public Agent(String name, String phone, double commissionRate) {
        this.name = name;
        this.phone = phone;
        this.commissionRate = commissionRate;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public double getCommissionRate(){
        return commissionRate;
    }

    public double calculateCommission(double salesPrice){
        if (salesPrice < 0) {
            throw new IllegalArgumentException("Sales price must be positive");
        }
       return salesPrice * commissionRate;
    }


}
