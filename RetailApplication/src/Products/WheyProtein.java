package Products;

import java.util.HashMap;

public class WheyProtein extends Product {
    private HashMap<Integer,Integer> bodyBuildingPrices = new HashMap<Integer,Integer>();;// ={{300,250},{500,450},{1000,950}};
    private HashMap<Integer,Integer> muscleTechPrices = new HashMap<Integer,Integer>();;  //={{300,300},{500,500},{1000,1000}};
    
    public WheyProtein(String Brand,int size) {
        super("WheyProtein","kg", Brand,size);
        
        bodyBuildingPrices.put(300,250);
        bodyBuildingPrices.put(500,450);
        bodyBuildingPrices.put(1000,950);

        muscleTechPrices.put(300, 300);
        muscleTechPrices.put(500, 500);
        muscleTechPrices.put(1000, 1000);

        setBodyBuildingPrices(bodyBuildingPrices);
        setMuscleTechPrices(muscleTechPrices);
        setPrice();
        
    }
    
}
