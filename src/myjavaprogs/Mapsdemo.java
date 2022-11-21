package myjavaprogs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapsdemo {
	
public void mapTest () {
	
	Map<String, Integer> hm=new HashMap<String, Integer>();
	
	System.out.println("Before adding "+hm);
	
	hm.put("Hari", 112233);
	hm.put("Santoshee", 66554);
	hm.put("Ashwani", 987456);
	//System.out.println("after adding "+hm);
	//hm.remove("Santoshee");
	//System.out.println("after adding "+hm);
	//System.out.println(hm.get("Santoshee"));
	
	Set<String> Allkeys=hm.keySet();
	
	for (String key : Allkeys) {
		System.out.println(hm.get(key));
	
	}
}
public static void main(String[] args) {
	Mapsdemo obj1=new Mapsdemo();
	obj1.mapTest();
	
}
}
