package hu.eszterhazy;

public class Main {

    public static void main(String[] args) {
	Bank bank = new DigitalBank("Something", "Someone");
	DigitalBank digitalBank = new DigitalBank("Something else", "Someone else");

	Bank bank1 = new PublicDigitalBank("Scrooge McDuck", "McDuck Inc." );
	DigitalBank something= new PublicDigitalBank("Thing", "Some person");
	PublicDigitalBank publicDigitalBank = new PublicDigitalBank("Public bank", "public person");


		System.out.println(bank1.getName());
		System.out.println(bank1.getName());
		System.out.println(something.getId());
		System.out.println(publicDigitalBank);


    }
}
