package clase1Ejercicio2;

public class EjercicioMonoTributo {
	public static void main(String [] args) {
	
	float ingresos = 5555;
	int vehiculosMenoresA5añosDeAntigueadad= 3;
	int inmuebles = 152;

	if ( (ingresos <= 489.083) &&
	( vehiculosMenoresA5añosDeAntigueadad <= 5) &&
	(inmuebles <= 3330) ) {
	System.out.println("Pertenece a la categoria de ingresos altos");
	} else if((ingresos <= 1112459.83) &&
	(vehiculosMenoresA5añosDeAntigueadad <= 45) &&
	(inmuebles <= 5000) ) {
	System.out.println("NO pertenece a la categoria de ingresos altos");
	}
}}