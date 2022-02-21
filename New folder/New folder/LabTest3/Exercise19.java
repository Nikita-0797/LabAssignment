import java.time.*;
import java.util.*;

public class Exercise19 {  
   public static void main(String[] args)
    {
        LocalDate pdate = LocalDate.of(2012, 07, 06);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.println("Difference is");
	 System.out.println("Years= "+diff.getYears());
     System.out.println( "Months= "+diff.getMonths());
	 System.out.println( "Days= "+diff.getDays());
					
  }
}