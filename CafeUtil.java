import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil{

    public int getStreakGoal(){
        int sum=0;
        for(int i=0;i<=10;i++){
            sum+=i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double total=0;
        for(int i=0;i<lineItems.length;i++){
            total+=lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<menuItems.size();i++){
            System.out.println(i);
            System.out.println(menuItems.get(i));
        }
    }

    public int addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        customers.add(userName);
        int counter = 0;
        for(int i=0;i<customers.size();i++){
            counter ++;
        }
        System.out.println("There are " + counter + " people in front of you");
        for (String cust : customers){
            System.out.println(cust);
        }
        return counter;
    }
}