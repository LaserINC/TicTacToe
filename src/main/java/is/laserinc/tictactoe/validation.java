bool verification(string name){
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(name);
		boolean b = m.find();

		if(name.length() > 12 || name.length() < 1) {
			return false;
		}
		else if (b) {
			return false;
		}

		else {
			return true;
		}
}

@Test
public void nameOk(){
	assertEquals(TRUE, TicTacToe.verification("H4FD15"));
}

@Test
public void specialChar(){
	assertEquals(FALSE, TicTacToe.verification("H4fd1?"));
}

@Test
public void nameToLong(){
	assertEquals(FALSE, TicTacToe.verification("H4fd15543L4ND1337N3RD"));
}

@Test
public void emptyName(){
	assertEquals(FALSE, TicTacToe.verification(""));
}
