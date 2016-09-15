
/**
 * The PhoneNumber class creates a phone number that can be changed with the changeNumber method.
 * 
 * @author Ryan Barrett
 * @version 1.0
 */
public class PhoneNumber
{  
    private String phoneNumber;
    /**
     * Constructor for objects of class PhoneNumber
     */
    public PhoneNumber()
    {
        phoneNumber= "100-100-1000";
    }
    public void changeNumber(int areaCode, int numBegin, int numEnd){
        if(areaCode<100 || areaCode>99){
            System.err.println("Please enter a valid number.");
        }
        else if(numBegin<100 || numBegin>999){
            System.err.println("Please enter a valid number.");
        }
        else if(numEnd<1000 || numEnd>9999){
          System.err.println("Please enter a valid number.");  
        }
        else{
            phoneNumber=areaCode+"-"+numBegin+"-"+numEnd;
    }

}
}