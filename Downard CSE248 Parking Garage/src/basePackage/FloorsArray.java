package basePackage;

import carsPackage.Car;
import guiApplication.GUIFloor;
import guiApplication.ToolTipStackPane;

public class FloorsArray {

	private Floor[] aR;
	
	//--------------------------------------------------------		
	
	public FloorsArray(String[] types, int spaces, ParkingGarage lot) {
		aR = new Floor[types.length];
		for (int i = 0; i < types.length; i++) {
			if (types[i].equals("NormalFloor")) {
				aR[i] = new NormalFloor(spaces/types.length, i);
			}else if (types[i].equals("GroundFloor")) {
				aR[i] = new GroundFloor(spaces/types.length, i, lot);
			}
		}
	}

	//--------------------------------------------------------	
	public String parkCar(Car myCar, GUIFloor floor, int spot, ToolTipStackPane pane) {
		return aR[floor.getFloorNum()].parkCar(myCar, floor, spot, pane);
	}
	
	
	public String parkValet(Car myCar) {
		for (int i = 0; i < aR.length; i++) {
			if (aR[i].isFull() != true) {
				return aR[i].parkValet(myCar);
			}
		}
		return "Cannot park car, no spots available. You don't get refund.";
	}
	
	//--------------------------------------------------------		
	
	public Floor[] getAr() {
		return aR;
	}
	
	public Car search(String arg) {
		return null;
	}
	
	@Override
	public String toString() {
		return "FloorsArray has " + aR.length + " floors.";
	}
	
	public void printFloors() {
		for (int i = 0; i < aR.length; i++) {
			System.out.println("	Floor " + (i + 1) + "" +aR[i]);
		}		
	}
}
