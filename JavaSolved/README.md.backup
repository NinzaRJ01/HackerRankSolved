## -- >To check if there has a line that can be taken as input:
- \<objOfScannerClass>.hasNextLine()
	```java
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
		String s = scan.nextLine();
	}
	```
	
## --> To parse a string into int :
	method to be used,Integer.parseInt("434");

## -->To format a simple string
 We'll use the %s combination. Additionally, we can make the string uppercase:

``` java
	System.out.printf("'%s' %n", "baeldung");
	System.out.printf("'%S' %n", "baeldung");
```
- And the output is:

	'baeldung' 
	'BAELDUNG'

- Also, to specify a minimum length, we can specify a width:
	``` java
	System.out.printf("'%15s' %n", "baeldung");
	```
- Which gives us:

	'      baeldung'

If we need to left-justify our string, then we can use the ‘-‘ flag:

``` java
	System.out.printf("'%-10s' %n", "baeldung");
	
	 public static void main(String[] args) {
      long n = 461012;
      System.out.format("%d%n", n);      //  -->  "461012"
      System.out.format("%08d%n", n);    //  -->  "00461012"
      System.out.format("%+8d%n", n);    //  -->  " +461012"
      System.out.format("%,8d%n", n);    // -->  " 461,012"
      System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
      
      double pi = Math.PI;

      System.out.format("%f%n", pi);       // -->  "3.141593"
      System.out.format("%.3f%n", pi);     // -->  "3.142"
      System.out.format("%10.3f%n", pi);   // -->  "     3.142"
      System.out.format("%-10.3f%n", pi);  // -->  "3.142"
      System.out.format(Locale.FRANCE,
                        "%-10.4f%n%n", pi); // -->  "3,1416"

      Calendar c = Calendar.getInstance();
      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

      System.out.format("%tD%n", c);    // -->  "05/29/06"
```

## -> Remarks about Calendar Class ##
- Calendar class is an abstract class in java. So you simply can't create **object** of it by invoking constructor. So, inorder to create an object which can be meaningful, we uses getInstance Method of Calendar Class.

```java
import java.util.Calendar;
...
Calendar mCalendar = Calendar.getInstance();
```

- nearly all fields of Calendar is static.
- \<objectname>.set(int year,int month,int day) can be used to set datetime of Calender object manual, <ins>by default it is similar to current datetime.</ins>

- get(int field) to get field value indentified by field id which is an stored as integer.
Example:-

	Calendarobj.get(Calendar.DAY\_OF_MONTH)

### Important fields in calendar class

|field 	  |Description
|--------|--------|
|DAY\_OF_WEEK| Field number for get and set indicating the day of the week.|
|DAY\_OF\_WEEK\_IN_MONTH|Field number for get and set indicating the ordinal number of the day of the week within the current month.|
|DAY\_OF_YEAR|Field number for get and set indicating the day number within the current year.|
|WEEK\_OF_MONTH|Field number for get and set indicating the week number within the current month.|
|YEAR| Field number for get and set indicating the year.|
|DATE| Field number for get and set indicating the day of the month.|
|MINUTE| Field number for get and set indicating the minute within the hour.|
|SECOND | Field number for get and set indicating the second within the minute.|

**Important Note**
--
```
SUNDAY Field Value is 1

Monday  "       "   " 2

.....

.....
Saturday "     "   "  7
```
