import java.lang.*;

import java.util.*;
 

public class Exercise26 {
 
public static HashMap<String, Integer>sortByValue(HashMap<String, Integer> hm)
 {

        List<Map.Entry<String, Integer> > list= new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());


        Collections.sort
		(list,(i1,i2) -> i1.getValue().compareTo(i2.getValue()));
 
			HashMap<String,Integer> temp= new LinkedHashMap<String, Integer>();

        for (Map.Entry<String, Integer> aa : list)
		{

            temp.put(aa.getKey(), aa.getValue());

        }

        return temp;

 }

    public static void main(String[] args)

    {
 

        HashMap<String, Integer> hm= new HashMap<String, Integer>();
 

       

        hm.put("Pratiksha", 91);

        hm.put("Shweta", 79);

        hm.put("Ritesh", 80);
		hm.put("Utkarsh", 92);
		hm.put("Nikita", 87);

        Map<String, Integer> hm1 = sortByValue(hm);
 

        for (Map.Entry<String, Integer> en :hm1.entrySet())

              {

            System.out.println("Name = " + en.getKey() + ", Marks = "+ en.getValue());

        }

    }
}