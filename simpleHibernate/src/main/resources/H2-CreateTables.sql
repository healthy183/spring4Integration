drop table if exists PEOPLE;
CREATE TABLE PEOPLE(
 ID INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
 name VARCHAR(255),
 CREATED_DATE_TIME TIMESTAMP,
  PRIMARY KEY (id)
  )ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

