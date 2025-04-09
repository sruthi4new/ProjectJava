package resturantsProject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Resturant
{
	HashMap<String , Integer> menu = null;
	Resturant()
	{
		menu = new HashMap<String , Integer>();
		
		menu.put("idli",20);
		menu.put("dosa",50);
		menu.put("upma",30);
		menu.put("uppam",20);
		menu.put("bonda",40);
    }
	void display() 
	{
		Set<String> s = new HashSet();
		s = menu.keySet();
		for(String foodname : s)
		{
			System.out.println(foodname+" "+menu.get(foodname));
		}
	}

}
