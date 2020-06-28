import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 
		List<String> employeeNames = new ArrayList <String>(); 
		employeeNames.add("Jim David");
		employeeNames.add("Jane Lee");
		employeeNames.add("Chris Ortiz"); 
		employeeNames.add("Lisa Grey"); 
		employeeNames.add("Jessica Peirce"); 
		//2. 
		Set<Integer> ids = new HashSet <Integer>(); 
		ids.add(3652);
		ids.add(3653);
		ids.add(3654);
		ids.add(3655);
		ids.add(3656);
		//3
		Map<Integer, String> employeeMap = new HashMap <Integer, String> (); 
		//5
		int i = 0; 
		//6 
		for (Integer id : ids) {
			String name = employeeNames.get(i);
			employeeMap.put(id, name);
			i++; 
		}
		//6
		for (int id : employeeMap.keySet()) {
			String name = employeeMap.get(id); 
			System.out.println(id + "=" + name);  
			i++;
		}
		//7
		StringBuilder idsBuilder = new StringBuilder();
		//8
		for (int id : ids) {
			idsBuilder.append(id + "-"); 
		}
		//9
		System.out.println(idsBuilder.toString()); 
		//10
		StringBuilder namesBuilder = new StringBuilder(); 
		//11
		for (String name : employeeNames) {
			namesBuilder.append(name + " "); 
		}
		//12
		System.out.println(namesBuilder.toString()); 
	} 
	
}
