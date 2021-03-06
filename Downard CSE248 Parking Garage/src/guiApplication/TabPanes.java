package guiApplication;

import java.io.Serializable;

import basePackage.*;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
/**
 * array with multiple tabs that creates the content within differently
 */
public class TabPanes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7646345453138502181L;
	private TabPane tpane;
	private Tab[] tabAr;
	private GUIFloor[] floorGUIAr;
	
	//--------------------------------------------------------	
	/**
	 * constructor, makes different floors depending on FloorArray floors
	 * @param CarPark parkinggarage to base floors on
	 */
	public TabPanes(ParkingGarage CarPark) {
		//TODO MAKE TABPANES
		int floors = CarPark.FLOORS.length;
		tpane = new TabPane();
		tabAr = new Tab[floors];
		floorGUIAr = new GUIFloor[floors];
		for (int i = 0; i < floors; i++) {
			//TODO create Floors
			if (CarPark.getFloorsArray().getAr()[i] instanceof NormalFloor) {
				tabAr[i] = new Tab("Floor " + (i + 1));
				NormalFloorPane newFloor = new NormalFloorPane(CarPark, i);
				floorGUIAr[i] = newFloor;
				tabAr[i].setContent(newFloor.getGridPane());
				tabAr[i].setClosable(false);
			}else if (CarPark.getFloorsArray().getAr()[i] instanceof GroundFloor) {
				tabAr[i] = new Tab("Ground Floor " + (i + 1));
				GroundFloorPane newFloor = new GroundFloorPane(CarPark, i);
				floorGUIAr[i] = newFloor;
				tabAr[i].setContent(newFloor.getGridPane());
				tabAr[i].setClosable(false);
			}
			tpane.getTabs().add(tabAr[i]);
		}	
		
	}
	
	//--------------------------------------------------------	
	/**
	 * updates gridpanes of all tabs
	 */
	public void updateGrid() {
		for (int i = 0; i < floorGUIAr.length; i++) {
			floorGUIAr[i].updateGrid();
		}
	}
	
	//--------------------------------------------------------	
	
	public int getAmountTabs() {
		return tabAr.length;
	}
	
	/**
	 * gets all floors
	 * @return GUIfloorsArray
	 */
	public GUIFloor[] getFloors() {
		return floorGUIAr;
	}
	/**
	 * gets root pane
	 * @return root tabpane
	 */
	public TabPane getTabPane() {
		return this.tpane;
	}
	
	
}
