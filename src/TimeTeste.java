import java.util.Scanner;

public class TimeTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Time h = new Time(15,10,30);
		String tempoPd, tempoU;
		
		tempoPd = h.exibirHoraPadrao();
		tempoU = h.exibirHoraUniversal();

		System.out.println(tempoU);
		System.out.println(tempoPd);
		
		
		h.setHora(13);
		h.setMim(30);
		h.setSegundo(20);
		tempoPd = h.exibirHoraPadrao();
		tempoU = h.exibirHoraUniversal();
		
		System.out.println();
		System.out.println("Hora alterada");
		System.out.println(tempoU);
		System.out.println(tempoPd);
		
		

	}

}
