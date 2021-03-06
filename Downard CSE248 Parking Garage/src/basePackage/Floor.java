package basePackage;

import java.io.Serializable;

import carsPackage.*;
import guiApplication.GUIFloor;
import guiApplication.ToolTipStackPane;

/**
 * @author Dylan
 *
 */
public interface Floor extends Serializable{

	/**
	 * @param myCar car to be Parked
	 * @param park Parent ParkingGarage
	 * @return
	 */
	public String parkValet(Car myCar, ParkingGarage park);
	/**
	 * @param myCar Car to be parked
	 * @param floor GUIFloor where car originated
	 * @param spot spot on floor
	 * @param pane Pane in GUI from car
	 * @return
	 */
	public String parkCar(Car myCar, GUIFloor floor, int spot, ToolTipStackPane pane);
	//--------------------------------------------------------	
	public String[] getTypesAllowed();
	public int getFloorNum();
	//--------------------------------------------------------	
	public CarsArray getCarsAr();
	public CarsArray getMotoAr();
	public CarsArray getHandiAr();
	public CarsArray getBusAr();
	//--------------------------------------------------------	
	public int getAmountCars();
	public int getAmountTotalSpaces();
	public int getAmountSpaces();
	public int getBusAmount();
	public int getHandiAmount();
	public int getMotoAmount();
	//--------------------------------------------------------	
	/**
	 * @param spaceType is 'spaceType's array full
	 * 
	 */
	public boolean isFull(String spaceType);
	//--------------------------------------------------------	
	public void CarParked();
	public void MotoParked();
	public void BusParked();
	public void HandiParked();
	//--------------------------------------------------------	
	/**
	 * @param myCar car being Picked Up
	 */
	public void carPicked(Car myCar);
}
