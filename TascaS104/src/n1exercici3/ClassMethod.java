package n1exercici3;

import java.util.ArrayList;

public class ClassMethod {

	public void metodeAmbError () throws ArrayIndexOutOfBoundsException{
		ArrayList<Integer> array = new ArrayList<>();
		array.add(5);
		
		for (int i = 0; i <= array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
	
}
