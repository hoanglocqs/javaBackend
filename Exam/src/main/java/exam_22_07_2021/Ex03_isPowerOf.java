package exam_22_07_2021;

public class Ex03_isPowerOf {
	public static void main(String[] args) {
//		Bài 3 (10đ): Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không
//		 VD: (8, 2)(true), (8, 2)(true), (6, 2)(false), (20, 4)(false), (64, 4)(true)
//		Method signature: boolean isPowerOf(int a, int b)

		System.out.println(isPowerOf(8, 63));
	}
	public static boolean isPowerOf(int a, int b) {
		if (a < b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		int count = b;
		for (int i = 1; i < a; i++) {
			count = count * b;
			if (count == a) {
				return true;
			}
		}
		return false;
	}
}
