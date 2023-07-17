package JavaCoursework;

/**
 * This is the Car class which is the parents class of both FuelCar class and ElectricCar class
 * @author (Amit Baniya)
 * @version (1.0)
 */

public class Car //declaration of Car class whose access modifier is public
{
   //defining eight attributes of FuelCar whose access modifiers are all private
   private int carId; //defining carId attribute as a int datatype
   private String carName; //defining carName attribute as a String datatype
   private String carBrand; //defining carBrand attribute as a String datatype
   private String carPrice; //defining carPrice attribute as a String datatype
   private String carColor; //defining carColor attribute as a String datatype
   
   //creating constructor of Car which has parameters carId, carName,carBrand, carPrice whose access modifier is public
   public Car (int carId, String carName, String carBrand, String carPrice){
       //different attributes are initialized
       this.carId = carId; //carId attribute is initialized as the value of the constructor's parameters
       this.carName = carName; //carName attribute is initialized as the value of the constructor's parameters
       this.carBrand = carBrand; //carBrand attribute is initialized as the value of the constructor's parameters
       this.carPrice = carPrice; //carPrice attribute is initialized as the value of the constructor's parameters
       this.carColor = ""; //carColor attribute is initialized as an empty
       }  
        //constructor end
        
        // creation of an accessor method getCarId whose access modifier is public which returns the set value of carId 
       public int getCarId(){ 
           return this.carId; 
       }
       
       // creation of an accessor method getCarName whose access modifier is public which returns the set value of carName 
       public String getCarName(){ 
           return this.carName;
        }
        
        // creation of an accessor method getCarBrand whose access modifier is public which returns the set value of carBrand
        public String getCarBrand(){ 
           return this.carBrand;
       }
       
       // creation of an accessor method getCarPrice whose access modifier is public which returns the set value of carPrice 
       public String getCarPrice(){ 
           return this.carPrice;
       }
        
       // creation of an accessor method getCarColor whose access modifier is public which returns the set value of carColor 
       public String getCarColor(){ 
           return this.carColor;
       }
       
       //creation of mutator method setCarColor whose access modifier is public which sets the value of carColor
        public void setCarColor(String carColor){ 
            this.carColor = carColor;
       }
    
        //creation of display method whose access modifer is public which displays the attributes of car with proper annotation
        public void display(){
            System.out.println("Car Id: " + carId); //displays the intialized value of carId
            System.out.println("Car Name: " + carName); //displays the intialized value of carName
            System.out.println("Car Brand: " + carBrand); //displays the intialized value of carBrand
            System.out.println("Car Price: " + carPrice); //displays the intialized value of carPrice
            //displays Car's Color is Empty if the attribute has an empty value and if not then it prints the set value of carColor
            if(carColor == "")
            System.out.println("Car Color: Empty");
            else
            System.out.println("Car Color: " + carColor);
        }
       //end of display method
    
}// end of Car class
