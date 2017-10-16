bool verification(string name){
 
	if(name.length() > 12 || name.length() < 1){
		
		throw new RunTimeException("Name length invalid!");

	}

	Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
	Matcher m = p.matcher(name);
	boolean b = m.find();

	if (b){

		throw new RunTimeException("No special characters!");
	}
}