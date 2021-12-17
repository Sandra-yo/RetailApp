package Main;

import java.util.HashMap;

import Products.NO2;
import Products.PreWorkOut;
import Products.Product;
import Products.WheyProtein;
import Retail.Retailer;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Retailer retailer = new Retailer();
        
        //products
        PreWorkOut p1 = new PreWorkOut("Body Building",500);
        PreWorkOut p2 = new PreWorkOut("Muscle Tech",1000);

        NO2 p3 = new NO2("Body Building");
        NO2 p4 = new NO2("Muscle Tech");

        WheyProtein p5 = new WheyProtein("Body Building",300);
        WheyProtein p6 = new WheyProtein("Muscle Tech",300);

        retailer.addToCart(p1);
        retailer.addToCart(p6);
        retailer.addToCart(p2);
        //retailer.removeProductFromCart(2);
        System.out.println(retailer.searchProduct(p2));

        //retailer.print();
    }
}
