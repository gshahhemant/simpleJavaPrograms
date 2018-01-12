import java.util.HashMap;
import java.util.Map;

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
		
	}

}
