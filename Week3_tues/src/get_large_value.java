import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class get_large_value {
	public static void main(String [] args){
		Scanner key = new Scanner(System.in);
		Random rand = new Random();
		int max_value = 0;
		ArrayList<Integer> my_list = new ArrayList<Integer> ();

		
		
		for(int i = 0; i < 10; i++){
			max_value = 1 + rand.nextInt(100);
			my_list.add(max_value);
		}

		for(int i = 0;i < my_list.size() ; i++){
			if( my_list.get(i) > max_value) max_value = my_list.get(i);
		}
		
		System.out.print("List 1 = { ");
		for(int number:my_list){
			
			System.out.print(number + " ");
		}
		
		System.out.println(" }.");
		
		System.out.println("The largest value in my arrayList is " + max_value);
	}
}
