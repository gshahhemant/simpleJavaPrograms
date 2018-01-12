
public class Visa {

	public void findNearNumber(Integer array[], Integer num) {
		int tempDiff = 0;
		int mindiff = Integer.MAX_VALUE;
		int min = 0;
		int max = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				tempDiff = Math.abs(num - (array[i] + array[j]));

				if (tempDiff < mindiff) {
					mindiff = tempDiff;
					min = i;
					max = j;

				}
			}
		}

		System.out.println("(" + array[min] + "," + array[max] + ")");

	}

	public static void main(String args[]) {

		Visa visa = new Visa();

		Integer[] array = { 20, 8, 6, 3, 56, 50, 23, 45 };
		visa.findNearNumber(array, 47);

	}

}