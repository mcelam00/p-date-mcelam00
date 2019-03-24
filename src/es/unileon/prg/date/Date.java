package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;
	
	/*

	Constructor de la clase:
		Asigna los parametros que recibe a los atributos de la clase Date, pero no se admiten fechas tales como 99/15/xxxx, entonces hay que plantear unas condiciones que no permitan que esas fechas funcionen y se lance una extepción.

	*/

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia
		
		if (day < 1 || day > 31) {
			throw new DateException("Día " + day + " no valido" +
					" Valores posibles entre 1 y 31.");
		} else {
			this.day = day;
		}
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}


//MÉTODOS TRANSPARENCIA 1:

	/*

	Recibe otra fecha que se le pasa como parámetro y compara su año con el de los atributos de la clase, es decir con el de mi fecha. Si son iguales devuelve true, si no, false.

	*/

	public boolean isSameYearIF(Date fecha2){
	
		boolean esMismoAnio;
			
		if(this.year == fecha2.year){
			esMismoAnio = true;
		}
		else
		{
			esMismoAnio = false;
		}
		return esMismoAnio;
	}

	/*

	Recibe otra fecha que se le pasa como parámetro y compara su mes con el de los atributos de la clase, es decir con el de mi fecha. Si son iguales devuelve true, si no, false.

	*/

	public boolean isSameMonthIF(Date fecha2){ 

		boolean esMismoMes;

		if(this.month == fecha2.month){
			esMismoMes = true;
		}
		else
		{
			esMismoMes = false;
		}
		return esMismoMes;
	}

	/*

	Recibe otra fecha que se le pasa como parámetro y compara su día con el de los atributos de la clase, es decir con el de mi fecha. Si son iguales devuelve true, si no, false.

	*/

	public boolean isSameDayIF(Date fecha2){

		boolean esMismoDia;

		if(this.day == fecha2.year){
			esMismoDia = true;
		}
		else
		{
			esMismoDia = false;
		}
		return esMismoDia;
	}

	/*

	Recibe otra fecha que se le pasa como parámetro y la compara (entera) con mi fecha. Si son iguales devuelve true, si no, false.

	*/

	public boolean isSameIF(Date fecha2){

		boolean esMismaFecha;
		//miro a ver si metendo la fecha 2 en mi metodo que comprueba si es o no igual, sale true 
		if(isSameDayIF(fecha2) == true && isSameMonthIF(fecha2) == true && this.year==fecha2.year){
			esMismaFecha = true;
		}
		else
		{
			esMismaFecha = false;
		}
		return esMismaFecha;
	}

	/*

	Recibe otra fecha que se le pasa como parámetro y compara su año con el de los atributos de la clase, es decir con el de mi fecha. Sin usar if, directamente devolverá un true si se cumple lo que está en el return y si no, un false, porque en la firma del método ya hemos dicho que devolverá un boolean.

	*/

	public boolean isSameYear(Date fecha2){
	
		return this.year == fecha2.year; 

	}

	/*

	Recibe otra fecha que se le pasa como parámetro y compara su mes con el de los atributos de la clase, es decir con el de mi fecha. Sin usar if, directamente devolverá un true si se cumple lo que está en el return y si no, un false, porque en la firma del método ya hemos dicho que devolverá un boolean.

	*/

	public boolean isSameMonth(Date fecha2){

		return this.month == fecha2.month;

	}

	/*

	Recibe otra fecha que se le pasa como parámetro y compara su día con el de los atributos de la clase, es decir con el de mi fecha. Sin usar if, directamente devolverá un true si se cumple lo que está en el return y si no, un false, porque en la firma del método ya hemos dicho que devolverá un boolean.

	*/

	public boolean isSameDay(Date fecha2){

		return this.day == fecha2.day;

	}
	
	/*

	Recibe otra fecha que se le pasa como parámetro y compara su fecha completa con mi fecha. Sin usar if, directamente devolverá un true si se cumple lo que está en el return y si no, un false, porque en la firma del método ya hemos dicho que devolverá un boolean.
	*/

	public boolean isSame(Date fecha2){

		return this.isSameYear(fecha2) && this.isSameMonth(fecha2) && this.isSameDay(fecha2); 
		//porque llamo a los metodos con la fecha de hoy, ese this es como si pusiera today.metodo

	}









































}
