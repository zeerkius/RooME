DROP DATABASE IF EXISTS RooMe_db; -- This is more of a formailty to make sure there are no identical databases
CREATE DATABASE RooMe_db; -- Creating App database
USE  RooME_db; -- This signifies we are about to use our database 

CREATE TABLE New_User(
ID int primary key, -- we will we use this for all our tables so we can connect data together
Alias_Username varchar(30),
email varchar(30),
password varchar(30)
);

INSERT INTO New_User(ID,Alias_Username,email,password) -- Inserting values that would be needed for potential New Users
VALUES (2576544,"Baker2real40", "Baker14@pvamu.edu","heHlove21@p1"),(2775453,"ShelovesKyle21", "Osborne2@pvamu.edu","hello23@zZ!");

CREATE TABLE Users(
ID int primary key,
Name varchar(40),
Alias_Username varchar(30),
email varchar(30),
password varchar(30),
gender varchar(30),
DOB datetime -- we will derive age when needed
);
INSERT INTO Users(ID,Name,Alias_Username,email,password,gender,DOB) -- Inserting values for users along with more personalized information as well as derived information
VALUES (2576544,"Armani Baker","Baker2real40","Baker14@pvamu.edu","heHlove21@p1","Male",'2004-05-07'),(2775453,"Kyle Osborne","ShelovesKyle21", "Osborne2@pvamu.edu","hello23@zZ!","Male",'2002-01-11');

CREATE TABLE  User_Personality(
ID int primary key,
Zodiac_sign varchar(30),
Cleanliness int,
Organization_ int,
Social_link varchar(30), -- we can maybe have them specify what the link is for in their bio?
Major varchar(30),
Minor varchar(30), 
Company int,
Hygenic int,
Bed_Time  varchar(30),-- we are going to have specify to the user format in advance
Volume int
);
INSERT INTO User_Personality (ID,Zodiac_sign,Cleanliness,Organization_,Social_link,Major,Minor,Company,Hygenic,Bed_Time,Volume)
VALUES(2576544,"Taurus",7,6,"@bakertoohot","Biology","Mathematics",2,7,"10PM",5),(2775453,"Capricorn",3,1,"@SheloveKyle21","Buissness","Entrepeanuership",9,1,"12PM",7);


CREATE TABLE User_Pictures(
ID int primary key,
Profile_Pic blob, -- might have to use java script code to make a blob from jpeg
Post blob, -- we will derive likes from the post 
Caption varchar(30) -- This could be a derived attribute however it is not toally obvious how to store it
);

INSERT INTO User_Pictures (ID,Profile_Pic,Post,Caption)
VALUES(2576544,   ,    ,       , ),(2775453,     ,     ,        ,); -- insert values when they become able to be inserted with the interface


CREATE TABLE Review_Board(
    Review_creator_ID int ,
    Review varchar(250),
    Review_who_it_pertains_to_ID int, -- We will use this so that the user can see who these review pertain two
    Cleanliness int,
    Organization_ int,
    Company int,
    Hygenic int,
    Bed_Time varchar(30),
    Volume int,
    Truth_Score decimal,
    PRIMARY KEY(Review_creator_ID),
    CONSTRAINT Comparison_Table
FOREIGN KEY (Review_who_it_pertains_to_ID)
    REFERENCES User_Personality(Review_Creator_ID) -- Creating the comparison table using a foreign key

);


INSERT INTO Review_Board (Review_creator_ID,Review,Review_who_it_pertains_to_ID,Cleanliness,Organization_,Company,Hygenic,Bed_Time,Volume,Truth_Score)
VALUES (2576544,"Kyle is always partying and isa horrible roomate. He is very unclean as well as 
being unconsiderate to his roomate.",2775453,2,0,10,10,"None",10,--this will be the average of all the ratios of his scores),(2775453,"Armani is such a bad roomate he tells 
everyone that he is a nerd , but really he is a party animal",2,2,10,10,1,"10PM",2576544,-- the average of all the ratios of the scores)
-- We will display both extremes with the review board
-- Kyle will have  avery favorable Truth Score however will be a undesireable roomate , as well as the staple of the app the "Liar"
-- Armani will have a very good self represented score however his reviews will show that he is a liar , and actually a very bad roomate
