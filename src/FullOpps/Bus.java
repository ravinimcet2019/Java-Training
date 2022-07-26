package FullOpps;

public class Bus extends Rental{


    private double driver_cost;
    
    public Bus(String l_n, String v_make, String v_model, double v_price, int no_of_day, double r_p_d, double dri_cost)
    {
        super(l_n,v_make,v_model,v_price,no_of_day, r_p_d);
        driver_cost = dri_cost;
    }
    
    public void setDriverCost(double s_driver)
    {
        driver_cost = s_driver;
    }
    
    public String toString()
    {
        String result;
        double final_cost = driver_cost + super.price();
        result = super.toString();
        
        result += "\n\tDriver Cost: "+driver_cost+"\n\tFinal cost: "+final_cost;
        return result;
    }
    
    public double price()
    {
        return super.price()+driver_cost;
    }
}
