package Products;

import java.util.HashMap;

public abstract class Product {
    private String name;
    private int size;
    private String unit;
    private String brand;
    private HashMap<Integer,Integer> bodyBuildingPrices;
    private HashMap<Integer,Integer> muscleTechPrices;
    private int productID;
    private int price;
    

    public Product(String name, String unit,String brand, int size){ 
        this.name = name;
        this.unit = unit;
        this.brand = brand;
        this.productID = 0;
        this.price = 0;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        int price = 0;
        if(this.brand=="Body Building"){
            price = bodyBuildingPrices.get(this.size);
        }else{
            price = muscleTechPrices.get(this.size);
        }
        this.price = price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getProductID() {
        return productID;
    }

    public HashMap<Integer,Integer> getMuscleTechPrices() {
        return muscleTechPrices;
    }

    public void setMuscleTechPrices(HashMap<Integer,Integer> muscleTechPrices) {
        this.muscleTechPrices = muscleTechPrices;
    }

    public HashMap<Integer,Integer> getBodyBuildingPrices() {
        return bodyBuildingPrices;
    }

    public void setBodyBuildingPrices(HashMap<Integer,Integer> bodyBuildingPrices) {
        this.bodyBuildingPrices = bodyBuildingPrices;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void generateKey(){
        setProductID(productID+1);
    }

}
