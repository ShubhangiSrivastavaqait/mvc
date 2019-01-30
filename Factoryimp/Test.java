package mvc;



import mvc.Factory;
import mvc.Factorydesign;

public class Test {

	public static void main(String[] args) {
		Factorydesign pc = Factory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Factorydesign server = Factory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}