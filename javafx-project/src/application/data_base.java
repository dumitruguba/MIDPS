package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.sql.ResultSet;


public class data_base {
	
	public String fname = null, lname = null, region = null, sex = null, email = null;
	public int age = 0;
	public int europe_contor = 0, asia_contor = 0, africa_contor = 0, 
				north_america_contor = 0, south_america_contor = 0, australia_contor = 0;
	public int Acontor1 = 0, Acontor2 = 0, Acontor3 = 0, Acontor4 = 0;
	public int female = 0, male = 0;
	public int time1 = 0, time2 = 0, time3 = 0, time4 = 0;
	
	public void DB_insert() throws Exception {
		if(fname != null && lname != null && region != null && age != 0 && sex != null){
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/infodb","root","");
			
			String query = " insert into data_store values (?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement statement = conn.prepareStatement(query);
			
			DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
			Date time = new Date();
			
			statement.setString(1, fname);
			statement.setString(2, lname);
			statement.setString(3, email);
			statement.setString(4, region);
			statement.setInt(5, age);
			statement.setString(6, sex);
			statement.setString(7, dateFormat.format(time));
			statement.execute();
			
			conn.close();
		}
	}
	
	public void DB_extract() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/infodb","root","");
		
		PreparedStatement statement = conn.prepareStatement("select * from data_store");
		
		ResultSet result = statement.executeQuery();

		ArrayList<String> region_arr = new ArrayList<String>();
		ArrayList<String> age_arr = new ArrayList<String>();
		ArrayList<String> sex_arr = new ArrayList<String>();
		ArrayList<String> time_arr = new ArrayList<String>();
		
		while(result.next()){
			region_arr.add(result.getString(4));
			age_arr.add(result.getString(5));
			sex_arr.add(result.getString(6));
			time_arr.add(result.getString(7));
		}
		africa_contor = Collections.frequency(region_arr, "Africa");
		asia_contor = Collections.frequency(region_arr, "Asia");
		australia_contor = Collections.frequency(region_arr, "Australia");
		europe_contor = Collections.frequency(region_arr, "Europe");
		north_america_contor = Collections.frequency(region_arr, "North America");
		south_america_contor = Collections.frequency(region_arr, "South America");
		
		String[] ageArr = new String[age_arr.size()];
		ageArr = age_arr.toArray(ageArr);
		
		for(int i = 0; i < age_arr.size(); i++){
			if(Integer.parseInt(ageArr[i]) > 14 && Integer.parseInt(ageArr[i]) < 25)
				Acontor1++;
			else if(Integer.parseInt(ageArr[i]) > 24 && Integer.parseInt(ageArr[i]) < 45)
				Acontor2++;
			else if(Integer.parseInt(ageArr[i]) > 44 && Integer.parseInt(ageArr[i]) < 65)
				Acontor3++;
			else if(Integer.parseInt(ageArr[i]) > 64)
				Acontor4++;
		}
		
		female = Collections.frequency(sex_arr, "F");
		male = Collections.frequency(sex_arr, "M");
		
		String[] timeArr = new String[time_arr.size()];
		timeArr = time_arr.toArray(timeArr);
		
		for(int i = 0; i < time_arr.size(); i++){
			if(Integer.parseInt(timeArr[i].substring(0, 2)) > 6 && 
					Integer.parseInt(timeArr[i].substring(0, 2)) < 10)
				time1++;
			else if(Integer.parseInt(timeArr[i].substring(0, 2)) > 9 && 
					Integer.parseInt(timeArr[i].substring(0, 2)) < 13)
				time2++;
			else if(Integer.parseInt(timeArr[i].substring(0, 2)) > 12 && 
					Integer.parseInt(timeArr[i].substring(0, 2)) < 16)
				time3++;
			if(Integer.parseInt(timeArr[i].substring(0, 2)) > 15 && 
					Integer.parseInt(timeArr[i].substring(0, 2)) < 19)
				time4++;
		}
	}
	
	public String[] recipientArr;
	public int recipientArr_dimension;
	
	public void mailDB() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/infodb","root","");
		
		PreparedStatement statement = conn.prepareStatement("select * from data_store");
		
		ResultSet result = statement.executeQuery();
		
		ArrayList<String> recipient = new ArrayList<String>();
		
		while(result.next()){
			recipient.add(result.getString(3));
		}
		
		recipientArr_dimension = recipient.size();
		recipientArr = new String[recipientArr_dimension];
		recipientArr = recipient.toArray(recipientArr);
		
		email_send mail = new email_send();
		for(int i = 0; i < recipientArr_dimension; i++){
			mail.send(recipientArr[i]);
		}
	}
}
