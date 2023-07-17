package JavaCoursework;

/**
 * This is ElectricCar class which is the child class of Car class
 * @author (Amit Baniya)
 * @version (1.0)
 */
//Declaration of Electric class whose parents class is Car
public class ElectricCar extends Car
{
    //defining eight attributes of FuelCar whose access modifiers are all private
    private String customerName; //defining customerName attribute as a String datatype
    private int batteryCapacity; //defining batteryCapacity attribute as a integer datatype
    private int batteryWarranty; //defining batteryWarranty attribute as a integer datatype
    private String purchaseDate; //defining purchaseDate attribute as a String datatype
    private String range; //defining range attribute as a String datatype
    private int rechargeTime; //defining rechargeTime attribute as a integer datatype
    private boolean isBought; //defining isBought attribute as a boolean datatype
    private boolean isSold; //defining isSold attribute as a boolean datatype
    
    //creating constructor of ElectricCar which has parameters carId, carName,carBrand, carPrice, batteryCapacity whose access modifier is public
    public ElectricCar(int carId, String carName, String carBrand, String carPrice, int batteryCapacity){
       //accessing attributes of parents class which are carId, carName, carBrand and carPrice using 'super' keyword
       super(carId, carName, carBrand, carPrice);
       //different attributes are initialized
       this.batteryCapacity = batteryCapacity;  //intializes the parameter value of battery Capacity to its instanace varaiable
       this.customerName = "";  //customerName attribute is initialized as an empty String
       this.batteryWarranty = 0;  //battertWarranty attribute is initialized as 0
       this.purchaseDate = "";  //purchaseDare attribute is initialized as an empty String
       this.range = "";  //range attribute is initialized as an empty String
       this.rechargeTime = 0;  //rechargeTime attribute is initialized as 0
       this.isBought = false;  //isBought attribute is initialized as false
       this.isSold = false;  //isSold attribute is initialized as true
       
       }  
    
    // creation of an accessor method getCustomerName whose access modifier is public which returns the set value of customerName
    public String getCustomerName(){
        return this.customerName;
    }
    
    // creation of an accessor method getBatteryCapacity whose access modifier is public which returns the set value of batteryCapacity
    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    
    // creation of an accessor method getBatteryWarranty whose access modifier is public which returns the set value of batteryWarranty
    public int getBatteryWarranty(){
        return this.batteryWarranty;
    }
    
    // creation of an accessor method getPurchaseDate whose access modifier is public which returns the set value of purchaseDate
    public String getPurchaseDate(){
        return this.purchaseDate;
    }
    
    // creation of an accessor method getRange whose access modifier is public which returns the set value of range
    public String getRange(){
        return this.range;
    }
    
    // creation of an accessor method getRechargeTime whose access modifier is public which returns the set value of rechargeTime
    public int getRechargeTime(){
        return this.rechargeTime;
    }
    
    // creation of an accessor method getIsBought whose access modifier is public which returns the set value of isBought
    public boolean getIsBought(){
        return this.isBought;
    }
    
    // creation of an accessor method getIsSold whose access modifier is public which returns the set value of isSold
    public boolean getIsSold(){
        return this.isSold;
    }
    
    //creation of mutator method setDistributorName whose access modifier is public
    public void setCustomerName(String customerName){
        /*
         * if the electric car has not been bought then
         * parameter value of battery Capacity is initialized to its instanace varaiable
         */
        if(isBought == false)
        this.customerName = customerName;
        //if the electric car has already been bought then unable to change customer name message is displayed
        else
        System.out.println(" It is not possible to change the customer name");
    }
    
    //creation of purchaseFuelCar method whose access modifer is public with parameters customerName, batterWarranty, purchaseDate, range, rechargeTime
    public void buyElectricCar (String customerName, int batteryWarranty, String purchaseDate, String range, int rechargeTime){
        
        /*
         * if the electirc car has not been bought then
         * the customer name is set to the parameter value of customerName
         * by calling the setCustomerName method
         * the parameter value of batteryWarranty, purchaseDate, range, and rechargeTime are set
         * to their corresponding instance varaibles
         * also isBought status is set to be true
         */
      if(isBought == false)
      {
          setCustomerName(customerName);
          this.batteryWarranty = batteryWarranty;
          this.purchaseDate = purchaseDate;
          this.range = range;
          this.rechargeTime = rechargeTime;
          isBought = true;
      }
      
      //if the electric car has already been bought then "the electic car has been bought" message is displayed
      else
      {
          System.out.println("The Electric Car has already been bought");
      }
    }
    
    //creation of sellElectricCar method whose access modifer is public with parameter customerName 
    public void sellElectricCar(String customerName){
        //intializes the parameter value customerName to its instance varaible
        this.customerName = customerName;
        /*
         * if the Electric Car has not been sold then
         * the batterCapacity, batteryWarranty, rechargeTiime are all set to 0 and puchase Date, range are set to an empty string
         * also isSold status is set to be true and isBought status to be false
         */
        if(isSold == false)
        {
            
            batteryCapacity = 0;
            batteryWarranty = 0;
            purchaseDate = "";
            range = "";
            rechargeTime = 0;
            isSold = true;
            isBought = false;   
            
        }
        //if the electric car has been sold then the message sying car has been sold is printed
        else
            System.out.println("The car has already been Sold");    
    }
    //this overrides the display method of the Car class which is the parents class of this class
    @Override
    //creation of display method whose access modifer is public which displays the attributes of FuelCarclass with proper annotation
    public void display(){
        super.display(); //calls the display method from the parents class
        //if the Electric Car is bought then this displays the value of different attributes with proper annotation
        if(isBought == true)
        {
            System.out.println("Customer Name : " + customerName); //displays the intialized value of customerName
            System.out.println("Battery Capacity: " + batteryCapacity); //displays the intialized value of batteryCapacity
            System.out.println("Battery Warranty: " + batteryWarranty); //displays the intialized value of batteryWarranty
            System.out.println("Puchase Date: " + purchaseDate); //displays the intialized value of purchaseDate
            System.out.println("Range: " + range); //displays the intialized value of range
            System.out.println("Recharge Time: " + rechargeTime); //displays the intialized value of rechargeTime
        }
    }//display method end 
    
}
