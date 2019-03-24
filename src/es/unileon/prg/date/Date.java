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

		//miro a ver si metiendo la fecha 2 en mi metodo que comprueba si es o no igual, sale true.

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

	"Treinta días trae noviembre, con abril, junio y septiembre. Los demás treinta y uno, menos febrero mocho que trae veintiocho".

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




//MÉTODOS DE LA TRANSPARENCIA 3:

	/*
	El método me devuelve el nombre de los meses restantes desde el intoducido (no se incluye) hasta el final del año.
	
	*/

	public String mesesRestantes(){

		Stringbuffer meses=new Stringbuffer();

		//recorrer todos los meses desde el introducido+1 porque el que introduzco no quiero que me lo anexe a la cadena.

		for(int i = this.month+1; i<=12; i++){ 

			switch(i){
				case 1:
					meses.append("Enero, ");
					break;
				case 2:
					meses.append("Febrero, ");
					break;
				case 3:
					meses.append("Marzo, ");
					break;
				case 4:
					meses.append("Abril, ");
					break;
				case 5:
					meses.append("Mayo, ");
					break;
				case 6:
					meses.append("Junio, ");
					break;
				case 7:
					meses.append("Julio, ");
					break;
				case 8:
					meses.append("Agosto, ");
					break;
				case 9:
					meses.append("Septiembre, ");
					break;
				case 10:
					meses.append("Octubre, ");
					break;
				case 11:
					meses.append("Noviembre, ");
					break;
				case 12:
					meses.append("Diciembre, ");
					break;




			}
			return meses;
		}

	/*
	
	El método imprime la fecha en formato de cadena.

	*/

	public void fechaEscrita(){

		Stringbuffer fecha=new Stringbuffer();

		fecha.append(this.day+"/");
		fecha.append(this.month+"/");
		fecha.append(this.year);

		System.out.println(fecha.toString());
	}

	/*
	
	El método genera todas las fechas desde la fecha establecida hasta la ultima fecha del mes, para ello, se vale del método auxiliar que hemos creado y que nos dice el ultimo dia del mes, y del método que convierte la fecha en cadena de texto y la muestra por pantalla.

	*/
	
	public void ultimaFechaMes(){

		int ultimoDia;

		ultimoDia = this.ultimoDiaMes(this.month);
		//recorrerá todos los dias desde el que introduzco (excluido) hasta el ultimo del mes y los imprimirá.

		for(i = this.day+1; i <=ultimoDia; i++ ){
				
			//como el dia de la fecha que imprimo es i; si llamo al metodo de fecha escrita me va a coger el dia de mi fecha en lugar de i, necesito entonces crear otra fecha.

			Date fechax = new Date(i, this.month, this.year);
			fechax.fechaEscrita();


		}

	}

	/*

	Método que retorna los meses con el mismo numero de dias que el mes de mi fecha.
	Recorre todos los meses a ver cuales tienen los mismos dias que el de mi fecha, y los imprime.
	*/

	public void mesesIguales(){
	
	//Con el for recorro todos los meses.

	for(int i = 1; i<=12; i++){

		//Pongo este if para que no me imprima mi mismo mes al recorrerlos todos. En la iteración que coincida con mi mes no ejecuta y pasa a la siguiente iteración.

		if(i!=this.month) {

			//llamo al metodo auxiliar que me dice el ultimo día del mes. Le paso de parametro mi mes, para que me diga los dias de mi mes y le paso como parametro el mes i del bucle que recorre todos los meses.

			if(ultimoDiaMes(this.month) == ultimoDiaMes(i)){
				switch(i){
					case 1:
						System.out.println("Enero");
						break;
					case 2:
						System.out.println("Febrero");
						break;
					case 3:
						System.out.println("Marzo");
						break;
					case 4:
						System.out.println("Abril");
						break;
					case 5:
						System.out.println("Mayo");
						break;
					case 6:
						System.out.println("Junio");
						break;
					case 7:
						System.out.println("Julio");
						break;
					case 8:
						System.out.println("Agosto");
						break;
					case 9:
						System.out.println("Septiembre");
						break;
					case 10:
						System.out.println("Octubre");
						break;
					case 11:
						System.out.println("Noviembre");
						break;
					case 12:
						System.out.println("Diciembre");
						break;
							
							
				}
			}	
		}

	}	
	}


	public void numeroDiasDesdeInicioAño() {
		int numeroDias=0;

		//El contador va desde el mes 1 (Enero) hasta el anterior a mi mes (que son los meses completos) y mira a ver cuantos dias tienen esos meses y los suma al contador.

		for(int i=1; i<this.month; i++) {
			numeroDias = numeroDias + ultimoDiaMes(i);
		}

		//Ahora a ese contador en el que estan sumados los dias de los meses completos tenemos que sumar los dias correspondientes al mes de nuestra fecha.

		numeroDias = numeroDias + this.day;
		System.out.println("El numero de dias desde el 1 de Enero hasta mi fecha es: "+numeroDias);
		
	}




//MÉTODOS TRANSPARENCIA 4:

	/**


	*/

	public void numeroIntentos(){
		Random rnd = new Random();
		int intentos=0;
		int mesAleatorio=0;
		int diaAleatorio=0;

		//mientras que los dias y meses creados sean distintos de los de la fecha que meto me seguira creando un mes y un dia (un intento) y contándomelo.

		while(diaAleatorio != this.day || mesAleatorio != this.month){
			mesAleatorio = rnd.nextInt(12)+1; //el +1 es porque por defecto los crearía entre 0 y 11 y los quiero crear entre 1 y 12.
			diaAleatorio = rnd.nextInt(ultimoDiaMes(mesAleatorio))+1;
			intentos++;
		}
		System.out.println("El numero de intentos necesarios serían: "+intentos);

	}


	public void numeroIntentosDW() {

//con el do while entra directamente a generar numeros aleatorios sin chequear la condicion entonces no me hace falta plantear el caso inicial de 0 para el mes y dia.

		Random rnd = new Random();
		int intentos=0;//porque ya entra a ejecutar el codigo y ya me suma 1 en la primera
		int mesAleatorio;
		int diaAleatorio;
		do {
			intentos++;
			mesAleatorio = rnd.nextInt(12)+1; 
			diaAleatorio = rnd.nextInt(ultimoDiaMes(mesAleatorio))+1;
			
		}while(diaAleatorio != this.day || mesAleatorio != this.month);
			
		System.out.println("El numero de intentos necesarios serían: "+intentos);
	}

// metodo auxiliar para el ultimo que me diga ese resto de la division modulo 7 a qué día de la semana se corresponde.

	public String NombreDelDia(int i) {

		String dia = "";
		switch(i) {
		case 1:
			dia = "lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miercoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sábado";
			break;
		case 0:

//Porque si divido y me da resto cero quiere decir que han pasado justo esas semanas pero no he empezado la siguiente semana, luego estoy en domingo.

			dia = "Domingo";
			break;
		
		}
	return dia;
	}

//lo que hace es decirme el numero de dias que hay desde el uno de enero hasta fecha actual

	public void DiaSemanaHoy(int dia1Enero) {
		int numeroDias=0;
		for(int i=1; i<this.month; i++) {
			numeroDias= numeroDias + ultimoDiaMes(i);
		}
		numeroDias = numeroDias + this.day;
		numeroDias = numeroDias + dia1Enero -1; 

//hay que poner esto porque sino estas prefijando que el año empieza en lunes 1 y puede que el año empiece en miércoles 1. Los días entre la fecha y el día 1 se ven inalterados, pero si hacemos la división modulo 7 sale en los dos casos lo mismo y no es posible. Si pintamos en un papel los dos casos y hacemos el calendario veremos que la diferencia del día final entre empezar un lunes 1 y un miércoles 1 es de 2 días. Según nuestro método anterior, el lunes es la posición 1 de la semana y el miércoles es la posición 3 pero queremos que al número de días totales le sume 2 no 3, luego de ahí el -1.

		int diaSemana = numeroDias%7;

//esos dias que hay entre medias del primer dia de la primera semana del año y mi fecha los divido entre siete para saber las semanas que han sido (los ciclos completos) y el resto que es el dia de la semana en el que estoy realmente (la posicion en el ciclo siguiente) que será el que meteré en el otro método y me dirá a qué día de la semana se corresponde.

		System.out.println("hoy es: "+NombreDia(diaSemana));
		
		
	}
}
