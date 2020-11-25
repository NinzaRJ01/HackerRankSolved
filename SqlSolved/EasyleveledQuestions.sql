/* 
Problem 1:
Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA. 

City Desicribe :
|Field		|Type			|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|
*/
SELECT * FROM CITY
WHERE POPULATION >=100000 AND COUNTRYCODE="USA";
/*
Problem 2:
Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA. 
CITY table described as:
|Field		|Type			|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|
*/
SELECT NAME FROM CITY 
WHERE POPULATION > 120000 AND COUNTRYCODE="USA";
/*
Problem 3:Select ALL
Query all columns (attributes) for every row in the CITY table.

The CITY table is described as follows: 
|Field		|Type			|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|

*/
SELECT * FROM CITY;
/*
Problem 4:Select by ID
Query all columns for a city in CITY with the ID 1661.

The CITY table is described as follows: 
|Field		|Type			|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|
*/
SELECT * FROM CITY 
WHERE ID=1661;
/*
Problem 5 : japanese cities
Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.

The CITY table is described as follows: 
|Field		|Type			|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|

*/
SELECT * FROM CITY 
WHERE COUNTRYCODE ="JPN";
/*
PROBLEM 6:japanese cities' names
Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
The CITY table is described as follows: 
|Field		|Type			|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|
*/
SELECT NAME FROM CITY
WHERE COUNTRYCODE="JPN";
/*
PROBLEM 7: WEATHER OBSERVATION STATION1
Query a list of CITY and STATE from the STATION table.
The STATION table is described as follows: 
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

*/
SELECT DISTINCT CITY, STATE FROM STATION;
/*
PROBLEM 8 :WEATHER OBSERVATION STATION3
Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer.
The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

*/
SELECT DISTINCT CITY FROM STATION
WHERE ID%2=0;
/*
PROBLEM 9: WEATHER OBSERVATION STATION4
Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|
*/

SELECT COUNT(CITY)-COUNT(DISTINCT CITY) FROM STATION;
/*
PROBLEM 10: WEATHER OBSERVATION STATION 5

Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|


*/
SELECT CITY,LENGTH(CITY) FROM STATION
 ORDER BY LENGTH(CITY),CITY
LIMIT 1;
SELECT CITY,LENGTH(CITY) FROM STATION
 ORDER BY LENGTH(CITY) DESC,CITY 
LIMIT 1;
--Oracle Impelementation
select * from (
select city, length(city)  from station
where --rownum = 1 and This will give wrong result b.s. it will exceute before order statement
length(city) = (select min(length(city))
                             from station )
order by city )
where rownum=1;
select * from (
select city, length(city)  from station
where --rownum = 1 and 
length(city) = (select max(length(city))
                             from station )
order by city desc)
where rownum=1;

/*
PROBLEM 11: WEATHER OBSERVATION STATION 6
Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|
*/
SELECT DISTINCT CITY FROM STATION 
WHERE CITY REGEXP '^[aeiou].*';
/*
PROBLEM 12 : WEATHER OBSERVATION STATION 7
Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.
The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

*/
SELECT DISTINCT CITY FROM STATION 
WHERE CITY REGEXP ".*[aeiou]$";
/*
PROBLEM 13 : WEATHER OBSERVATION STATION 8
Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.
The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

*/
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '^[aeiou].*[aeiou]$';
/*
PROBLEM 14 : WEATHER OBSERVATION STATION 9
Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
 The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

*/
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '^[^aeiou].*';
/*
PROBLEM 15 : WEATHER OBSERVATION STATION 10
Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.
The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|
*/ SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '.*[^aeiou]$';
/*
PROBLEM 16 : WEATHER OBSERVATION STATION 11
Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.
 The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|
*/ 
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '(^[^aeiou].*)|(.*[^aeiou]$)';
/*
PROBLEM 17 : WEATHER OBSERVATION STATION 12
Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.
 The STATION table is described as follows:
|ID		|NUMBER			|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|
*/ 
SELECT DISTINCT CITY FROM STATION
WHERE CITY REGEXP '^[^aeiou].*[^aeiou]$';
 
/*PROBLEM : Type of Triangle*/
SELECT CASE
    WHEN A+B <= C OR A+C <= B OR C+B <= A THEN "Not A Triangle"
    WHEN A = B AND B = C THEN 'Equilateral'
    WHEN A = B OR B = C OR A = C THEN 'Isosceles'
    ELSE 'Scalene'
END
FROM TRIANGLES;

