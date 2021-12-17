package Products;

import java.util.HashMap;

public class NO2 extends Product {
    final HashMap<Integer,Integer> bodyBuildingPrices = new HashMap<Integer,Integer>(); // ={{250,750}};
    final HashMap<Integer,Integer> muscleTechPrices = new HashMap<Integer,Integer>();//{{250,800}};
    
    private String brand;

    public NO2(String brand){
        super("NO2","gr",brand, 250);
        muscleTechPrices.put(250, 750);
        bodyBuildingPrices.put(250, 800);
        setMuscleTechPrices(muscleTechPrices);
        setBodyBuildingPrices(bodyBuildingPrices);
        setPrice();
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    

}
