import java.text.DecimalFormat;

public class RandomArrayFactory {

	public static double[] getRandomArray(int size){
		double[] randomArray = new double[size];
		
		for (int i = 0; i < randomArray.length; i++) {
			double newRandom = Math.random();
			DecimalFormat df = new DecimalFormat("#.0000000000");
			
			newRandom = Double.parseDouble(df.format(newRandom));
			randomArray[i] = newRandom;
		}
		
		return randomArray;
	}
}
 