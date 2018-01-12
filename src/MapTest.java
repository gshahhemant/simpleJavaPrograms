import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class UserKey{
	
	
	public String name;
	
	public UserKey(String name) {
		this.name=name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserKey other = (UserKey) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserKey [name=" + name + "]";
	}
	
	
}

public class MapTest {
	
	public static void main(String args[]) {
		
		UserKey  userKey = new UserKey("hemant");
		 Map  <UserKey,String>map= new HashMap();
		 
		 map.put(userKey, "namrata");
		 
		 userKey.name="hemant1";
		 
		 
		 
		 map.put(userKey, "aarnashah");
		 
		
		
		System.out.println(map.get(new UserKey("hemant1")));
		
		for (UserKey key :map.keySet()) {
			System.out.println(key.toString()+":"+map.get(key));
		}
		
		
		
		 Map  <Integer,String>testMap= new HashMap();
		 
		 testMap.put(100, "hemant");
		 testMap.put(50, "namrata");
		 testMap.put(10, "aarna");
		 testMap.put(20, "meet");
		 testMap.put(30, "deep");
		 
		 System.out.println("\n\n\n\nBefore sorting");
		 
		 for (Integer key :testMap.keySet()) {
				System.out.println(key.toString()+":"+testMap.get(key));
			}
		 
		
		 List<Integer> lst = new ArrayList(testMap.keySet());
		 
			 
		 Collections.sort(lst);
		 
		 System.out.println("list==>"+lst);
		 
		 System.out.println("\n\n\nAfter sorting");
		 
		
		
		 
		 for(Integer lsta: lst ) {
			 System.out.println(lsta+":"+testMap.get(lsta));
			 
		 }
		 
		 
		 
		
	}

}
