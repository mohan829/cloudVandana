import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

class ElementShuffling
{
	public static void main(String[] args) 
	{
		Integer[] myArray ={1,2,3,4,5,60};
		List<Integer> myList = new ArrayList<>(Arrays.asList(myArray));
		Collections.shuffle(myList);
		System.out.println(myList);
		}
}
