package exam_22_07_2021;

public class Ex02 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 3, 7, 6 };// 1 2 3 4 5 6 7
		System.out.println(getMissingNumber(a, 7));
	}

	public static int getMissingNumber(int[] a, int n) { // 1 2 3 4 6, 1 2 3 4 5 6
		int number = 0;
		sapxep(a);
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					break;
				} else {
					count++;
				}
			}
			if (count == a.length) {
				number=i;
				break;
			}else {
				count=0;
			}
		}
		return number;
	}

	public static int[] sapxep(int[] a) {
		int tmp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}

			}
		}
		return a;
	}
}
