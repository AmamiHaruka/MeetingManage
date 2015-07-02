package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P p=new P("dps", "123");
		P p2=new P("smt","456");
		Map<String,P> m=new HashMap();
		List<P> l=new ArrayList<>();
		l.add(p);
		l.add(p2);
		//m.put("s1", p);
		//m.put("p2",p2);
		JSONArray a=JSONArray.fromObject(l);
		//JSONObject j=JSONObject.fromObject(p);
		System.out.println(a.get(0));
	}

}
