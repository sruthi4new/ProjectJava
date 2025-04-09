package resturantsProject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Customer extends Resturant
{
	HashMap<String , Integer> order = null;
	Customer()
	{
		order = new HashMap<String , Integer>();
		order.put("idli",4);
		order.put("dosa",2);
		order.put("upma",5);
		order.put("uppam",10);
	}
	
	void diplaymenu() 
	{
		super.display();
	}
	
	void displayorder() 
	{
		System.out.println("the order that you have placed");
		Set<String> s = new HashSet<String>();
		s = order.keySet();
		double total = 0;
		double totalBill = 0;
		for(String foodName : s) 
		{
		   total =  menu.get(foodName)*	order.get(foodName);
		   System.out.println(foodName + "      " + menu.get(foodName) + "      "+order.get(foodName)+"      " + total);
		   totalBill += total;
		   
		}
		System.out.println("total amount of order :"+" "+ totalBill);
		double d = (0.05)*totalBill;
		double sum = totalBill-d;
		
		 if(totalBill>500) {
				System.out.println("you are eligible for 5% diccount which is : "+d +"\n"+"total payable is :"+" "+sum);
			}  
		 else 
	        {
		        System.out.println("total payable is : "+" "+totalBill);
	        }

	}
}

