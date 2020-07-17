package utility;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;


public class ConnectionManager {
	
	public static Properties loadPropertiesFile() throws Exception {
		
	 	Properties prop = new Properties();
	 	InputStream in =ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	 	prop.load(in);
	 	in.close();
	 	return prop;	
	}	
	public final static Connection getConnection() throws Exception {
          Properties prop=null;
	      prop=loadPropertiesFile();
	      final String driver=prop.getProperty("driver");
	      final String url=prop.getProperty("url");
	   
	      Class.forName(driver);
		  Connection con=DriverManager.getConnection(url);
		  if(con!=null) 
			  
			  return con;
		  else
			  return con;
		}
	
	
}