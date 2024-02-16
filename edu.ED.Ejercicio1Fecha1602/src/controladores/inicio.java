package controladores;

import java.time.LocalDateTime;

public class inicio {

	public static void main(String[] args) {
		
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println(ahora);
		
		System.out.println("Dia: " + ahora.getDayOfMonth());
		System.out.println("mes: " + ahora.getMonth());
		System.out.println("año: " + ahora.getYear());
		System.out.println("hora: " + ahora.getHour());
		System.out.println("minutos: " + ahora.getMinute());
		System.out.println("segundos: " + ahora.getSecond());
		System.out.println("Dia de la semana: " + ahora.getDayOfWeek());
		System.out.println("Dia del año: " + ahora.getDayOfYear());
		
	}
	

}
