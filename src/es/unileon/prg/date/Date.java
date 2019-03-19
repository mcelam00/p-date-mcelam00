package es.unileon.prg.date;

public class Date {

	private int _day;
	private int _month;
	private int _year;

	public Date(int day, int month, int year) throws DateException{
		this._year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this._month = month;
		}
		//TODO falta comprobar el dia
/*
		if((day > 0) && (day < getDaysOfMonth())){
		this._day = day;
		}
		else
		{
			throw new DateException("Dia " + month + " no valido" +
					" para el mes "+getMonthDay+" Valores posibles entre 1 y "+getDaysOfMonth());
		}
*/
}

/*	
	//public String getMonthDay()
	{


		//switch con el nombre de los meses



	}









	//public int getDaysOfMonth(int month)
	{
		int numero = 0;
		switch(numero)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			
		


		}	








	}
*/
	@Override
	public String toString() {
		return this._day + "/" + this._month + "/" + this._year;
	}

}

