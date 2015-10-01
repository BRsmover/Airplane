/**
 * 
 * @author benjaminjenni
 *
 */
public class Test_Airplane {

	public static void main(String[] args) {
		// Neues Flugzeug ohne Parameter
		Airplane Plane_1 = new Airplane();
		System.out.println("Model: " + Plane_1.getModel());
		System.out.println("Maximum Speed: " + Plane_1.getMaxSpeed() + "km/h");
		System.out.println("Position: " + Plane_1.getPosition() + "km");

		Plane_1.flyForward(5);
		System.out.println("New Position: " + Plane_1.getPosition() + "km\n");

		// Neues Flugzeug mit Parametern
		Airplane Plane_2 = new Airplane("Eurofighter", 800);
		System.out.println("Model: " + Plane_2.getModel());
		System.out.println("Maximum Speed: " + Plane_2.getMaxSpeed() + "km/h");
		System.out.println("Position: " + Plane_2.getPosition());

		Plane_2.flyForward(8);
		System.out.println("New Position: " + Plane_2.getPosition() + "km");
	}
}
