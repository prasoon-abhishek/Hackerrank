package strings;

 class MyRegex {
	 String Zip="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	    String pattern=Zip + "\\."+Zip+"\\."+Zip+"\\."+Zip;
}
