import java.util.*;

class Solution {
    public static void main(String args[]) {
		//Inicializo las variables donde W es el ancho, H es el alto y T es el texto
        Scanner in = new Scanner(System.in);
		int W = in.nextInt();
		in.nextLine();
		int H = in.nextInt();
		in.nextLine();
		String T = in.nextLine();
        
		//Inicializo los arrays donde almaceno los números de las letras, las letras en mayuscula y el texto que ingreso separado en caracteres (en mayusculas también)
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
					//No me gusta emplear el break pero fue la alternativa que se me ocurrió para poder continuar la iteración del bucle
				}
				//empleo el booleano find para saber si no existe alguna letra y en caso de que el caracter no coincida con ninguna letra ponga el interrogante
				if (!find) {
					num[i] = W * 26;
				}
			}

			//con este bucleo leo las letras teniendo en cuenta la altura y la imprimo con un print para que no me haga el salto de línea
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