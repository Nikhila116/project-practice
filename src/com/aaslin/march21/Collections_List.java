package com.aaslin.march21;

import java.util.*;

public class Collections_List  {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>()
				{
			          @Override
			          public boolean add(String value)
			          {
			        	  return super.add(value+"Modi");
			          }
			
				};
				
				list.add("nikhila");
				
				System.out.println(list);
	}

	
	
}
