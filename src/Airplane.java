/**
 * 
 * @author benjaminjenni
 *
 */
public class Airplane {
	// Instanzvariablen
	private String model;
	private int maxSpeed;
	private int position;

	// Konstruktor mit Parameter
	public Airplane(String name, int maxSpeed) {
		model = name;
		this.maxSpeed = maxSpeed;
		position = 0;
	}

	// Konstruktor ohne Parameter
	public Airplane() {
		model = "default";
		maxSpeed = 100;
		position = 0;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public void flyForward(int iSpeed) {
		position = position + (iSpeed * maxSpeed);
	}
}
