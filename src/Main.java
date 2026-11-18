import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Platfrom platfrom = new Platfrom();
        Scanner input = new Scanner(System.in);
       boolean runningMain = false;
       boolean runningAgency = false;
       boolean runningAgencySys = false;
       IO.println("Welcome to the SA Properties");
       do{
           IO.println("1.Agent");
           IO.println("2.Buyer");
           IO.println("3.QUIT ");
           int choice = Integer.parseInt(input.nextLine());
           if (choice == 1) {
               do{
                   IO.println("1.Log-In");
                   IO.println("2.Create Account");
                   int choice2 = Integer.parseInt(input.nextLine());
                   if (choice2 == 1) {

                       IO.println("Enter your agency name.");
                       String name = input.nextLine();
                       Agency agency = platfrom.loginAgency(name);
                       if (agency == null) {
                           IO.println("Invalid agency name.");
                           break;
                       }else IO.println(agency.getName() + " is logged in.");

                       do {
                           IO.println("1. Create your Listing");
                           IO.println("2. Print All Properties");
                           IO.println("3. Print Available Properties");
                           IO.println("4. Print Sold Properties");
                           IO.println("5. Exit to Main");


                           int inputChoice = Integer.parseInt(input.nextLine());
                           switch (inputChoice) {
                               case 1:
                                   IO.println("Enter your Name");
                                   String agentName = input.nextLine();
                                   IO.println("Enter your Contact Number");
                                   String phone = input.nextLine();
                                   IO.println("Enter your commission Rate");
                                   double commissionRate = Double.parseDouble(input.nextLine());
                                   Agent agent = new Agent(agentName, phone, commissionRate);
                                   agent.printAgent();

                                   IO.println("Enter address for property.");
                                   String address = input.nextLine();
                                   IO.println("Enter number of bedrooms.");
                                   int bedrooms = Integer.parseInt(input.nextLine());
                                   IO.println("Enter price for property.");
                                   double price = Double.parseDouble(input.nextLine());
                                   IO.println("Enter Agent name.");
                                   Property property = new Property(address, price, bedrooms, agent);
                                   agency.addProperty(property);
                                   break;
                               default:
                                   IO.println("Invalid choice.");
                                   break;
                           }
                           if (inputChoice == 5) {
                               runningAgency = true;
                           }
                       }while (!runningAgency);
                   }
                   else if (choice2 == 2) {
                      IO.println("Enter you Agency name to register");
                      String agencyName = input.nextLine();
                      Agency agency = platfrom.registerAgency(agencyName);

                   }
                   else IO.println("Wrong choice");
                   IO.println("Please enter correct key");
                   if(choice2 ==3){
                       runningAgency = true;
                   }
               }while(!runningAgency);

           }
           if (choice == 3) {
               runningMain = true;
           }


       }
       while(!runningMain);
    }
}
