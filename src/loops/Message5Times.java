package loops;

public class Message5Times {

	public static void main(String[] args) {
		
		message5Times("Message");

	}
	
	public static int message5Times(String str) {

		int counter = 0;
		while(counter < 5) {
			System.out.println("Message");
			counter++;
		}
		return counter;
	}

}
