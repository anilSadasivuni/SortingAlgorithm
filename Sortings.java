package sorting;

public class Sortings {

	void mergeSort(int[]  arr,int low,int high){
		int mid=(low+high)/2;
		if(low<high) {
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr,low,mid,high);
		}
	}
	
	void merge(int[] arr,int low,int mid,int high) {
		int len1=mid-low+1;
		int len2=high-mid;
		int[] s1=new int[len1];
		int[] s2=new int[len2];

		for(int i=0;i<len1;i++)
			s1[i]=arr[low+i];
		for(int i=0;i<len2;i++)
			s2[i]=arr[mid+1+i];
		int i=0,j=0,k=low;
		while(i<len1 && j<len2) {
			if(s1[i]<s2[j]) {
				arr[k]=s1[i];
				i++;
				k++;
			}else {
				arr[k]=s2[j];
				j++;
				k++;
			}
		}
		while(i<len1) {
			arr[k]=s1[i];
			i++;
			k++;
		}
		while(j<len2) {
			arr[k]=s2[j];
			j++;
			k++;
		}
	}
	
	void tMQuickSort(int[] arr,int left,int right) {
		int i = left, j = right - 2;
		if(right-left>=10) {
			int pivot = medianOfThree_pivot (arr, left, right);
		for( ; ; ){
		while ( arr[++i] < pivot );
		while ( j>0 && pivot < arr[--j] );
		if ( i < j )
		swap(arr, i,j);
		else break;
		}
		tMQuickSort( arr, left, i-1);
		tMQuickSort( arr, i+1, right);
		}
		else {
			insertionSorting(arr);
		}
	}
	
	private int medianOfThree_pivot(int[] arr, int left, int right) {
		int center = (left+right) / 2;
		if ( arr[center] < arr[left] )
		swap( arr,left, center);
		if ( arr[right] < arr[left] )
		swap( arr,left, right);
		if ( arr[right] < arr[center] )
		swap( arr,center, right);
		swap(arr,center,right-1);
		return arr[right-1];
	}
	
	private  void swap(int[] arr,int i, int j) {
		arr[i]=((arr[i]+arr[j])-(arr[j]=arr[i]));
	}

	public  void insertionSorting(int[] inputArray)
	{	
		for(int i=1;i<inputArray.length;i=i+1)
		{
			int key=inputArray[i];
			int j=i-1;
			while(j>=0 && inputArray[j]>key)
			{
				inputArray[j+1]=inputArray[j];
				inputArray[j]=key;
				j=j-1;
			}
		}
	}
	
	int pivot;
	int temp;
	
	public void inplaceSorting(int[] sortArray,int start,int end)
	{		
		if(start<end)
		{
			pivot = partitionSorting(sortArray,start,end);
			inplaceSorting(sortArray,start,pivot-1);
			inplaceSorting(sortArray,pivot+1,end);	
		}
	}

	public int partitionSorting(int[] partArray,int start,int end)
	{
		pivot=start;
		start=start+1;	
		while(start<end)
		{
			if(partArray[start]>partArray[pivot])
			{
				while(start<end)
				{
					if(partArray[end]<partArray[pivot])
					{
						swap(partArray,start,end);
						end=end-1;
						break;
					}
					end=end-1;
				}
			}
			start=start+1;
		}
		if(start==end)
		{
			if(partArray[pivot]>partArray[start])
			{
				swap(partArray,start,pivot);
				pivot=start;
			}
			else
			{
				swap(partArray,start-1,pivot);
				pivot=start-1;
			}
		}
		if(start>end)
		{
			if(partArray[pivot]>partArray[end])
			{
				swap(partArray,end,pivot);
				pivot=end;
			}
			else if((end-1)!=pivot)
			{
				swap(partArray,end-1,pivot);
				pivot=end;
			}
		}
		return pivot;
	}
}
