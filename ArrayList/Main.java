package DSA.ArrayList;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static ShoppingCart shopCart = new ShoppingCart();
    public static void main(String[] args) {
         boolean exit = false;
         int userChoice = 0;
         printInstructions();
         while(!exit){
             System.out.println("Enter your choice: ");
             userChoice = sc.nextInt();
             sc.nextLine();

             switch (userChoice){
                 case 0 : printInstructions();
                 break;
                 case 1 : shopCart.printList();
                 break;
                 case 2 : addItem();
                 break;
                 case 3 : modifyItem();
                 break;
                 case 4 : removeItem();
                 break;
                 case 5 : searchItem();
                 break;
                 case 6 : exit = true;
                 break;

             }
         }


    }
    public static void printInstructions() {
        System.out.println("0-Print the details ");
        System.out.println("1- Print the shopping list ");
        System.out.println("2-Add the Item");
        System.out.println("3- modify the item");
        System.out.println("4-Remove the item");
        System.out.println("5- Search the item");
        System.out.println("6-Exit the app");
    }

    public static void addItem(){
        System.out.println("Enter the item to be added: ");
        shopCart.addItem(sc.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter the item no to be modified: ");
        int itemNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the replacement");
        String newItem = sc.nextLine();
        shopCart.modifyCart(itemNo-1,newItem);
    }
    public static void removeItem(){
        System.out.print("Insert item to search");
        int itemNo = sc.nextInt();
        sc.nextLine();
        shopCart.removeElement(itemNo-1);
    }

    public static void searchItem(){
        System.out.print("Insert item you want to search: ");
        String searchIt = sc.nextLine();

        if(shopCart.searchItem(searchIt)!= null){
            System.out.println("Item  found");
        }
        else System.out.println("Item not found");
    }

}
