package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1=new GraphicCard();
		gk1.name="Nvidia rtx 3060";
		gk1.memory=16;
		gk1.bit=256;
		gk1.hdmi=true;
		gk1.vga=false;
		GraphicCard gk2=new GraphicCard();
		gk2.name="GeForce gtx 1050 ti ";
		gk2.memory=32;
		gk2.bit=384;
		gk2.hdmi=false;
		gk2.vga=true;
		System.out.print(gk2.name);
		System.out.println(""+gk2.memory+"GByte "+gk1.bit+"bit "+(gk2.hdmi?"HDMI":"")+(gk2.vga?"VGA":""));
		//Proessor
		Processor pr1=new Processor();
		pr1.name="Core i9";
		pr1.socket="LGA1700";
		pr1.core=16;
		pr1.mb=30;
		pr1.fan=false;
		System.out.println(""+pr1.name+" "+pr1.socket+" "+pr1.core+" çekirdek"+" "+pr1.mb+"MB"+(pr1.fan?"  FAN":""));
		Processor pr2=new Processor();
		pr2.name="Amd Ryzen 5 5500";
		pr2.socket="LGA1700";
		pr2.core=16;
		pr2.mb=30;
		pr2.fan=true;
		System.out.println(""+pr2.name+" "+pr2.socket+" "+pr2.core+" çekirdek"+" "+pr2.mb+"MB"+(pr2.fan?"  FAN":""));
		
		gk1.printInfo();
		gk2.printInfo();
		gk2.printHdmi();
	}

}
