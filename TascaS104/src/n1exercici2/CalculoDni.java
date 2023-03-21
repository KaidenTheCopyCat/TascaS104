package n1exercici2;

public class CalculoDni {

	public char calculLletraDni (int numDNI) {
		
		int residu;
		String letrasCorrectas ="TRWAGMYFPDXBNJZSQVHLCKE";
		residu=numDNI%23;
	
		return letrasCorrectas.charAt(residu);
	}
	
}
