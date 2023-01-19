package corejava;

import javaBrushup.CentralTraffic;

public class AustralianTraffic implements CentralTraffic , ContinentalTraffic{
	

	public static void main(String[] args) {
		
		// object is created for AustralianTraffic class but as it is interface implementaion 
		//we can change that to interface class
		CentralTraffic a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.yelloFlashWait();
		// we cannot call the local method using the interface object, 
		//hence created object specific to this class
		AustralianTraffic at = new AustralianTraffic();
		at.walkOnSymbol();
		// we can us the same class object to call the interface method as it is omplementing the interface
		at.trainSymbol();
	}

	@Override
	public void greenGo() {
		
		System.out.println("Go when green");
	}

	@Override
	public void redStop() {
		
		System.out.println("Stop when red");
	}

	@Override
	public void yelloFlashWait() {
		
		System.out.println("Wait when yellow flashes");
	}
	
	public void walkOnSymbol()
	{
		System.out.println("Walk when symbol comes");
	}

	@Override
	public void trainSymbol() {
		System.out.println("Stop on train Symbol multiple interface");
		
	}

}
