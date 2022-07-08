
public class Week_3_Coding_Assignment {

	public static void main(String[] args) {
		
		int[] arr1 = {101, 43, 44, 12};
		double[] arr2 = {34.5, 2, 54, 654.33};
		double[] arr3 = {23.5, 55.5, 43, 101};
		
		ages();
		System.out.println("----------------");
		names();
		System.out.println("----------------");
		System.out.println(concatWord("我叫李乐-", 5));
		System.out.println("----------------");
		System.out.println(fullName("Lee", "Shawver"));
		System.out.println("----------------");
		System.out.println(greaterThan100(arr1));
		System.out.println("----------------");
		System.out.println(average(arr2));
		System.out.println("----------------");	
		System.out.println(greaterAverage(arr2, arr3));
		System.out.println("----------------");	
		System.out.println(willBuyDrink(true, 10.7));
		System.out.println("----------------");	
		System.out.println(containsString("我喜欢编程"));
		System.out.println("----------------");	
	}
	
	public static void ages() {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int firstFromLast = ages[ages.length - 1] - ages[0];
		System.out.println(firstFromLast);
		ages[7] = 37;
		firstFromLast = ages[ages.length - 1] - ages[0];
		System.out.println(firstFromLast);
		double totalAges = 0;
		for (int age : ages) {
			totalAges += age;
		}
		double averageAge = totalAges / ages.length;
		System.out.println(averageAge);
	}
	
	public static void names() {
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		double averageLength = (totalLetters / names.length);
		System.out.println(averageLength);
		
		StringBuilder allNames = new StringBuilder("");
		for (String name : names) {
			allNames.append(name + " ");
		}
		System.out.println(allNames);
		System.out.println("----------------");
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		int sumOfLengths = 0;
		for (int length : nameLengths) {
			sumOfLengths += length;
		}
		System.out.println(sumOfLengths);
	}
	
	public static String concatWord(String word, int n) {
		String wholeWord = "";
		for (int i = 1; i <= n; i++) {
			wholeWord = wholeWord + word;
		}
		return wholeWord;
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public static Boolean greaterThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		if (sum > 100) {
			return true;
		} else return false;
	}
	
	public static double average(double[] numbers) {
		double total = 0;
		for (double number : numbers) {
			total += number;
		}
		double average = total / numbers.length;
		return average;
	}
	
	public static Boolean greaterAverage(double[] arr1, double[] arr2) {
		double average1 = average(arr1);
		double average2 = average(arr2);
		if (average1 > average2) {
			return true;
		} else return false;
	}

	public static Boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.5) {
			return true;
		} else return false;
	}
	
	public static Boolean containsString(String words) {
		// this method checks to see if a given string contains the characters "编程“
		// which is Chinese for programming
		if (words.contains("编程")) {
			return true;
		} else return false;
	}
}
