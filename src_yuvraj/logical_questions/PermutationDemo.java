package logical_questions;

public class PermutationDemo {

	public static void main(String[] args) {

		String s = "abcde";
		int end = s.length() - 1;
		parmute(s, 0, end);

	}

	static String swap(String s, int pos1, int pos2) {
		char[] a = s.toCharArray();
		char temp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = temp;
		return new String(a);
	}

	static void parmute(String s, int pos1, int pos2) {
		if (pos1 == pos2) {
			System.out.println(s);
			return;
		}

		for (int i = pos1; i <= pos2; i++) {
			String s1 = swap(s, pos1, i);
			parmute(s1, pos1+1, pos2);
		}
		
	}
	
}
