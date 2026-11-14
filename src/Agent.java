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

    public double calculateCommission(double salesRate){
        if (salesRate < 0) {
            throw new IllegalArgumentException("Sales Rate must be positive");
        }
       return salesRate * commissionRate;
    }

    static void main(String[] args) {
        Agent agent = new Agent("Rahim","01720046789", 0.02);
        IO.println(agent.getName());
        IO.println(agent.calculateCommission(7500000));
    }

}
