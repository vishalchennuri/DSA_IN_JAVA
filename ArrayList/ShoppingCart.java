package DSA.ArrayList;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<String> shoppingCart = new ArrayList<>();

    public void addItem(String item){
        shoppingCart.add(item);
    }
    public void printList(){
        System.out.println("Size: "+shoppingCart.size() );

        for(int i=0;i< shoppingCart.size();i++){
            System.out.println(shoppingCart.get(i));
        }
    }
    public void modifyCart(int position , String item){
        shoppingCart.set(position,item);
        System.out.println(shoppingCart.get(position));
    }
    public void removeElement(int position){
        shoppingCart.remove(position);
    }
    public String searchItem(String itemName){
        int position = shoppingCart.indexOf(itemName);
        if(position >= 0){
            return shoppingCart.get(position);
        }else  return null;

    }
}
