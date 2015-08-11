import java.util.ArrayList;
import java.util.Scanner;

public class Find_into_ArrayList {
	public static void main(String [] args){
		Scanner key = new Scanner(System.in);
		int number1, times_appeared = 0;
		ArrayList<Integer> my_list = new ArrayList<Integer> ();
		
		my_list.add(1);
		my_list.add(4);
		my_list.add(5);
		my_list.add(11);
		my_list.add(6);
		my_list.add(10);
		my_list.add(18);
		my_list.add(15);
		my_list.add(33);
		
		System.out.println("Enter the number that you are looking for: ");
		number1 = key.nextInt();
		for(int number:my_list){
			if(number1 == number){
				times_appeared ++;
			}
		}
		
		if(times_appeared > 0){
			System.out.println("The number " + number1 + " is found " + times_appeared +" times in my arrayList.");
		}
		else{
			System.out.println("The number " + number1 + " is not found in my arrayList.");
		}
	}
}
