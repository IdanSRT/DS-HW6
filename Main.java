import java.text.DecimalFormat;
import java.util.Random;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

public class Main { 
	
	public static void main(String ars[]){
		
//		double[] randomArray = RandomArrayFactory.getRandomArray(10);
//		for (int i = 0; i < randomArray.length; i++) {
//			System.out.println(randomArray[i]);
//		}
////				
//		double r1 = 0.00000000001;
//		double r2 = 0.00003000015;
//		double r3 = 0.00000000009;
//		DecimalFormat df = new DecimalFormat("#.0000000000");
//		r1 = Double.parseDouble(df.format(r1));
//		r2 = Double.parseDouble(df.format(r2));
//		r3 = Double.parseDouble(df.format(r3));
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
		
//		double[] doubleArray = {0, 1, 4, 9, 7, 3, 3, 5, 2, 6, 8, 8, 9, 9};
//		QuickSort qs = new QuickSort();
//		qs.sort(doubleArray);
//		System.out.println();
//		for (int i = 0; i < doubleArray.length; i++) {
//			System.out.print(doubleArray[i] + ",");
//		}
		
		double[] randomArray = RandomArrayFactory.getRandomArray(10);
		double[] doubleArray = randomArray;
		QuickSort qs = new QuickSort();
		qs.sort(doubleArray);
		System.out.println();
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.print(doubleArray[i] + ",");
		}
		
		
	}

}
