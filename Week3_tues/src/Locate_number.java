import java.util.ArrayList;
import java.util.Scanner;


public class Locate_number {
	public static void main(String [] args){
		Scanner key = new Scanner(System.in);
		int number1, index, time_appeared = 0;
		ArrayList<Integer> my_list = new ArrayList<Integer> ();
		
		my_list.add(1);
		my_list.add(10);
		my_list.add(5);
		my_list.add(11);
		my_list.add(6);
		my_list.add(10);
		my_list.add(10);
		my_list.add(15);
		my_list.add(33);
		
		my_list.add(0, 2);
		System.out.println("Enter the number that you are looking for: ");
		number1 = key.nextInt();
		for(int i = 0;i < my_list.size() ; i++){
			if(number1 == my_list.get(i)){
				System.out.println("The number " + number1 + " is in slot " + i);
				time_appeared ++;
			}
		}
		if(time_appeared == 0){
			System.out.println(number1 + " is not in my ArrayList.");
		}
		
	}
}
