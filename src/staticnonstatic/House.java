package staticnonstatic;

public class House {
	
	public static int driveWaySize = 8;
	
	public void setDriveWaySize(int driveWaySize) {
		this.driveWaySize = driveWaySize;
	}
	
	public int getDriveWaySize() {
		return driveWaySize;
	}
	
	public static void moveDriveWAyDirection() {
		System.out.println("Entrance and exit to north");
	}

}
