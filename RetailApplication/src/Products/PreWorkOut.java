package Products;

import java.util.HashMap;

public class PreWorkOut extends Product {
    private HashMap<Integer,Integer> bodyBuildingPrices = new HashMap<Integer,Integer>();//{{300,300},{500,500},{1000,1000}};
    private HashMap<Integer,Integer> muscleTechPrices = new HashMap<Integer,Integer>();//{{300,350},{500,550},{1000,1050}};

    public PreWorkOut(String brand,int size) {
        super("PreWorkOut","kg",brand, size);

        bodyBuildingPrices.put(300,300);
        bodyBuildingPrices.put(500,500);
        bodyBuildingPrices.put(1000,1000);

        muscleTechPrices.put(300, 350);
        muscleTechPrices.put(500, 550);
        muscleTechPrices.put(1000, 1050);

        setBodyBuildingPrices(bodyBuildingPrices);
        setMuscleTechPrices(muscleTechPrices);
        setPrice();
    }
    

}
