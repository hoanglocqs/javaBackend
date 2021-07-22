package exam_22_07_2021;

import java.sql.Array;
import java.util.Arrays;

public class Ex01_getUniqueNumbers {
	private static int[] results;
	public static void main(String[] args) {
		int [] a= {1,1,2,2,3,4,5,1};
		int[] result=getUniqueNumbers(a);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
			
		}
	}
	public static int[] getUniqueNumbers(int[] a) {
		int[] results=new int[a.length];
		
		int tmp=0;
		for(int i=0;i<a.length;i++) {
			
			if(check(a,i,a[i])==true) {
				results[tmp++]=a[i];
			}
		}
		
		return Arrays.copyOfRange(results, 0, tmp);
	}
	public static boolean check(int[] a,int vitricuaso,int giatricuaso) {
		for(int i=0;i<a.length;i++) {
			if( vitricuaso != i && giatricuaso == a[i] ) {
				return false;
			}
		}
		
		return true;
	}
	
}
