package com.findsport.Main;

import com.findsport.DataBaseConnections.CreateDBConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Arjun on 12/27/2016.
 */
public class StartService {
	
	private static ApplicationContext context =
            new ClassPathXmlApplicationContext("Springbean.xml");
    private static CreateDBConnection connection = (CreateDBConnection) context.getBean("createDBConnection");
    private static JdbcTemplate template;
    
    public static void main(String[] args){
        try {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("Springbean.xml");
            CreateDBConnection connection = (CreateDBConnection) context.getBean("createDBConnection");
            JdbcTemplate template = connection.getConnection();
            String insert_stadium_details = "INSERT INTO stadium_details (stadium_name,stadium_longitude, stadium_latitide,stadium_phoneno, stadium_adress) VALUES (?,?,?,?,?)";
            template.update(insert_stadium_details, "Test_Name",2153.56,125.56,"phnno","Test add");
        }catch(Exception e){
            System.out.print(e);
        }

    }

    public static JdbcTemplate getJdbcTemplate() {
    	if (template == null) {
    		template = connection.getConnection();
    	}
    	return template;
    }
}
