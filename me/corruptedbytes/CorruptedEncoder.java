package me.corruptedbytes;

import java.io.UnsupportedEncodingException;
import java.util.Map.Entry;

public class CorruptedEncoder {
	
	private String prefix = "!$";
	
	public static CorruptedEncoder getINSTANCE() {
		return new CorruptedEncoder();
	}

	
	public String encodeToString(String input) throws UnsupportedEncodingException {
		CorruptedMapping.INSTANCE.hm.clear();
		CorruptedMapping.INSTANCE.initMapping();
	    StringBuffer output = new StringBuffer();
	    for(int i = 0; i < input.length(); i++)
	    {
	        String ch = input.charAt(i) + "";
	        if(CorruptedMapping.INSTANCE.hm.containsKey(ch))
	        {
	            output.append(CorruptedMapping.INSTANCE.hm.get(ch));
	        }
	        else
	        {
	            output.append(ch);
	        }
	    }
	    
	    return prefix + output.toString();
	}

	public String decodeToString(String input) throws UnsupportedEncodingException {
		CorruptedMapping.INSTANCE.hm.clear();
		CorruptedMapping.INSTANCE.initMapping();
	    StringBuffer output = new StringBuffer();
	    
	    for(int i = 0; i < input.length(); i++)
	    {
	        String ch = input.charAt(i) + "";
	        if(CorruptedMapping.INSTANCE.hm.containsValue(ch))
	        {
	            for (Entry<String, String> entry : CorruptedMapping.INSTANCE.hm.entrySet()) {
	                if (entry.getValue().equals(ch)) {
	                    output.append(entry.getKey());
	                }
	            }
	        }
	        else
	        {
	            output.append(ch);
	        }
	    }
	    
	    if (output.toString().startsWith(prefix)) {
	    	return output.toString().replace(prefix, "");
	    }
	    
	    return null;
	}
	
}
