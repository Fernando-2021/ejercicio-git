import java.util.Scanner;

public class Calculadora {
	
		float resultado;
		
		public Calculadora() 
		{
			
		}
		public float suma(float operando1, float operando2)
		{
			resultado = operando1 + operando2;
			return resultado;
		}

		public float resta(float operando1, float operando2)
		{
			resultado = operando1 - operando2;
			return resultado;
		}
		
	
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese el primer numero");
		float operando1=sc.nextFloat();
		System.out.println("ingrese el segundo numero");
		float operando2=sc.nextFloat();
		
		Calculadora cal = new Calculadora();
		System.out.println("Método suma: "+cal.suma(operando1, operando2));
		System.out.println("Método resta: "+cal.resta(operando1, operando2));

	}
}