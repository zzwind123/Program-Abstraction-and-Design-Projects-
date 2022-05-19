public class StringPractice {
  /* returns true if c is a punctuation mark or false otherwise
   * 
   * Punctuation mark is defined as:
   * apostrophe '
   * comma ,
   * period .
   * semicolon ;
   * colon :
   * exclamation point !
   * question mark ? 
   * 
   * (You don't have to worry about any others)
   */
	public static boolean isPunct(char c) {
		  if( 		c == '\''
		            || c == ','
		            || c == '.'
		            || c == ';'
		            || c == ':'
		            || c == '!'
		            || c == '?') {
			  return true;
		  }
	    return false;
	  }



  /*
   * returns the number of punctuation marks
   * found in s.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s) {
	  int numpuncmarks= 0;
	  
	  for (int i=0; i<s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			  numpuncmarks+=1;
		  }
	  }
    return numpuncmarks;
  }
  
  /*
   * returns the number of punctuation marks
   * found in s starting at the given index.
   *
   * call your isPunct( ) method. Do not compy and paste
   * the same logic into this function */
  public static int numPunct(String s, int startIndex) {
	  int numpuncmarks= 0;
	  for (int i=startIndex; i<s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			  numpuncmarks+=1;
		  }
	  }
    return numpuncmarks;
  }

  /*
   * returns the index of the first occurrence
   * of a punctuation mark in s starting
   * from index startPosition or -1 if there are
   * none at index startPosition or later.
   *
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfFirstPunct(String s, int startPosition) {
	  int returnIndex = -1;
	  for (int i=startPosition; i<s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			 return (i);
		  }
		  }
    return returnIndex;
    }
    		
	  


  /*
   * returns the index of the first punctuation mark in s or
   * -1 if s contains no punctuation marks
   *
   * use your solution to indexOfFirstPunct(String s, int startPosition)
   * in this function. Do not repeat the same logic.
   * 
   * Notice that this method has the same name as the
   * previous one, but that it takes a different number of arguments. This is
   * perfectly legal in Java. It's called "method overloading"
   *
   */
  public static int indexOfFirstPunct(String s) {
	  return indexOfFirstPunct(s, 0);
  }

  /*
   * returns the index of the last occurrence of a punctuation
   * mark in s or -1 if s contains no punctuation
   * 
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfLastPunct(String s) {
	  int returnIndex = -1;
	  for (int i=0; i<s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			  returnIndex = i;
		  }
	  }
      return returnIndex;
      
  }

  /*
   * returns a new String which is the same as s but with
   * each instance of oldChar replaced with newChar
   */
  public static String substitute(String s, char oldChar, char newChar) {
      //loop through the whole string s
	  // at each index, you check if the current char is oldChar
	  // if the above condition holds, you append the new Char
	  String strToReturn = "";
	  for(int i = 0; i<s.length(); i++) {
		  if(s.charAt(i)==oldChar) {
			  strToReturn = strToReturn + newChar;
		  } else {
			  strToReturn = strToReturn + s.charAt(i);
		  }
	  }
	  return strToReturn;
	  
	  
  }

  /*
   * returns a new String which is the same as s, but
   * with each instance of a punctuation mark replaced
   * with a single space character
   *
   * Use at least one of your other functions in your
   * solution to this.
   *
   */
  public static String substitutePunct(String s) {
	  String strToReturn = "";
	  for(int i = 0; i<s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  strToReturn = strToReturn + " ";
		  } else {
			  strToReturn = strToReturn + s.charAt(i);
		  }
	  }
	  return strToReturn;
	  // s = "1?34,6"
	  // iter1: str = "1"
	  // final iter: str = "1 34 6"
  }
  
  /*
   * returns a new String which is the same as s,
   * but with all of the punctuation
   * marks removed.
   *
   * Use at least one of your other functions
   * in your solution to this one.
   * 
   */
  public static String withoutPunct(String s) {
	  String strToReturn = "";
	  for(int i = 0; i<s.length(); i++) {
		  if(isPunct(s.charAt(i))) {
			  strToReturn = strToReturn + "";
		  } else {
			  strToReturn = strToReturn + s.charAt(i);
		  }
	  }
	  return strToReturn;
  }

  /* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) {
	  for(int i =0; i<s.length(); i++) {
		  if(s.charAt(i)==c) {
			  return true;
		  }
	  }
	  return false;
  }

  /*
   * Returns true of s contains none of the characters
   * found in chars or false otherwise.
   */
  public static boolean containsNone(String s, String chars) {
	  for(int i=0; i<chars.length(); i++) {
		  for(int j=0; j<s.length(); j++) {
			  if(s.charAt(j)==chars.charAt(i)) {
				  return false;
			  }
		  }
	  }
	  // s = abc | chars=dec
	  // i = 0 |	d
	  	// compare d to abc
	  // i = 1 |	e
	  	// compare e to abc
	  // i = 2 |	c
	  	// compare c to abc
    return true;
  }
  
  /*
   * Returns true of s is comprised of only punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean onlyPunct(String s) {
	  for(int i=0; i<s.length(); i++) {
		  if (isPunct(s.charAt(i)) == false) {
			  return false;
		  }
	  }
    return true;
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) {
	  for(int i=0; i<s.length(); i++) {
		  if (isPunct(s.charAt(i))== true ) {
			  return false;
		  }
	  }
 
    return true;
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */
  
  // Approach 
  //  First, similiar to previous problems, create a for loop to go through the  whole string checking 
  // character by character
  //  Ask any questions in chat 
  public static boolean consecutivePuncts(String s) {
	  for(int i=0; i<s.length()-1; i++) {
		  if(isPunct(s.charAt(i))== true &&  isPunct(s.charAt(i+1))== true) {
			  return true; // everything else is good, just need to modify if condition
		  }
				 
	  }
    return false;
  }
}
