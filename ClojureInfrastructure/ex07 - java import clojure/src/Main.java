public class Main {
	public static void main(String args[]) {
		
		// ExternalOne has to be instantiated:
		clj.ExternalOne ex1 = new clj.ExternalOne();
		System.out.println(ex1.f(5));
		
		// ExternalTwo is static:
		System.out.println(clj.ExternalTwo.f(5));
	}
}