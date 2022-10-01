
	import java.util.Scanner;

	public class AñoBisiesto {
		int anio;
		Scanner enter = new Scanner (System.in);
		public void enteraño () {
			System.out.println("Programa para determinar año bisisesto");
			System.out.println("Ingrese el año");
			anio = enter.nextInt();
		}
		
		public void codeprocedimiento () {
			if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0 )) {
				System.out.println(anio+" " + "Es un año bisiesto");
			}else {
				System.out.println(anio+" " + "No es un año bisiesto");
			}
		}
	public static void main(String[] args) {
		AñoBisiesto fc = new AñoBisiesto();
		fc.enteraño();
		fc.codeprocedimiento();
	}
	}


