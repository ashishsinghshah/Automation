package testInt;


import java.io.*; 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

class FileReaderDemo { 
	public static String strtemp = "*********************";
	public static String strdashline = "-----------";
	public static void main(String args[]) throws Exception { 
		System.out.println("in Main");
	FileReader fr = new FileReader("C:\\TESTDATA\\in\\10.16.14.208_201202281754.log"); 
	BufferedReader br = new BufferedReader(fr); 
	String s;
	TreeMap<String, ArrayList<String>> sMap = new TreeMap<String, ArrayList<String>>();
	String readstr = "";
	boolean insideBlock = false;
	ArrayList<String> arrlist = null;
	String name = null;
	while((s = br.readLine()) != null) { 
		if(s.contains(strdashline))
			break;
	}
	
	while((s = br.readLine()) != null) { 
			if(s.contains(strdashline))
			{
				strdashline = s;
				continue;
			}
				
			if(s.contains(strtemp)){
				strtemp = s;
				if(insideBlock == false)
				{
					arrlist = new ArrayList<String>();
					insideBlock = true;
				}else{//end of block
					
					//if (s.startsWith("name="))
					{
						String strSplit[] = name.split("=");
						sMap.put(strSplit[1], arrlist);
						insideBlock = false;

					}
					
				}
				continue;
			}
		
			//add only if the block is stareds
			arrlist.add(s);
			if (s.startsWith("name="))
				name = s;
		} 
		fr.close();
		System.out.println(sMap);
		
		
		File writeFile =new File("C:\\TESTDATA\\out\\10.16.14.208_201202281754.log");
		FileOutputStream fileOutputStream = new FileOutputStream(writeFile,true);
		
		Collection<ArrayList<String>> collection = sMap.values();
		Iterator<ArrayList<String>> itr = collection.iterator();
		
		while(itr.hasNext())
		{
			
			ArrayList<String> arrString = itr.next();
			for(String str : arrString)
			{
				fileOutputStream.write(str.getBytes());
				fileOutputStream.write("\n".getBytes());

			}
			fileOutputStream.write(strtemp.getBytes());
			fileOutputStream.write("\n".getBytes());
		}
		
		System.out.println("end of file");
	}
}
