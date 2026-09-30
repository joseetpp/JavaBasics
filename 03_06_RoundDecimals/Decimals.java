public class Decimals {

	public static void main(String[] args) {
		double x = 12.3456789;

		long rounded0 = Math.round(x);

		double rounded2 = Math.round(x * Math.pow(10, 2)) / Math.pow(10, 2);
		double rounded4 = Math.round(x * Math.pow(10, 4)) / Math.pow(10, 4);
		double rounded6 = Math.round(x * Math.pow(10, 6)) / Math.pow(10, 6);

		System.out.println("Rounded to 0 decimals: " + rounded0);
		System.out.println("Rounded to 2 decimals: " + rounded2);
		System.out.println("Rounded to 4 decimals: " + rounded4);
		System.out.println("Rounded to 6 decimals: " + rounded6);
	}
}