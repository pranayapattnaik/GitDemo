package corejava;

public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		System.out.println("Stop on train Symbol multiple interface");
		System.out.println("Stop on train Symbol multiple interface");
		ChildEmirites c = new ChildEmirites();
		c.bodyColor();
		c.safetyGuidelines();
		c.engine();

	}

	@Override
	public void bodyColor() {
		
		System.out.println("Green color on the aircraft");
		
	}

}
