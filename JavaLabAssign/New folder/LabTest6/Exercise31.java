

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise31 
{
	private static List<Integer> voterList(Map<Integer,Integer> people) 
	{
		List<Integer> ans=new ArrayList<>();
		 Set<Map.Entry<Integer,Integer>> set=people.entrySet();
		 Iterator<Map.Entry<Integer,Integer>> i=set.iterator();
		 while(i.hasNext())
		 {
			 Map.Entry<Integer,Integer> entry=i.next();
			 if(entry.getValue()>=18)
			 {
				 ans.add(entry.getKey());
			 }	 
		 }	 
		 return ans;
	}
	public static void main(String[] args) 
	{
		 Map<Integer,Integer> people=new LinkedHashMap<>();
		 people.put(32,1);
		 people.put(45,2);
		 people.put(18,3);
		 people.put(21,4);
		 List<Integer> ans=voterList(people);
		 System.out.println(ans);
	}


}
