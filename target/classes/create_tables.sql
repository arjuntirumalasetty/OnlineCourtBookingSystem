CREATE TABLE findsport.stadium_details (
    stadium_id INT NOT NULL AUTO_INCREMENT,
    stadium_name VARCHAR(20),
    stadium_longitude FLOAT(10 , 6 ),
    stadium_latitide FLOAT(10 , 6 ),
    stadium_phoneno VARCHAR(10),
    stadium_adress VARCHAR(40),
    PRIMARY KEY (stadium_id)
);

CREATE TABLE findsport.stadium_sport (
    stadium_id INT NOT NULL,
    sport_id INT(2),
    court_count INT(2),
    PRIMARY KEY (stadium_id , sport_id)
);

CREATE TABLE findsport.sport_details (
    sport_id INT(2),
    sport_name VARCHAR(20),
    PRIMARY KEY (sport_id)
);

CREATE TABLE findsport.court_availability (
    stadium_id LONG NOT NULL,
    court_id INT(2),
    booked_date DATE,
    booked_from TIME,
    booked_till TIME
);