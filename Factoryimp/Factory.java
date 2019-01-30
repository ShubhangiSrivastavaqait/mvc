package mvc;


import mvc.Factorydesign;
import mvc.PC;
import mvc.Server;

public class Factory {

	public static Factorydesign getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
		
		return null;
	}
}