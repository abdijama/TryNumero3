import java.util.Scanner;;
public class Time_Converter {
	public static void main(String[] args) {
		System.out.println("Enter sum seconds");
		Scanner userInput = new Scanner(System.in);
		int min;
		int inp;
		int hrs;
		int sec;
		
		inp = userInput.nextInt();
		hrs = inp / 3600;
		min = inp / 60;	
		min = min % 60;
		sec = inp % 60;
		
		System.out.println(hrs + " Hours " + min + " Minutes " + sec + " Seconds");
	}
		
}
