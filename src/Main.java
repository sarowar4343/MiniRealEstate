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
                       int counter = 3;
                      boolean isValiadate = false;
                      Agency agency = null;
                       for (int i = 0; i < counter; i++) {

                           IO.println("Enter your username");
                           String username = input.nextLine();
                           IO.println("Enter your password");
                           String password = input.nextLine();
                           if (platfrom.loginValidation(username, password)) {
                               agency = platfrom.getAgency(username);
                               isValiadate = true;
                               break;
                           } else {
                               IO.println("Invalid username or password");
                           }

                       }
                       if (isValiadate) {
                           IO.println("You have successfully logged in");

                       } else break;



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
                                   Property property = new Property(address, price, bedrooms, agent);
                                   agency.addProperty(property);
                               break;
                               case 2: agency.printAllProperties();
                               break;
                               case 3: IO.println("Property Available: " + agency.getAvailableCount());
                               break;
                               case 4: IO.println("Property Sold: " + agency.getSoldCount());
                               break;
                               default:
                                   IO.println("Invalid choice.");
                                   break;
                           }
                           if (inputChoice == 5) {
                               runningAgencySys = true;
                           }
                       }while (!runningAgencySys);
                   }
                   else if (choice2 == 2) {
                   IO.println("Enter user name");
                   String name = input.nextLine();
                   IO.println("Enter Password");
                   String password = input.nextLine();
                   IO.println("Enter Agency Name");
                   String agencyName = input.nextLine();
                   if (platfrom.registerAgency(name, password, agencyName)) {
                       IO.println("Account Created Successfully.");
                   } else {
                       IO.println("Error: Agency or username already exists.");
                   }

                   }
                   else IO.println("Wrong choice");
                   IO.println("Please enter correct key");
                   if(choice2 ==3){
                       runningAgency = true;
                   }
               }while(!runningAgency);

           } else if (choice == 2) {
               platfrom.printEverything();


           } else if (choice == 3) {
               runningMain = true;
           }


       }
       while(!runningMain);
    }
}
