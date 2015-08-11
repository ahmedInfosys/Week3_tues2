import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Sorting_array {
	
	public static ArrayList<Integer> SWAP(ArrayList<Integer> my_list,int x, int y){
		my_list.set(x, my_list.get(x) + my_list.get(y));
		
		my_list.set(y, my_list.get(x) - my_list.get(y));
		my_list.set(x, my_list.get(x) - my_list.get(y));
		
		return my_list;
	}
	
	public static void main(String [] args){
		Scanner key = new Scanner(System.in);
		Random rand = new Random();

		ArrayList<Integer> my_list = new ArrayList<Integer> ();

	
		for(int i = 0; i < 10; i++){
			my_list.add(1 + rand.nextInt(100));
		}
		
		System.out.println("My arrayList before sorting");
		System.out.print("List 1 = { ");
		for(int number:my_list){
			
			System.out.print(number + " ");
		}
		
		System.out.println(" }.");
		
		//Sorting integers of my arraylist.
		for(int i = 0;i < my_list.size(); i++){
			for(int j = 0; j <= i; j++){
				if(my_list.get(j) > my_list.get(i)){
					my_list = SWAP(my_list,i,j);
				}
				
			}
		}
		
		System.out.println("My arrayList after ascending sorting order");
		
		System.out.print("List 1 = { ");
		for(int number:my_list){
			
			System.out.print(number + " ");
		}
		
		System.out.println(" }.");

		
		for(int i = 0;i < my_list.size(); i++){
			for(int j = 0; j <= i; j++){
				if(my_list.get(j) < my_list.get(i)){
					my_list = SWAP(my_list,i,j);
				}
				
			}
		}
		
		System.out.println("My arrayList after descending sorting order");
		System.out.print("List 1 = { ");
		for(int number:my_list){
			
			System.out.print(number + " ");
		}
		
		System.out.println(" }.");

	}
	
}
