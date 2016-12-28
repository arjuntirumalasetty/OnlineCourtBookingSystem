package com.findsport.DataAccessor;

import com.findsport.DataObjects.StadiumSport;
import com.findsport.Main.StartService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Arjun on 12/27/2016.
 */
@PropertySource("classpath:query.properties")


public class StadiumSportDAO {

    @Value("${insert_stadium_sport}")
    private static String insertSatdiumDetails;
    private static JdbcTemplate jdbcTemplate;
    public static void insert(StadiumSport stdSport){
        try {
            jdbcTemplate = StartService.getJdbcTemplate();
            int result = jdbcTemplate.update(insertSatdiumDetails, stdSport.getStadiumID(), stdSport.getSportID(), stdSport.getCourtCount());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
