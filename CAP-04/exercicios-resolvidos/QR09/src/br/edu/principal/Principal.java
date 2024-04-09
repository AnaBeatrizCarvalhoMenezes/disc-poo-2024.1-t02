package br.edu.principal;

import java.util.Calendar;
import java.util.Date;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Este programa mostra a data e hora atual.");
		Calendar cal = Calendar.getInstance();
		Date d = new Date();
		int dia, mes, ano, hora, min;
		String mesAt = null;
		cal.setTime(d);
		dia = cal.get(Calendar.DAY_OF_MONTH);
		mes = cal.get(Calendar.MONTH);
		ano = cal.get(Calendar.YEAR);
		hora = cal.get(Calendar.HOUR_OF_DAY);
		min = cal.get(Calendar.MINUTE);
		switch(mes) {
			case 0:
				mesAt = "Janeiro";
				break;
			case 1:
				mesAt = "Fevereiro";
				break;
			case 2:
				mesAt = "Março";
				break;
			case 3:
				mesAt = "Abril";
				break;
			case 4:
				mesAt = "Maio";
				break;
			case 5:
				mesAt = "Junho";
				break;
			case 6:
				mesAt = "Julho";
				break;
			case 7:
				mesAt = "Agosto";
				break;
			case 8:
				mesAt = "Setembro";
				break;
			case 9:
				mesAt = "Outubro";
				break;
			case 10:
				mesAt = "Novembro";
				break;
			case 11:
				mesAt = "Dezembro";
				break;
			default:
				System.out.println("Ocorreu um erro.");
		}
		System.out.println("A data é: " + dia + "/" + mes + "/" + ano + ", " + mesAt);
		System.out.println("O horário é: " + hora + ":" + min);
		System.out.println("Fim do programa.");
	}

}
