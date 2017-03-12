import java.util.*;
public class keyhas {
public static void main(String args[]){
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	hm.put(101, "Ankita");
	hm.put(102, "Aditi");
	hm.put(201, "Anushka");
	hm.put(201, "Ankita");
for(Map.Entry m:hm.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
}
}
}


