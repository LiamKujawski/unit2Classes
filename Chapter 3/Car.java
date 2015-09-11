

/**
 * A car has a certain fuel efficiency and a certainamount of fuel in the gas tank. The car can be driven a certain distance.
 * 
 * @author Kujawski 
 * @version 9/10/15
 */
public class Car
{
    /** Fuel effiency of the car in miles per gallon */
    private double fuelEffiency;
    /** amount of fuel left in cars tank iun gallons */
    private double fuelInTank;

    /**
     * Constructor for objects of class Car that specifies the fuel effiency
     */
    public Car( double fuelEffiency )
    {
       
        fuelEffiency = fuelEffiency;
        fuelInTank = 0;
    }

    /**
     * Simulates driving the car that sepcifies distance and reduce the amount of fuel in the tank.
     *
     * @pre       specified distance cannot result in the consumption of more gas than is available.
     * @param     distnace car drive in miles.
     * @return    description of the return value
     */
    public void drive( double distance )
    {
        fuelInTank = fuelInTank - distance / fuelEffiency;
    }
    
    /**
     * This returns amount of gas in the cars tank in units of gallons.
     *
     * 
     * @return  This returns amount of gas in the cars tank in units of gallons.
     */
    public double getGasInTank()
    {
        return fuelInTank;
        
    }

    /**
     * Increments the fuel in the cars tank by spedifiic amount in gallons
     *
     * @pre     gallonsOfGas must be a positive number
     * @param   gallonsOfGas  amount of gas to add to the cars tank in gallons
     * 
     * @return  description of the return value
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;
    }


}
