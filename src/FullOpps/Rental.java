package FullOpps;

public class Rental extends Vehicle{

	protected int number_of_days_for_rental;
    protected double rate_per_day;
    
    public Rental(String l_n, String v_make, String v_model, double v_price, int no_of_day, double r_p_d)
    {
        super(l_n,v_make,v_model,v_price);
        number_of_days_for_rental = no_of_day;
        rate_per_day = r_p_d;
    }
    
    public double price()
    {
        return number_of_days_for_rental*rate_per_day;
    }
    
    public String toString()
    {
        String result;
        result = super.toString();
        
        result += "\nRetal Info: "+"\n\tNumber of Days: "+number_of_days_for_rental+"\n\tRate per day: "+rate_per_day+"\n\tTotal: "+price();
        return result;
    }
}
