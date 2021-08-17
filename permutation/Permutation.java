package day16.permutation;

public class Permutation {

	public static void main(String[] args) {
		Iteration itr = new Iteration();
		Recurssion recr = new Recurssion();
		String str = "ABC";
		int n = str.length();
        
		System.out.println("Iteration elements");
		itr.permute(str, 0, n - 1);
		System.out.println("recurssion elements");
		recr.printPermutn(str, "");

	}

}
