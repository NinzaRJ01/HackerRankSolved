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
--PROBLEM 18: Higher than 75 marks
/*
Query the Name of any student in STUDENTS who scored higher than Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.
*/  
SELECT  NAME FROM STUDENTS
WHERE MARKS > 75
ORDER BY RIGHT(NAME,3),ID;
--PROBLEM 19: EMPLOYEE NAME 
/*
Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee table in alphabetical order.

https://s3.amazonaws.com/hr-challenge-images/19629/1458557872-4396838885-ScreenShot2016-03-21at4.27.13PM.png
*/
SELECT NAME FROM EMPLOYEE
ORDER BY NAME;
/*
PROBLEM 20: EMPLOYEE SALARIES 
Write a query that prints a list of employee names (i.e.: the name attribute) for employees in Employee having a salary greater than 2000 per month who have been employees for less than 10 months. Sort your result by ascending employee_id.
*/
SELECT NAME FROM EMPLOYEE
WHERE SALARY > 2000 AND MONTHS <10
ORDER BY EMPLOYEE_ID ASC;
/*
PROBLEM 21: TYPE OF TRIANGLE
Write a query identifying the type of each record in the TRIANGLES table using its three side lengths. Output one of the following statements for each record in the table:

    Equilateral: It's a triangle with 3 sides of equal length.
Isosceles: It's a triangle with 2 sides of equal length.
Scalene: It's a triangle with 3 sides of differing lengths.
Not A Triangle: The given values of A, B, and C don't form a triangle.
*/
SELECT CASE
    WHEN A+B <= C OR A+C <= B OR C+B <= A THEN "Not A Triangle"
    WHEN A = B AND B = C THEN 'Equilateral'
    WHEN A = B OR B = C OR A = C THEN 'Isosceles'
    ELSE 'Scalene'
END
FROM TRIANGLES;
/*
PROBLEM 22: Revising Aggregations - The Count Function
Query a count of the number of cities in CITY having a Population larger than 100,000
*/
select count(name) from  city 
where population>100000;
/*
PROBLEM 23: Revising Aggregations - Averages
Query the average population of all cities in CITY where District is California. 
*/
select avg(population) from city
where district="California";/*
PROBLEM 24: Revising Aggregations - The Sum Function
Query the total population of all cities in CITY where District is California. 
*/
select sum(population) from city 
where district = "California";
/*
PROBLEM 25: AVERAGE POPULATION
Query the average population for all cities in CITY, rounded down to the nearest integer.
*/
select round(avg(population),0) from city ;
/*
PROBLEM 26 : JAPAN POPULATION
*/
select sum(POPULATION) from city where COUNTRYCODE ="JPN";
/*
PROBLEM 27: POPULATION DENSITY DIFFERNECE
Query the difference between the maximum and minimum populations in CITY.
*/
select max(population)-min(population) from city;
/*
PROBLEM 28: THE BLUNDER
Samantha was tasked with calculating the average monthly salaries for all employees in the EMPLOYEES table, but did not realize her keyboard's 0
key was broken until after completing the calculation. She wants your help finding the difference between her miscalculation (using salaries with any zeroes removed), and the actual average salary.

Write a query calculating the amount of error (i.e.:ACTUAL -MISCALCULATED
average monthly salaries), and round it up to the next integer.
*/
select ceil(avg(salary)-avg(replace(salary,0,''))) from employees;
/*
PROBLEM 29: TOP EARNERS
We define an employee's total earnings to be their monthly SALARY * MONTHS worked, and the maximum total earnings to be the maximum total earnings for any employee in the Employee table. Write a query to find the maximum total earnings for all employees as well as the total number of employees who have maximum total earnings. Then print these values as 2 space-separated integers.

*/
select round(avg(salary*months)), count(name) from employee
where salary*months = (select max(salary*months) from employee);
/*PROBLEM 30 : WEATHER OBSERVATION STATION 2 
Query the following two values from the STATION table:

    1.The sum of all values in LAT_N rounded to a scale of  2 decimal places.
     2.The sum of all values in LONG_W rounded to a scale of 2 
decimal places.
*/
SELECT ROUND(SUM(LAT_N),2),ROUND(SUM(LONG_W),2) FROM STATION;
/*
PROBLEM 31 :Weather Observation Station 13
Query the sum of Northern Latitudes (LAT_N) from STATION having values greater than 38.7880 and less than 137.2345 . Truncate your answer to decimal places.
*/
SELECT ROUND(SUM(LAT_N),4) FROM STATION
WHERE LAT_N BETWEEN 38.7880 AND 137.2345;

/*
PROBLEM 32 :Weather Observation Station 14
Query the greatest value of the Northern Latitudes (LAT_N) from STATION that is less than 137.2345.
 Truncate your answer to 4 decimal places.
 
*/
SELECT ROUND(MAX(LAT_N),4) FROM STATION 
WHERE LAT_N < 137.2345;
/*
PROBLEM 33 :Weather Observation Station 15
Query the Western Longitude (LONG_W) for the largest Northern Latitude (LAT_N) in STATION that is less than 137.2345. Round your answer to 4 decimal places.
*/
SELECT ROUND(LONG_W,4) FROM STATION
WHERE LAT_N <137.2345
ORDER BY LAT_N DESC
LIMIT 1;
/*
PROBLEM 34 :Weather Observation Station 16
Query the smallest Northern Latitude (LAT_N) from STATION that is greater than 137.2345. Round your answer to 4 decimal places.
*/
select round(min(lat_n),4) from 
station where lat_n >38.7780
/*
PROBLEM 35 :Weather Observation Station 17
Query the Western Longitude (LONG_W)where the smallest Northern Latitude (LAT_N) in STATION is greater than 38.7780 . Round your answer to 4 decimal places.
*/
select * from(
    select round((long_w),4) from station
    where lat_n = (select min(lat_n) from station where lat_n>38.7780)
    )
    where rownum = 1;
/*
PROBLEM 36 : Asian Cities
Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.

*/
select sum(City.population) from country,city 
where continent = "Asia" and country.code = city.countrycode;
/*
PROBLEM 37 : African Cities
Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Africa'.

Note: CITY.CountryCode and COUNTRY.Code are matching key columns.
*/
select city.name from country,city 
where continent = "Africa" and country.code = city.countrycode;
/*
PROBLEM 38 : Average Population of Each Continent
Given the CITY and COUNTRY tables,  query the names of all the 
continents (COUNTRY.Continent) and their respective average city 
populations (CITY.Population) rounded down to the nearest 
integer.
*/
select Country.Continent ,floor(avg(City.population)) from Country,City 
where Country.code = City.countrycode 
group by Country.Continent
order by Country.Continent;
