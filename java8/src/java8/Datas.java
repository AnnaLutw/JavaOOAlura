package java8;

import  java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		
		LocalDate hoje = LocalDate.now();		
		System.out.println(hoje);
		
		LocalDate copaDoMundo = LocalDate.of(2022, Month.NOVEMBER, 20);
		
		int anos = copaDoMundo.getDayOfYear() - hoje.getDayOfYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje,  copaDoMundo);
		System.out.println(periodo.getDays()+ " dias para a copa");
		
		copaDoMundo.plusMonths(4);
		System.out.println(copaDoMundo);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatador));
		
		
	}

}
