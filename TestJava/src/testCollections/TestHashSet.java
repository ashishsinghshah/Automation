package testCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashSet {
	
	String strName;
	int iVersion;
	
	public TestHashSet(String strName, int iVersion)
	{
		this.strName = strName;
		this.iVersion = iVersion;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj == null){
			return false;
		}
		if (this == obj){
			return true;
		}
		if (!(obj instanceof TestHashSet)){
			return false;
		}
		TestHashSet temp = (TestHashSet)obj;
		if (!this.strName.equals(temp.strName)){
			return false;
		}
		if (this.iVersion != temp.iVersion){
			return false;
		}
		return true;
	}
	
	@Override
	public String toString()
	{
		return strName + "    " + iVersion;
	}
	
	public static void main(String[] arg){
		
		TestHashSet temp1 = new TestHashSet("ASHISH", 10);
		TestHashSet temp2 = new TestHashSet("SINGH", 100);
		TestHashSet temp3 = new TestHashSet("SHAH", 1000);
		TestHashSet temp4 = new TestHashSet("ashish singh shah", 10000);
		
		HashMap<String, TestHashSet> tempMap = new HashMap<String, TestHashSet>();
		tempMap.put("1", temp1);
		tempMap.put("2", temp2);
		tempMap.put("1", temp3);
		tempMap.put("2", temp4);
		
		Iterator<Map.Entry<String, TestHashSet>> iter = tempMap.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, TestHashSet> entry = iter.next();
			System.out.println("key: " + entry.getKey() + "   value: " + entry.getValue().toString());
		}
		
	}

}
