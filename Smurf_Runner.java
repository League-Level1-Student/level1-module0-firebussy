
public class Smurf_Runner {
public static void main(String[] args) {
	Smurf Handy= new Smurf("Handy");
	Handy.eat();
	System.out.println(Handy.getName());
	Smurf Papa= new Smurf("Papa");
	System.out.println(Papa.getHatColor());
	System.out.println(Papa.isGirlOrBoy());
	System.out.println(Papa.getName());
	Smurf Smurfette= new Smurf("Smurfette");
	System.out.println(Smurfette.isGirlOrBoy());
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.getName());
}
}
