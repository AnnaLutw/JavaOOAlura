package java8;

import java.util.*;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("estou testando o codigo");
		palavras.add("caelum");
		
	
		
		//palavras.sort(( s1,  s2)-> Integer.compare(s1.length(), s1.length()));
		
		//Antes
		palavras.sort(Comparator.comparing(s -> s.length()));
		//Depois
		palavras.sort(Comparator.comparing(String :: length));


		System.out.println(palavras);

		palavras.forEach((String s) -> System.out.println(s));
		
		
		
	}
}
