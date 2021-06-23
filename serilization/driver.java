
import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.lang.model.element.Element;




public class driver {

	public static void main(String[] args) 
	{
	Map<String, String> hm = new HashMap<String,String>();
	hm.put("s","s");
	hm.put("i","a");
	hm.put("d","n");
	hm.put("d","t");
	hm.put("u","i");
	hm.put(null,null);
	hm.put("l",null);
	for(Map.Entry temp:hm.entrySet())
   {
	   System.out.println(temp.getKey()+"-"+temp.getValue());
   }
}

}
