package uk.ac.mmu.cmdt.advprog.reassessment;

public class Main {
	
	/**
	 * Main entry point for the program
	 * @param args Not used
	 */
	public static void main(String[] args) {
		DB db = new DB();
		int sites = db.getNumberOfSites();
		
		System.out.println("There are " + sites + " vaccination sites in the database.");
	}

}
