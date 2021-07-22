package exam_22_07_2021;

public class Ex03 {
	public static void main(String[] args) {

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
