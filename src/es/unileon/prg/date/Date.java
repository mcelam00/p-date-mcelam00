package es.unileon.prg.date;

/**
 * Clase Fecha.
 * 
 *
 * @author Mario Celada Matías
 * @version 1.0
 */

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




//MÉTODOS DE LA TRANSPARENCIA 2:

	/*

	El método devuelve el nombre del mes de mi fecha.
	Mediante un switch mira el numero de mes que tiene mi fecha (this.month) y según el caso que sea me devuelve el nombre del mes almacenado en un string.

	*/

	public String nombreMes(){

		String mes;

		switch(this.month){
			case 1:
				mes = "Enero";
				break;
			case 2:
				mes = "Febrero";
				break;
			case 3:
				mes = "Marzo";
				break;
			case 4:
				mes = "Abril";
				break;
			case 5:
				mes = "Mayo";
				break;
			case 6:
				mes = "Junio";
				break;
			case 7:
				mes = "Julio";
				break;
			case 8:
				mes = "Agosto";
				break;
			case 9:
				mes = "Septiembre";
				break;
			case 10:
				mes = "Octubre";
				break;
			case 11:
				mes = "Noviembre";
				break;
			case 12:
				mes = "Diciembre";
				break;
			default:
				mes = "No existe";
		}
		return mes;
	}

	/*

		Método Auxiliar para usarlo en otros que me da el ultimo día del mes introducido:

	Le paso como parámetro un mes genérico porque si no le pongo nada solo podría obtener el ultimo dia del mes de mi fecha, pero siendo así ese "int mes" generico tomará un valor u otro según que fecha lo llame. 

	"Treinta días trae noviembre, con abril, junio y septiembre. Los demás treinta y uno, menos febrero mocho que trae veintiocho"

	*/

	public int ultimoDiaMes(int mes){

		int ultimoDia;

		switch(mes){
			case 1: //next
			case 3:	//next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12: 
				ultimoDia = 31;
				break;
			case 2:  
				ultimoDia = 28;
				break;
			default:
				ultimoDia = 30;


		}
		return ultimoDia;
	}

	/*

	El método mira si el dia del mes de mi fecha es correcto. (por ejemplo, que el 30 de febrero no valga) Como el del constructor pero especificamente para cada mes.
Lo creo con if else, si no, bastaría con poner la condición "this.day <= this.ultimoDiaMes(this.month) && this.day >= 1" detrás del return como hago en los metodos de la transparencia 1 sin if.

	*/

	public boolean esCorrectoDiaMes(){
	
		boolean esCorrecto; 

		if((this.day <= this.ultimoDiaMes(this.month)) && (this.day >= 1)){
			esCorrecto = true;
		}
		else
		{
			esCorrecto = false;
		}
		
		return esCorrecto;		

	}

	/*

	El método mira el mes en el que estamos y devuelve la estación correspondiente.
	No se tienen en cuenta las particiones a mitad de mes, es decir, si la primavera comienza el 21 de Marzo, se toma todo marzo como invierno. 
	

	Primavera: Comienza alrededor del 21 de marzo en el hemisferio norte.
	Verano: Comienza alrededor del 21 de junio en el hemisferio norte.
	Otoño: Comienza alrededor del 23 de septiembre en el hemisferio norte.
	Invierno: Comienza alrededor del 21 de diciembre en el hemisferio norte.

	*/

	public String estacion(){

		String nombreEstacion;

		switch(this.month){	
			case 4: //next
			case 5: //next
			case 6:
				nombreEstacion = "Primavera";
				break;
			case 7:	//next
			case 8:	//next
			case 9:
				nombreEstacion = "Verano";
				break;
			case 10: //next
			case 11: //next
			case 12:
				nombreEstacion = "Otoño";
				break;
			case 1:	//next
			case 2:	//next
			case 3:
				nombreEstacion = "Invierno";
				break;
			default:
				nombreEstacion = "No Existe";


		}
		return nombreEstacion;
	}









































}
