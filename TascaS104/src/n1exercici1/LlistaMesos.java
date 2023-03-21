package n1exercici1;

import java.util.ArrayList;

public class LlistaMesos {

	private ArrayList<String> llistaMesos;

	public LlistaMesos() {
		llistaMesos = new ArrayList<>();
		llistaMesos.add("gener");
		llistaMesos.add("febrer");
		llistaMesos.add("marc");
		llistaMesos.add("abril");
		llistaMesos.add("maig");
		llistaMesos.add("juny");
		llistaMesos.add("juliol");
		llistaMesos.add("agost");
		llistaMesos.add("septembre");
		llistaMesos.add("octubre");
		llistaMesos.add("novembre");
		llistaMesos.add("desembre");
		
	}

	public ArrayList<String> getLlistaMesos() {
		return llistaMesos;
	}
	
	public boolean validateAgostMes8() {
		return llistaMesos.get(7).equalsIgnoreCase("agost");
	}
	
	public boolean validateLlistaMesos() {
		return llistaMesos!=null;
	}

	@Override
	public String toString() {
		return "LlistaMesos [llistaMesos=" + llistaMesos + "]";
	}
	
		
}
