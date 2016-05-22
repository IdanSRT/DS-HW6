import javax.swing.text.AbstractDocument.LeafElement;

public class QuickSort implements Sorter {
	
	private double[] Array;
	private int length; 
	
	public void sort(double[] doubleArray){
		boolean goodInput = (doubleArray != null || doubleArray.length != 0);
		if (goodInput){
			this.Array = doubleArray;
			this.length = doubleArray.length;
			quickSort(0, length -1);
		}
	}
	
	private void quickSort(int leftIndex, int rightIndex){
		if (leftIndex + 2 < rightIndex){
			int pivotIndex = partition(leftIndex, rightIndex);
			quickSort(leftIndex, pivotIndex - 1);
			quickSort(pivotIndex + 1, rightIndex);
		}
		else{
			int midIndex = (leftIndex +  rightIndex)/2;
			double min = Math.min(Array[leftIndex],  Math.min(Array[midIndex],  Array[rightIndex]));
			double max = Math.max(Array[leftIndex],  Math.max(Array[midIndex],  Array[rightIndex]));
			double mid = median(Array[leftIndex], Array[midIndex], Array[rightIndex]);
			Array[midIndex] = mid;
			Array[leftIndex] = min;
			Array[rightIndex] = max;
			
		}
	}
	
	private int partition(int leftIndex, int rightIndex){
		this.chooseMedianOfThree(leftIndex, rightIndex);
		double pivotVal = this.Array[rightIndex - 1];
		int i= leftIndex;
		int j = rightIndex - 2;
		
		while (i < j){
			while (this.Array[j] > pivotVal){
				j--;
			}
			while (this.Array[i] < pivotVal){
				i++;
			} 
			
			 if (i < j){
				 switchValInIndexes(this.Array, i , j);
			 }
			 else {
			 switchValInIndexes(this.Array, rightIndex - 1,  j+1);
			 return j + 1;
			 }
		}
		
		return -1;
	}
	
	public static void switchValInIndexes(double[] Array, int i, int j){
		double temp = Array[i];
		Array[i] = Array[j];
		Array[j] = temp;
	}
	private void chooseMedianOfThree(int leftIndex, int rightIndex){
		int midIndex = Math.round((leftIndex + rightIndex)/2);
		double leftVal = Array[leftIndex];
		double rightVal = Array[rightIndex];
		double midVal = Array[midIndex];	
		
		Array[leftIndex] = Math.min(leftVal, Math.min(rightVal,  midVal));
		Array[rightIndex] = Math.max(leftVal, Math.max(rightVal, midVal));
		Array[midIndex] = Array[rightIndex - 1];
		Array[rightIndex - 1] = median(leftVal, midVal, rightVal);
		
	}
	
	public static double median(double a, double b, double c){
		double minVal = Math.min(a, Math.min(b, c));
		double maxVal = Math.max(a, Math.max(b, c));
		double median  = a + b + c - minVal - maxVal;
		
		return median;
		}
}
