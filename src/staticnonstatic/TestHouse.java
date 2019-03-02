package staticnonstatic;

public class TestHouse {
	
	public static void main(String[] args) {
		House anthony = new House();
		anthony.setDriveWaySize(6);
		int anthonyDriveWaySizeBefore = anthony.getDriveWaySize();
		System.out.println("anthony's drive way size: " + anthonyDriveWaySizeBefore);
		
		House arif = new House();
		arif.setDriveWaySize(8);
		int arifDriveWaySize = arif.getDriveWaySize();
		System.out.println("arif's drive way size: " + arifDriveWaySize);
		
		int anthonyDriveWaySizeAfter = anthony.getDriveWaySize();
		System.out.println("anthony's drive way size: " + anthonyDriveWaySizeAfter);
		anthony.moveDriveWAyDirection();
		
		House.moveDriveWAyDirection();	
	}

}
