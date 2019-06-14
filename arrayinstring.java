String[] thisIsAStringArray = {"Apple", "Banana", "Orange"};
String stringToSearch = "Banana";
boolean found = false;
for (String element:thisIsAStringArray) {
    if ( element.equals( stringToSearch )) {
        found = true;
    }
}
if (found) {
    System.out.println( "The array contains the string: " + stringToSearch );
} else {
    System.out.printl