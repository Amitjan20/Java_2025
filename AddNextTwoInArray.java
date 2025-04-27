
public class tt {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// op = 1,5,15,15

		int[] result = new int[arr.length];
		int i = 0;
		int j = 0;
		int k = 0;
		int count = 0;

		while (i < arr.length) {
			int sum = 0;
			if (i == 0) {
				result[j] = arr[0];
				i++;
				j++;
				count += 1;
			} else {
				if (i + count > arr.length) {
					int diff = (i + count) - arr.length;
					for (k = 0; k <= diff; k++) {
						sum += arr[i];
						i++;
					}
					result[j] = sum;
					break;
				}
				for (k = i; k <= i + count; k++) {
					sum += arr[k];
				}
				result[j] = sum;
				i = i + count + 1;
				j++;
				count++;
			}
		}

		for (int z : result) {
			System.out.println(z);
		}

	}

}
