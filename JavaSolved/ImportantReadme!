->To check if there has a line that can be taken as input:
	$objOfScannerClass.hasNextLine()
	i.e :-
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
		String s = scan.nextLine();
	}
-> To parse a string into int :
	method to be used,Integer.parseInt("434");

->To format a simple string, we'll use the %s combination. Additionally, we can make the string uppercase:

	printf("'%s' %n", "baeldung");
	printf("'%S' %n", "baeldung");

And the output is:

	'baeldung' 
	'BAELDUNG'

Also, to specify a minimum length, we can specify a width:

	printf("'%15s' %n", "baeldung");

Which gives us:

	'       baeldung'

If we need to left-justify our string, then we can use the ‘-‘ flag:

	printf("'%-10s' %n", "baeldung");
	
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

