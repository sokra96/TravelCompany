
package com.travelcompany.eshop.menu;

import com.travelcompany.eshop.exceptions.CustomerException;
import com.travelcompany.eshop.service.impl.CustomerServiceImpl;
import java.util.Scanner;

/**
 *
 * @author mantz
 */
public class Menu {

    public static void beginApp() throws CustomerException {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        CustomerServiceImpl customerservice = new CustomerServiceImpl();
        do{
            System.out.println("Choose one of the following options");
            System.out.println("1. Number of tickets that each customer has bought");
            System.out.println("2. Total cost for each customer");
            System.out.println("3 Itinenaries for each destination code");
            System.out.println("4. Itinenaries for each departure code");
            System.out.println("5. Customers with the most ticket");
            System.out.println("6. Customer who spend the most");
            System.out.println("7. Customers who haven't buy any ticket");
            System.out.println("8. Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    customerservice.customersNumberOfTickets();
                    break;
                case 2:
                    customerservice.customersAmountOfTickets();
                    break;
                case 3:
                    customerservice.itinenariesPerDestination();
                    break;
                case 4:
                    customerservice.itinenariesPerDeparture();
                    break;
                case 5:
                    customerservice.customersMostTickets();
                    break;
                case 6:
                    customerservice.customerBiggerAmount();
                    break;
                case 7:
                    customerservice.customersWithoutTickets();
                    break;
                case 8:
                    System.out.println("Exit succeded!");
                    break;
                default:
                    System.out.println("Please type a correct value");
                    break;                         
            }
        }while(choice!=8);
    }
}
