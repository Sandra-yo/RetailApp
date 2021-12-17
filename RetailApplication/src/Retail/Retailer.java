package Retail;
import java.util.HashMap;
import java.util.TreeSet;

import Products.Product;

public class Retailer {

    private TreeSet<Integer> productOrder;
    private HashMap<Integer,Product> productsInCart;

    public Retailer(){
        productOrder = new TreeSet<Integer>();
        productsInCart = new HashMap<Integer,Product>();
    }

    public void addToCart(Product product){
        product.generateKey();
        while (productsInCart.get(product.getProductID())!=null) {
            product.generateKey();   
        }
        productOrder.add(product.getProductID());
        
        productsInCart.put(product.getProductID(), product);
    }

    public int searchProduct(Product product){
        int id = 0;
        if(productsInCart.get(product.getProductID()) != null){
            id = productsInCart.get(product.getProductID()).getProductID();
        }
        System.out.println(product);
        return id;
    }

    public void removeProductFromCart(int productID){
        if(productsInCart.get(productID)!=null){
            productOrder.remove(productID);
            productsInCart.remove(productID);
        }else{
            System.out.println("There are not a product with that ID");
        }
    }
    public void print(){
        double total = 0.0;
        System.out.println("The cart contains:\n");
        
        for (Integer product : productOrder) {
            System.out.print(productsInCart.get(product).getProductID()+".-");
            System.out.print(productsInCart.get(product).getName()+" - ");
            System.out.print(productsInCart.get(product).getBrand()+" : ");
            System.out.print(productsInCart.get(product).getSize()+productsInCart.get(product).getUnit()+" ...................... $");
            System.out.println(productsInCart.get(product).getPrice());

            total += productsInCart.get(product).getPrice();
        }
        

        System.out.println("Your total price is ................ $"+total);

    }

}
