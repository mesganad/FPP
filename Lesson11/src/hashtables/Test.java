package hashtables;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		//(K,V)==>(Id, firstName)
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Misgan");
		map.put(2,"Asmamaw");
		map.put(3, "Shmels");
		for(var item: map.entrySet()) {
			if(item.getKey()==2){
			System.out.println(item.getValue());
			}
		}
		//System.out.println(map.get(1));
		//System.out.println(map);
	}

}
