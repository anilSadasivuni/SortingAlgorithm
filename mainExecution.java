package sorting;
import java.util.Scanner;

class mainExecution {
	
	// Sortings instance for calling all the sort functions
	static Sortings sorts = new Sortings();
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input Size 
		Scanner inputSize=new Scanner(System.in);
		System.out.println("Enter input size");
		int size=inputSize.nextInt();
		inputSize.close();
		// randomArray consists of random data, sortedArray consists of sorted data and 
		// sortedRevArray consists of reverse sorted data
		int[] randomArray=new int[size];
		int[] sortedArray=new int[size];
		int[] sortedRevArray=new int[size];
		int[] copyArray = new int[size];
		
		randomArray=sendInputRandomArray(size);	
		sortedArray=sendInputSortedArray(size);
		sortedRevArray=sendInputRevSortArray(size);

		System.out.println("Before: unsorted Array Insertion");
		printArray(randomArray);
		copyArrayElements(randomArray,copyArray);
		// before time
		double t1 = System.currentTimeMillis();
		//Insertion sorting call on random data
		sorts.insertionSorting(copyArray);
		//after time
		double t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Insertion");
		printArray(copyArray);
		System.out.println("Time taken for execution for insertion Random data: "+(t2-t1)+"millisecs");
				
		System.out.println("Before: unsorted Array Merge");
		printArray(randomArray);
		copyArrayElements(randomArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// Merge sort on random data
		sorts.mergeSort(copyArray,0,size-1);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Merge");
		printArray(copyArray);
		System.out.println("Time taken for execution for merge Random data: "+(t2-t1)+"millisecs");

		System.out.println("Before: unsorted Array Inplace");
		printArray(randomArray);
		copyArrayElements(randomArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		//Inplace sorting call on random data 
		sorts.inplaceSorting(copyArray,0,size-1);
		//after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Inplace");
		printArray(copyArray);
		System.out.println("Time taken for execution for inplace Random data: "+(t2-t1)+"millisecs");
		
		System.out.println("Before: unsorted Array 3median");
		printArray(randomArray);
		copyArrayElements(randomArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// 3 median sorting call on random data
		sorts.tMQuickSort(copyArray,0,size-1);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array 3median");
		printArray(copyArray);
		System.out.println("Time taken for execution for 3median Random data: "+(t2-t1)+"millisecs");

		System.out.println("Before: unsorted Array Insertion for Sorted List");
		printArray(sortedArray);
		copyArrayElements(sortedArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// insertion sort on sorted data
		sorts.insertionSorting(copyArray);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Insertion for Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for insertion sorted data: "+(t2-t1)+"millisecs");
		
		System.out.println("Before: unsorted Array Merge for Sorted List");
		printArray(sortedArray);
		copyArrayElements(sortedArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// merge sort on sorted data
		sorts.mergeSort(copyArray,0,size-1);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Merge for Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for merge sorted data: "+(t2-t1)+"millisecs");
	
		System.out.println("Before: unsorted Array Inplace for Sorted List");
		printArray(sortedArray);
		copyArrayElements(sortedArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// inplace sorting on sorted data
		sorts.inplaceSorting(copyArray,0,size-1);
		//after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Inplace for Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for inplace sorted data: "+(t2-t1)+"millisecs");		
		
		System.out.println("Before: unsorted Array 3median for Sorted List");
		printArray(sortedArray);
		copyArrayElements(randomArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// 3 median sorting on sorted data
		sorts.tMQuickSort(copyArray,0,size-1);
		//after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array 3median for Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for 3median sorted data: "+(t2-t1)+"millisecs");

		System.out.println("Before: unsorted Array Insertion for Reverse Sorted List");
		printArray(sortedRevArray);
		copyArrayElements(sortedRevArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// insertion sort on reverse sorted data
		sorts.insertionSorting(copyArray);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Insertion for Reverse Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for insertion rev sorted data: "+(t2-t1)+"millisecs");
		
		System.out.println("Before: unsorted Array Merge for Reverse Sorted List");
		printArray(sortedRevArray);
		copyArrayElements(sortedRevArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// merge sort on reverse sorted data
		sorts.mergeSort(copyArray,0,size-1);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Merge for Reverse Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for merge rev sorted data: "+(t2-t1)+"millisecs");

		System.out.println("Before: unsorted Array Inplace for Reverse Sorted List");
		printArray(sortedRevArray);
		copyArrayElements(sortedArray,copyArray);
		// before time
		t1 = System.currentTimeMillis();
		// inplace sorting on reverse sorted data
		sorts.inplaceSorting(copyArray,0,size-1);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array Inplace for Reverse Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for inplace rev sorted data: "+(t2-t1)+"millisecs");
				
		System.out.println("Before: unsorted Array 3median for Reverse Sorted List");
		printArray(sortedRevArray);
		copyArrayElements(sortedRevArray,copyArray);
		// before data
		t1 = System.currentTimeMillis();
		// 3 median sorting on reverse sorted data
		sorts.tMQuickSort(copyArray,0,size-1);
		// after time
		t2 = System.currentTimeMillis();
		System.out.println("After: sorted Array 3median for Reverse Sorted List");
		printArray(copyArray);
		System.out.println("Time taken for execution for 3median rev sorted data: "+(t2-t1)+" millisecs");
		
	}
	public static int[] sendInputRandomArray(int size)
	{
		int[] inputArray=new int[size];
		int range=1000000;
		for(int count=0;count<size;count++)
		{
			inputArray[count]=(int)(Math.random()*range);
		}
		return inputArray;
	}
	public static int[] sendInputSortedArray(int size)
	{
		int[] inputArray=new int[size];
		for(int count=0;count<size;count++)
		{
			inputArray[count]=count;
		}
		return inputArray;
	}
	public static int[] sendInputRevSortArray(int size)
	{
		int[] inputArray=new int[size];
		for(int count=0;count<size;count++)
		{
			inputArray[count]=size-count;
		}
		return inputArray;
	}
	public static void copyArrayElements(int[] array1,int[] array2)
	{
		for(int count=0;count<array1.length;count++)
		{
			array2[count]=array1[count];
		}	
	}
	public static void printArray(int[] array)
	{
		System.out.println("The Array");
		for(int i=0;i<array.length;i=i+1)
		{
			System.out.println(array[i]);
		}
	}
}
