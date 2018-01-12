import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebCOM {

	 public List<Word> countWord(List<String> lst){
		 
		
		 
		 Map  <String,Word> map = new HashMap<String,Word>();
		 int count=1;
		 for(String  str: lst) {
			 
			 if(!map.containsKey(str)) {
				 map.put(str, new Word(str,count));
			 }else {
				 map.get(str).setCount(map.get(str).getCount()+1);
				
			 }
			 
			 
		 }
		 
		 List<Word> lstWords1 =new ArrayList(map.values());
		 
		 
		 return lstWords1;
		 
				 
	 }
	
	
	public static void main(String args[]) {
		
		WebCOM w = new WebCOM();
		
		List lst = Arrays.asList(args);
		

		System.out.println(w.countWord(lst));
		
	}

}


class Word{
	
	String str;
    int count;
    
	public Word(String str, int count) {
		super();
		this.str = str;
		this.count = count;
	}
	@Override
	public String toString() {
		return "word [str=" + str + ", count=" + count + "]";
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
	
}
