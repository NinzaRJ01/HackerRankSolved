
**Problem 1:**

_Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA._ 

|City     | Desicribe : |
| ------   | ----------- |
|Field	   |Type			|
|ID		   |NUMBER			|
|NAME	   |VARCHAR2(17)		|
|COUNTRYCODE |VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	 |NUMBER			|
``` mysql
SELECT * FROM CITY
WHERE POPULATION >=100000 AND COUNTRYCODE="USA";
```
**Problem 2:**
_Query the NAME field for all American cities in the CITY table with populations larger than 120000. The CountryCode for America is USA._
CITY table described as:_

|Field		|Type		  |
| -------- | ------------|
|ID		    |NUMBER			|
|NAME		|VARCHAR2(17)	|
|COUNTRYCODE|VARCHAR2(3)	|
|DISTRICT	|VARCHAR2(20)	|
|POPULATION	|NUMBER			|
```mysql
SELECT NAME FROM CITY 
WHERE POPULATION > 120000 AND COUNTRYCODE="USA";
```
**Problem 3:**Select ALL
_Query all columns (attributes) for every row in the CITY table._

The CITY table is described as follows: 

|Field		|Type			|
| -------- | ------------|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|

```mysql
SELECT * FROM CITY;
```
**Problem 4:** Select by ID
_Query all columns for a city in CITY with the ID 1661._

The CITY table is described as follows: 

|Field		|Type			|
| -------- | ------------|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|
```mysql
SELECT * FROM CITY 
WHERE ID=1661;
```
**Problem 5 :** japanese cities
_Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN._

The CITY table is described as follows: 

|Field		|Type			|
| -------- | ------------|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|

```mysql
SELECT * FROM CITY 
WHERE COUNTRYCODE ="JPN";
```
**PROBLEM 6:**japanese cities' names
_Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN._

The CITY table is described as follows: 

|Field		|Type			|
| -------- | ------------|
|ID		|NUMBER			|
|NAME		|VARCHAR2(17)		|
|COUNTRYCODE	|VARCHAR2(3)		|
|DISTRICT		|VARCHAR2(20)		|
|POPULATION	|NUMBER			|
```mysql
SELECT NAME FROM CITY
WHERE COUNTRYCODE="JPN";
```
**PROBLEM 7:** WEATHER OBSERVATION STATION1
_Query a list of CITY and STATE from the STATION table._

The STATION table is described as follows: 

|ID		|NUMBER			|
| -------- | ------------|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

```mysql
SELECT DISTINCT CITY, STATE FROM STATION;
```
**PROBLEM 8 :** WEATHER OBSERVATION STATION3
_Query a list of CITY names from STATION for cities that have an even ID number. Print the results in any order, but exclude duplicates from the answer._
The STATION table is described as follows:

|ID		|NUMBER			|
| -------- | ------------|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

```mysql
SELECT DISTINCT CITY FROM STATION
WHERE ID%2=0;
```
**PROBLEM 9:** WEATHER OBSERVATION STATION4
_Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table._

The STATION table is described as follows:

|ID		|NUMBER			|
| -------- | ------------|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|

```mysql
SELECT COUNT(CITY)-COUNT(DISTINCT CITY) FROM STATION;
```
**PROBLEM 10:** WEATHER OBSERVATION STATION 5

_Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically._

The STATION table is described as follows:

|ID		|NUMBER			|
| -------- | ------------|
|CITY		|VARCHAR2(21)		|
|STATE		|VARCHAR2(2)		|
|LAT_N		|NUMBER			|
|LONG_W		|NUMBER			|


```mysql
SELECT CITY, MIN(LENGTH(CITY)) FROM STATION WHERE LENGTH(CITY)=MIN(LENGTH(CITY));
SELECT CITY, MAX(LENGTH(CITY)) FROM STATION;
```
