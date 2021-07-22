package exam_22_07_2021;

import java.util.Arrays;

public class Ex01_getUniqueNumbers {
//	Bài 1 (30đ): Cho mảng A gồm n phần tử (2 < n < 20). Ak = [0, 100]
//			Viết hàm liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong mảng. Kết quả
//			trả về được sắp xếp tăng dần.
//			 Input: 3, 15, 21, 0, 15, 17, 21
//			 Output: 0, 3, 17
//			Method signature: int[] getUniqueNumbers(....)
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
