package testInt;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import jxl.CellView;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class testMain 
{
	public static void main (String[] argv)
	{
//		int i = Integer.parseInt("5");
//		
//		ArrayList arrList = new ArrayList(); 
//		arrList.add("ashu");
//		System.out.println("default size of array " + arrList.size());
//		
//		Vector vector = new Vector();
//		vector.add("ashu");
//		System.out.println("default size of vector " + vector.capacity());
//		
//		String str = "bf254e234afa95fd1d733e8ba7ec2ae3e97ef5e65ce432c847eb7045f6c1dec";
//		
//		
//		try {
//			ByteArrayOutputStream bout = new ByteArrayOutputStream();
//			BufferedOutputStream bufferedStream = new BufferedOutputStream(bout);
//			
//			WritableWorkbook workbook = Workbook.createWorkbook(bufferedStream);
//			
//			WritableSheet sheet = workbook.createSheet("First Sheet", 0); 
//			
//			CellView cv = new CellView();
//			cv.setSize(10);
//
//			
//			
//			//Label label = new Label(Column, Row, "A label record");
//			//Create the sheet header.	
//			WritableFont arialfont = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD, true);
//			WritableCellFormat arialformat = new WritableCellFormat (arialfont);
//
//			// Create the Header, specifying content and format
//			Label header1 = new Label(0,0, "Entry ID", arialformat); 
//			sheet.addCell(header1);
//			Label header2 = new Label(1,0, "Created Date", arialformat);
//			sheet.addCell(header2);
//			Label header3 = new Label(2,0, "Assigned Priority", arialformat);
//			sheet.addCell(header3);
//			Label header4 = new Label(3, 0, "Case Type",arialformat);
//			sheet.addCell(header4);
//			Label header5 = new Label(4, 0, "Assigned Team",arialformat);
//			sheet.addCell(header5);
//			Label header6 = new Label(5, 0, "Status",arialformat);
//			sheet.addCell(header6);
//			
//			workbook.write();
//		    workbook.close();
//		    
//		    System.out.print("size of data" + bout.size());
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RowsExceededException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (WriteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
//		File file = new File("c://Error.txt");
//		try {
//			FileInputStream fileInputStream = new FileInputStream(file);
//			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//			inputStreamReader.
//			
//			byte[] buffer = new byte[fileInputStream.available()];
//			fileInputStream.read(buffer);
//			System.out.print(new String(buffer));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		
		String strTemp1 = "ashish";
		
		String[] arr1 = "ashish".split(",");
		
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		
		
		
		HashMap<Object, Object> testmap = new HashMap<Object, Object>();
		testmap.put(1, "ashish");
		
		System.out.println("map value: " + testmap.get(1));

		String strTemp = "3ash";
		try
		{
			System.out.println(Integer.parseInt(strTemp));
		}
		catch (NumberFormatException nfe)
		{
			System.out.println (nfe.getMessage());
		}
	}
	
	public static void testAnonymous(Object test)
	{
	
	}
	
}

