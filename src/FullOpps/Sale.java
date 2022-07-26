package FullOpps;

public class Sale extends Vehicle {

	private double depreciation,sell_price;
    private double rate;
    
    public Sale(String vehnum,String make,String model, double p, double depval)
    {
        super(vehnum,make,model,p);
        depreciation = depval;
        sell_price = p;
    }
    
    public void setDepreciation(double rate)
    {
        depreciation = (rate/100)*super.price();
    }
    
    public double price()
    {
       sell_price = super.price() - depreciation;
       return sell_price;
    }
    
    public String toString()
    {
        return (super.toString() + "\n Depreciation\t:"+ depreciation +"\n Selling Price \t:"+ price());
    }
}
