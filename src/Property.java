public class Property {
    private String address;
    private double price;
    private int bedroom;
    private boolean isSold;
    private Agent agent;

    public Property(String address, double price, int bedroom, Agent agent) {
        this.address = address;
        setPrice(price);
        this.bedroom = bedroom;
        this.isSold = false;
        this.agent = agent;
    }

    public void  setPrice(double price) {
        if(price < 1) {
            throw new IllegalArgumentException("Price cannot be less than 1");
        }
        this.price = price;
    }
    public double getPrice(){
        return this.price;
    }

    public int getBedroom(){
        return this.bedroom;
    }

    public boolean isSold(){
        return this.isSold;
    }

    public Agent getAgent(){
        return this.agent;
    }

    public String getAddress(){
        return this.address;
    }

    public void markSold(){
        if(!this.isSold) {
            this.isSold = true;
        }
    }

    public void printDetails(){
        String status;
        if (!this.isSold) {
            status = "Available";
        }
        else {
            status = "Sold";
        }
        IO.println("Address: "+this.address + " Price: $" + String.format("%,.0f",this.price) + " Bedroom: " + this.bedroom + " Agent: " + agent.getName()  + status);


    }

}
