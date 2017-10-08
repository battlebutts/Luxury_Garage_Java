package guiApplication;

import basePackage.ParkingGarage;

public interface GUIFloor {
	public void updateGrid();
	public ToolTipStackPane[] getStackPanes();
	public String[] getAllowedTypes();
	public int getFloorNum();
	public ParkingGarage getGarage();
}
