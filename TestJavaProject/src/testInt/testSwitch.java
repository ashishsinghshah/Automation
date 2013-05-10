package testInt;

import java.text.DecimalFormat;
import java.util.List;





public class testSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		testSwitch();

	}
	
	
	public static void testSwitch()
	{
		
		int iTotal 		= 2500;
		int iPassed 	= 448;
		int iFailed 	= 552;
		int iBlocked 	= 323;
		int iSkipped 	= 677;
		int iAbandoned 	= 500;
		
//		if (userdo == null || userdo.getName() == null || suiteDefDo == null || suiteDefDo.getSuiteName() == null || lRunId <= 0)
//		{
//			return;
//		}
//		
//		TCLogDefDAO tcLogDefDAO = new TCLogDefDAO();
//		List<TCLogDefDo> lstTcLogDefDo = tcLogDefDAO.findByRunId(lRunId);
//		
//		if (lstTcLogDefDo != null && !lstTcLogDefDo.isEmpty())
//		{
//			iTotal = lstTcLogDefDo.size();
//			for (TCLogDefDo temp : lstTcLogDefDo)
//			{
//				if (temp.getStatus() == TestCaseExecutionStatusEnum.completed.getId())
//				{
//					if ("pass".equalsIgnoreCase(temp.getResult()))
//					{
//						iPassed++;
//					}
//					else if ("fail".equalsIgnoreCase(temp.getResult()))
//					{
//						iFailed++;
//					}
//				}
//				else if (temp.getStatus() == TestCaseExecutionStatusEnum.abandoned.getId())
//				{
//					iAbandoned++;
//				}
//				else if (temp.getStatus() == TestCaseExecutionStatusEnum.skipped.getId())
//				{
//					iSkipped++;
//				}
//				else if (temp.getStatus() == TestCaseExecutionStatusEnum.blocked.getId())
//				{
//					iBlocked++;
//				}
//			}
//		}
		
		DecimalFormat decimalFormat = new DecimalFormat("##.##");
		
		String msg = "<html><div style=\"width: 70%; height: 100%\">" +
				"<p align=\"left\" style=\"padding-left: 15px;color: #333333; font-size: 14px; font-weight:bold;\">Hi "+"Testsuite"+",</p>"+
				"USER" + " suite run has been completed" + "\n" +"Check Logs for Run Id: "+ 12345 + "\n";
		if (iTotal == iPassed)
		{
			msg += "<p>Run Status: <b style=\"color:green\">PASS</b></p>";
		}
		else
		{
			msg += "<p>Run Status: <b style=\"color:red\">FAIL</b></p>";;
		}
		msg += "<p>Summary of suite run:</p>" + 
				"<table border=\"1\">" +
				"<tr/>" +
				"<tr>" +
				"<th>" + "Total" + "</th>" +
				"<th>" + "Pass" + "</th>" +
				"<th>" + "Fail" + "</th>";
		if (iAbandoned > 0)
		{
			msg += "<th>" + "Abandoned" + "</th>";
		}
		if (iSkipped > 0)
		{
			msg += "<th>" + "Skipped" + "</th>";
		}
		if (iBlocked > 0)
		{
			msg += "<th>" + "Blocked" + "</th>";
		}
		
		msg += "</tr>" +
				"<tr>" +
				"<td>" + iTotal + "</td>" +
				"<td>" + iPassed + " ("+ decimalFormat.format((iPassed*100.0/iTotal)) + "%)" + "</td>" +
				"<td>" + iFailed + " ("+ decimalFormat.format((iFailed*100.0/iTotal)) + "%)" + "</td>"; 
		if (iAbandoned > 0)
		{
			msg += "<td>" + iAbandoned + " ("+ decimalFormat.format((iAbandoned*100.0/iTotal)) + "%)" + "</td>";
		}
		if (iSkipped > 0)
		{
			msg += "<td>" + iSkipped + " ("+ decimalFormat.format((iSkipped*100.0/iTotal)) + "%)" + "</td>";
		}
		if (iBlocked > 0)
		{
			msg += "<td>" + iBlocked + " ("+ decimalFormat.format((iBlocked*100.0/iTotal)) + "%)" + "</td>";
		}
		msg += "</tr>"+
				"</table>" +
				"<p align=\"left\" style=\"padding-left: 15px;color: #333333; font-size: 14px; font-weight:bold;\">-Automation</p>"+
				"</div>"+  
				"</html>";
		System.out.println(msg);
//		float as = Math.round(4/3);
//		
//		System.out.println("output of expression         " + as);
//		
//		double kilobytes = 1205.6358;
//		 
//		System.out.println("kilobytes : " + kilobytes);
//	 
//		double newKB = Math.round(kilobytes*100.0)/100.0;
//		System.out.println("kilobytes (Math.round) : " + newKB);
//	 
//		DecimalFormat df = new DecimalFormat("##.##");
//		System.out.println("kilobytes (DecimalFormat) : " + df.format(kilobytes));
//		
//		System.out.println("kilobytes (DecimalFormat) : " + df.format((400*100.0/435)) + "%");
//		
//		System.out.println("kilobytes (DecimalFormat) : " + Math.round((1*10000.0/3))/100.0 + "%");
		
//		switch(iCount)
//		{
//		case 1:
//			System.out.println("value of iCount " + iCount);
//			break;
//		case 2:
//			System.out.println("value of iCount " + iCount);
//			break;
//		default:
//			System.out.println("In side default");
//			//break;
//		case 3:
//			System.out.println("value of iCount " + iCount);
//			break;
//		case 4:
//			System.out.println("value of iCount " + iCount);
//			break;
		//default:
			//System.out.println("In side default");
			//break;
//		}
	}

}
