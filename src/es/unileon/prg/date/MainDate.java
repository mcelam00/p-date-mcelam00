package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today, otraFecha; //declaro la variable de tipo date, la inicializare en el try
		try {
			today = new Date(25,3,2019);// aquí las inicializo 
			otraFecha = new Date(25,3,2019);
			System.out.println("¿Tienen el mismo año?");
			System.out.println(today.isSameYearIF(otraFecha));
															
		
			System.out.println("¿Tienen el mismo mes?");
			System.out.println(today.isSameMonthIF(otraFecha));
		
			System.out.println("¿Tienen el mismo dia?");
			System.out.println(today.isSameDayIF(otraFecha));
		
			System.out.println("¿Es la misma fecha?");
			System.out.println(today.isSame(otraFecha));
			System.out.println();
			System.out.println();
			System.out.println("¿Tienen el mismo año (simplificado)?");
			System.out.println(today.isSameYear(otraFecha));
			
			System.out.println("¿Tienen el mismo mes (simplificado)?");
			System.out.println(today.isSameMonth(otraFecha));
		
			System.out.println("¿Tienen el mismo dia (simplificado)?");
			System.out.println(today.isSameDay(otraFecha));
		
			System.out.println("¿Es la misma fecha (simplificado)?");
			System.out.println(today.isSame(otraFecha));
			System.out.println();
			System.out.println();
			
			System.out.println("Nombre del mes");
			System.out.println(today.nombreMes());
			
			System.out.println("Es el dia correcto");
			System.out.println(today.esCorrectoDiaMes());
		
			System.out.println("Estación");
			System.out.println(today.estacion());
			
			System.out.println("Meses Restantes");
			System.out.println(today.mesesRestantes());

			System.out.println("Imprimir fecha");
			today.fechaEscrita();
			
			System.out.println("Fechas hasta la ultima fecha del mes.");
			today.ultimaFechaMes();

			System.out.println("Meses con el mismo número de días");
			today.mesesIguales();

			
			today.numeroDiasDesdeInicioAño();

			today.numeroIntentos();

		
			today.numeroIntentosDW();

			System.out.println("¿Qué día de la semana es hoy?");
			today.DiaSemanaHoy(2);
			
		
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}

