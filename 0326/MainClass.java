import java.util.Arrays;
public class MainClass{
	public static void main(String args[]) throws Exception{
		int array[] = {2,5,-1,-2,6,9,-4};
		Arrays.sort(array);
		printArray("排序结果：",array);
		int index = Arrays.binarySearch(array,2);
		System.out.println("元素2:" + index + "位置");
	}

	private static void printArray(String message,int array[])
	{
		System.out.println(message + "");
		for(int i = 0; i< array.length; ++i){
			if(i != 0){
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
