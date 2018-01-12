import java.util.Collections;

public class Recursive {

	Integer sum=0;
	Integer sumFebo=0;
	Integer num1=0;
	Integer  num2 =1;
	Integer  digit=0;
	public Integer sumofArray(Integer array[], Integer index) {

		if (index==0)
			return 0 ;

		sum = array[index-1] + sumofArray(array,--index);
		System.out.println(sum);
		System.out.println(index);
		return sum;

	}

	public int   factorial(int n){    
		if (n == 0)    
			return 1;    
		else    
			sum= n * factorial(n-1);
		System.out.println("n=>"+n);
		System.out.println("sum=>"+sum);
		 return sum;
		
	}    

	public  void   fiboSeries(int limit){    
		if(limit>0) {
		
			sumFebo= num1+ num2;
			System.out.println(sumFebo);
			num1=num2;
			num2=sumFebo;
			fiboSeries(--limit);
		
		}
	}  

	public  int  sumOfDigit(int number){    
						
		return number==0 ? 0 : number % 10+ sumOfDigit(number/10);

	}  
	
	public static void decToBin(int n) {
		if (n > 0) {
		
			//System.out.println(n % 2);
			decToBin(n / 2);
			System.out.println(n % 2);
		}
	}
	
	public void sum(int num) {
		
		if (num <= 0)
			return ;
		
		System.out.println("first==>"+num);
		 sum(--num);
		 
		 sum(--num);
		 
		System.out.println("after==>"+num);
		
	}
	
	public static void main(String args[]) {

		//Integer array1[]= {1,2,3,4,5};
		//int index=0;
		//int sum = array1[index-1] +-- index;
		//System.out.println(sum);
		
		
		Recursive   recursive = new Recursive();
		Integer array[]= {1,2,3,4,5};// 15 is answer
		System.out.println("recursive output==>"+recursive.sumofArray(array, array.length));

		//System.out.println("fact"+recursive.factorial(5));*/
	
	//	recursive.fiboSeries(10-2);// you can first two numbers before calling fucntion like 0 and 1

		//System.out.println(recursive.sumOfDigit(1234));
		
		//recursive.decToBin(20);
		
		//recursive.sum(3);
	}

}
