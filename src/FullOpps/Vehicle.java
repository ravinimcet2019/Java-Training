package FullOpps;

public class Vehicle {
	protected String license_number;
    protected String make;
    protected String model;
    protected double price;
    
    public Vehicle(String l_n, String v_make, String v_model, double v_price)
    {
        license_number = l_n;
        make = v_make;
        model = v_model;
        price = v_price;
    }
    
    public String getVehicleName()
    {
        return make+" "+model;
    }
    
    public double price()
    {
        return price;
    }
    
    public String toString()
    {
        String result;
        
        result = "License # : "+ license_number+ "\nVehicle Name : "+getVehicleName()+"\nPrice : "+price;
        return result;
    }
}
