package BaseLayer;

import java.util.LinkedHashSet;
import java.util.Set;

public class BaseClass {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,3,8,9,3,45,4};
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer i : set)
		{
			System.out.println(i);
		}
	}

}
