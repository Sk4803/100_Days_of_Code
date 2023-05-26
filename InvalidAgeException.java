import java.time.*;
class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {  
        super(str);  
    }  
}  
public class CustException {
    static void validate (int yearDifference) throws InvalidAgeException{    
        if(yearDifference < 18){
         throw new InvalidAgeException("Age is not valid to have a bank account");    
    }  
        else {   
         System.out.println("Account opening allowed!");   
        }   
    }

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate date = LocalDate.of(2012, Month.JANUARY, 1);
        Period p = Period.between(date, d);

        try {
            validate(p.getYears());
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }

    }
}
