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











































}
