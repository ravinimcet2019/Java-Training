package FullOpps;

public class TestVehicle {

	public static void main(String[] arg)
    {
        Vehicle[]comp1161_motors = new Vehicle [4];
        Sale veh1 = new Sale("FG1000", "Honda", "Civic", 100000.00, 25000);
        Rental veh2 = new Rental("GH7000", "Mercedez", "BClass", 125000.00, 5, 300);
        Bus veh3 = new Bus("AY3000","Bugatti","Veyron",300000.00, 5, 300,10000);
        Sale veh4 = new Sale("HI2000", "Nissan", "Sunny",75000.00,6000.00);
        
        Vehicle me = new Bus("BW1099","Nissan","Tida", 120000, 10, 400, 1000);
        comp1161_motors[0] = veh1;
        comp1161_motors[1] = veh2;
        comp1161_motors[2] = veh3;
        comp1161_motors[3] = veh4;
        
        ((Sale)comp1161_motors[0]).setDepreciation(20.0);
       ((Bus)comp1161_motors[2]).setDriverCost(15000.0);
        
        for( Vehicle veh : comp1161_motors)
        {
            System.out.println();
            System.out.println(veh);
        }
    }
}
