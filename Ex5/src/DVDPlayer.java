class DVDPlayer {
	boolean canRecord = false;
	void recordDVD() {
		System.out.println("DVD recording");
	}
}

class DVDPlayerTestDrive {
	public static void main(String [] args) {
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.recordDVD();			//There was no method to "playDVD", just record
		if (d.canRecord == true) {
			d.recordDVD();
		}
	}
}