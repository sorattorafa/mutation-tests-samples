package rafael;

/**
 * Hello world!
 *
 */
public class App 
{
 	public static String triangulos(int x, int y, int z) {

		// verificando se é um triangulo
		if (x < y + z || y < x + z || z < x + y) {
			System.out.println("Trata-se de um triangulo");
		} else {
			return "Não é um triângulo";
		}

		// analisando o tipo de triangulo
		if (x == y && y == z) {
			System.out.println("Lados:" + x + "," + y + "," + z);
			return "Três lados iguais. Triangulo Equilatero\n";
		
		} else if ((x == y && x!=z) || (x == z && x!= z)) {
			System.out.println("Lados:" + x + "," + y + "," + z);
			return "Dois lados iguais. Triangulo Isosceles\n";
		
		} else if (x != y && x != z & y != z) {
			System.out.println("Lados:" + x + "," + y + "," + z);
			return "Três lados diferentes. Triângulo Escaleno\n";
		} else {
			return "Não é um triângulo";
		}
	}

	public static void main(String[] args) {
		System.out.println("Teste do Triangulo \n\n");
		String r1 = App.triangulos(2, 2, 2);
		String r2 = App.triangulos(2, 2, 3);
		String r3 = App.triangulos(2, 3, 4);
	}
}
