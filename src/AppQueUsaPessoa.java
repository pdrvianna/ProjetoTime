import java.util.Scanner;

public class AppQueUsaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		

		String tnome, temail, tsalario;
		tnome = entrada.nextLine();
		temail = entrada.nextLine();
		tsalario = entrada.nextLine();
		
		Pessoa p = new Pessoa(tnome, temail, Float.parseFloat(tsalario));
		
		System.out.println(p.getNome());
		System.out.println(p.getEmail());
		System.out.println(p.getSalario());
		
		p.setEmail("pedro@globo.com");
		System.out.println(p.getNome());
		System.out.println(p.getEmail());
		System.out.println(p.getSalario());
		
		entrada.close();
		
	}

}
