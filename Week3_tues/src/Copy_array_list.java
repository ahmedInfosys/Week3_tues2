import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Copy_array_list {
	public static void main(String [] args){
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		ArrayList<Integer> my_list1 = new ArrayList<Integer> ();
		ArrayList<Integer> my_list2 = new ArrayList<Integer> ();
		
		
		for(int i = 0; i < 10; i++){
			
			//Generating random integer values from 1 to 100 and insert them into my_list1
			my_list1.add(1 + rand.nextInt(100));
		}
		
		//adding all elements of my_list1 to my_list2
		my_list2.addAll(my_list1);
		
		System.out.print("List 1 = { ");
		for(int number:my_list1){
			
			System.out.print(number + " ");
		}
		
		System.out.println(" }.");
		
		System.out.print("List 2 = { ");
		for(int number:my_list2){
			
			System.out.print(number + " ");
		}
		System.out.println(" }.");
	}
}
