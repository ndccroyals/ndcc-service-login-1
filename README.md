# ndcc-service-login

#swaager url

http://localhost:8088/swagger-ui.html


#Create Database
 CREATE DATABASE ndcc;

#list tables
SHOW TABLES;

#To Switch to ndcc schema 
 USE ndcc;
 
 #Create table
 
 CREATE TABLE IF NOT EXISTS ndcc.USER_LOGIN (
    ID INT AUTO_INCREMENT,
    USER_ID VARCHAR(25) NOT NULL,
	PASSWORD VARCHAR(25) NOT NULL,
	EMAIL_ID VARCHAR(25) NOT NULL,
    CREATED_DATE DATE,
    MODIFIED_DATE DATE,    
    PRIMARY KEY (ID)
)  ;

#INSER Query

INSERT INTO USER_LOGIN(USER_ID, PASSWORD, EMAIL_ID, CREATED_DATE, MODIFIED_DATE)VALUES('ndcc11','ndcc11','ndcc@test.com',NOW(), NOW());