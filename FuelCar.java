package JavaCoursework;

/**
 * This is FuelCar Class which is the child class of Car class
 * @author (Amit Baniya)
 * @version (1.0)
 */
//Declaration of FuelCar class whose parents class is Car
public class FuelCar extends Car  
{
    //defining eight attributes of FuelCar whose access modifiers are all private
    private String distributorName; //defining distributerName attribute as a String datatype
    private String fuelType; //defining fuelType attribute as a String datatype
    private int numberOfSeats; //defining numberOfSeats attribute as a integer datatype
    private String bookedDate; //defining bookedDate attribute as a String datatype
    private String purchaseDate; //defining purchaseDate attribute as a String datatype
    private int mileage; //defining mileage attribute as a integer datatype
    private String transmissionType; //defining transmissionType attribute as a String datatype
    private boolean isPurchased; //defining isPurchased attribute as a boolean datatype
    
    //creating constructor of FuelCar which has parameters carId, carName,carBrand, carPrice,fuelType, numberOfSeats, mileage whose access modifier is public
    public FuelCar(int carId, String carName, String carBrand, String carPrice, String fuelType, int numberOfSeats, int mileage){
        //accessing attributes of parents class which are carId, carName, carBrand and carPrice using 'super' keyword
        super(carId, carName, carBrand, carPrice); 
        //different attributes are initialized
        this.fuelType = fuelType; //the parameter value is intialzed to its instance varaibale which is fuelType
        this.numberOfSeats = numberOfSeats; //the parameter value is intialzed to its instance varaibale which is numberOfSeats
        this.mileage = mileage;  //the parameter value is intialzed to its instance varaibale which is mileage
        this.distributorName = ""; //distributerName attribute is initialized as an empty String
        this.bookedDate = ""; //bookedDate attribute is initialized as an empty String
        this.purchaseDate = ""; //purchaseDate attribute is initialized as an empty String
        this.transmissionType = ""; //transmissionType attribute is initialized as an empty String
        this.isPurchased = false; //isPurchased attribute is initialized as false
        
    }
    
    // creation of an accessor method getDistributorName whose access modifier is public which returns the set value of distributorName
    public String getDistributorName(){
        return this.distributorName;
    }
    
    // creation of an accessor method getFuelType whose access modifier is public which returns the set value of fuelType
    public String getFuelType(){
        return this.fuelType;
    }
    
    // creation of an accessor method getNumberOfSeats whose access modifier is public which returns the set value of numberOfSeats
    public int getNumeberOfSeats(){
        return this.numberOfSeats;
    }
    
    // creation of an accessor method getBookedDate whose access modifier is public which returns the set value of bookedDate 
    public String getBookedDate(){
        return this.bookedDate;
    }
    
    // creation of an accessor method getPurchaseDate whose access modifier is public which returns the set value of purchase 
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    
    // creation of an accessor method getMileage whose access modifier is public which returns the set value of mileage
    public int getMileage(){
        return this.mileage;
    }
    
    // creation of an accessor method getTransmissionType whose access modifier is public which returns the set value of transmissionType
    public String getTransmissionType(){
        return this.transmissionType;
    }
    
    // creation of an accessor method getIsPurchased whose access modifier is public which returns the set value of isPurchased
    public boolean getIsPurchased(){
        return this.isPurchased;
    }
    
    //creation of mutator method setDistributorName whose access modifier is public which sets the value of distributorName
    public void setDistributerName(String distributorName){
        this.distributorName = distributorName;  
    }
    
    //creation of mutator method setTransmissionType whose access modifier is public which sets the value of transmissionType
    public void setTransmissionType(String transmissionType){
        this.transmissionType = transmissionType;  
    }
    
    //creation of purchaseFuelCar method whose access modifer is public with parameters bookedDate and purchaseDate
    public void purchaseFuelCar(String bookedDate, String purchaseDate){
        
        /*if the car has been purchased then
         * it sets the carColor Silver
         * by calling the setCarColor method
         * also this calls the display method from the parents class which is Car
         * and also it prints the intialized value of distributor Name with proper annotation 
         */
        if(isPurchased == true)
        {
            setCarColor("Silver");
            super.display();
            System.out.println("Distributor Name: " + distributorName);
        }
        
        /*
         * if the car hasn't been purchased then
         * it sets the value of distributor Name "Amit Baniya" by calling the setDistributerName
         * along with that it sets the value of transmissionType to "Automatic" by calling the setTransmissionType
         * this also intializes the parameters value in the attributes which are bookedDate and purchaseDate
         * and it sets the value of isPurchased to true
         */
        else
        {
            
            setDistributerName("Amit Baniya");
            setTransmissionType("Automatic");
            this.bookedDate = bookedDate;
            this.purchaseDate = purchaseDate;
            isPurchased = true;
        
        }
    }
    
      @Override  //this overrides the display method of the Car class which is the parents class of this class
      //creation of display method whose access modifer is public which displays the attributes of FuelCarclass with proper annotation
    public void display(){
        super.display();//calls the display method from the parents class 
        //if the FuelCar is purchased then this displays the value of different attributes with proper annotation
        if(isPurchased == true)
        {
        
            System.out.println("Distributor name: " + distributorName);//displays the intialized value of distributorName
            System.out.println("Fuel Type: " + fuelType);//displays the intialized value of fuelType
            System.out.println("Booked Date: " + bookedDate);//displays the intialized value of bookedDate
            System.out.println("Purchase Date: " + purchaseDate);//displays the intialized value of purchaseDate
            System.out.println("Mileage: " + mileage);//displays the intialized value of mileage
            System.out.println("Number of Seats: " + numberOfSeats);//displays the intialized value of numberOfSeats
            System.out.println("Transmission Type: " +  transmissionType);//displays the intialized value of transmissionType
            
        }
}
}