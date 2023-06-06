import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		int W = in.nextInt();
		in.nextLine();
		int H = in.nextInt();
		in.nextLine();
		String T = in.nextLine();
        
		int[] num = new int[T.length()];
		char[] upper = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		char[] list = T.toUpperCase().toCharArray();

		if (W > 0 && W < 30 && H > 0 && H < 30) {
			for (int i = 0; i < T.length(); i++) {
				boolean find = false;
				for (int j = 0; j < 26; j++) {
					if (list[i] ==  upper[j]) {
						num[i] = W * j;
						find = true;
						break;
					}
				}
				if (!find) {
					num[i] = W * 26;
				}
			}

			for (int i = 0; i < H; i++) {
				String ROW = in.nextLine();
				for (int j = 0; j < T.length(); j++) {
					System.out.print(ROW.substring(num[j], num[j] + W));
				}
				System.out.println();
			}
		}
        in.close();
    }
}