package compareScores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class CalculateScore {
	// DB info
	static String DBName = "Scores2008";
	static String DBurl = "jdbc:mysql://localhost:3306/" + DBName + "?useSSL=false";
	static String DBusername = "root";
	static String DBpassword = "Wutangclan25";
	
	public static void main(String[] args) {

	}
	
	public static void receiveOffensiveScores(String teamName, double points, double avgPointsGivenUp, double predictedScore) {
		
	}

}