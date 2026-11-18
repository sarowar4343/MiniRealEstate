import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Platfrom platfrom = new Platfrom();
        Scanner input = new Scanner(System.in);
       boolean continueLoop = true;
       boolean continueLoop2 = true;
        IO.println("Welcome to GhorBari.com");
        IO.println("Press 1. Agency");
        IO.println("Press 2. Buyer");
        
        if (input.nextLine().equals("1")) {
            return;
        } else if () {
            
        }


        while (continueLoop) {
            IO.println("Press 1.  Create Agency");
            IO.println("Press 2.  Look Listing");
            IO.println("Press 3.  Exit");
            int loginOpt = input.nextInt();
            if (loginOpt == 1) {
                IO.println("Press 1. Enter you Agency name");
                platfrom.registerAgency(input.next());
                Agency agency = platfrom.registerAgency(input.next());

                IO.println("Enter your name as an agent");
                String name = input.nextLine();
                IO.println("Enter your Contact Number");
                String number = input.nextLine();
                IO.println("Enter your Commission Rate");
                double commissionRate = input.nextDouble();
                Agent agent = new Agent(name, number, commissionRate);

                IO.println("How many bedroom");
                int bedroom = input.nextInt();
                IO.println("Enter property Address");
                String address = input.nextLine();
                IO.println("Enter property Price");
                double price = input.nextDouble();
                Property property = new Property(address,price,bedroom,agent);
                agency.addProperty( property);

            }


        }




    }
}
