package me.corruptedbytes;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

class CorruptedMapping {
	
	static CorruptedMapping INSTANCE = new CorruptedMapping();
	HashMap<String, String> hm = new HashMap<String, String>();

	void initMapping() throws UnsupportedEncodingException {
		hm.put("A", "z");
		hm.put("B", "N");
		hm.put("C", "O");
		hm.put("D", "p");
		hm.put("E", "Q");
		hm.put("F", "R");
		hm.put("G", "s");
		hm.put("H", "T");
		hm.put("I", "U");
		hm.put("J", "v");
		hm.put("K", "W");
		hm.put("L", "X");
		hm.put("M", "y");
		hm.put("N", "b");
		hm.put("O", "C");
		hm.put("P", "D");
		hm.put("Q", "e");
		hm.put("R", "F");
		hm.put("S", "G");
		hm.put("T", "h");
		hm.put("U", "I");
		hm.put("V", "J");
		hm.put("W", "k");
		hm.put("X", "L");
		hm.put("Y", "M");
		hm.put("Z", "a");
		
		hm.put("a", "Z");
		hm.put("b", "n");
		hm.put("c", "o");
		hm.put("d", "P");
		hm.put("e", "q");
		hm.put("f", "r");
		hm.put("g", "S");
		hm.put("h", "t");
		hm.put("i", "u");
		hm.put("j", "V");
		hm.put("k", "w");
		hm.put("l", "x");
		hm.put("m", "Y");
		hm.put("n", "B");
		hm.put("o", "c");
		hm.put("p", "d");
		hm.put("q", "E");
		hm.put("r", "f");
		hm.put("s", "g");
		hm.put("t", "H");
		hm.put("u", "i");
		hm.put("v", "j");
		hm.put("w", "K");
		hm.put("x", "l");
		hm.put("y", "m");
		hm.put("z", "A");
	}

}
