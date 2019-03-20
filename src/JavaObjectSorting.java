		//Arrays - Arrays.Sort(Int_arr)
		//Arrays - Arrays.Sort(Str_arr)
		//List - collections.sort(Str_list)

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaObjectSorting {

	public static void main(String[] args) {
		int[] int_arr = { 5, 9, 1, 10 };

		Arrays.sort(int_arr);

		System.out.println(Arrays.toString(int_arr));

		String [] str_arr= {"A","Z","B","E","C"};
		Arrays.sort(str_arr);
		System.out.println(Arrays.toString(str_arr));

		ArrayList<String> str_list = new ArrayList <String> ();
		
		
		str_list.add("A");
		str_list.add("Z");
		str_list.add("C");
		str_list.add("B");
		
		Collections.sort(str_list);
		for (String s:str_list)
			System.out.println(s);
		

	}

}
