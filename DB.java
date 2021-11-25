package uk.ac.mmu.cmdt.advprog.reassessment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Handles all of the application's database interaction
 * 
 * @author You, mainly!
 */
public class DB {
	
	private String connectionString = "jdbc:sqlite:data/vaccination_centres.db";

	/**
	 * Queries the database to find out how many vaccination sites it contains
	 * @return The number of sites in the vaccination_centres.db database
	 */
	public int getNumberOfSites() {
		try (Connection c = DriverManager.getConnection(connectionString); ) {
			
			//run the query
			String sql = "SELECT COUNT(*) FROM vaccination_sites;";
			PreparedStatement s = c.prepareStatement(sql);			
			s.execute();
			ResultSet results = s.getResultSet();

			//no need to loop through the result set, our query returns just one result
			return results.getInt(1);
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
}
