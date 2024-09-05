package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	//Dataprovider 1
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		String path="testData\\automation_loginData.xlsx";	//taking xl from testData
		ExcelUtility xlutil= new ExcelUtility(path);	//creating an object for excel utility
		
		int totalRows = xlutil.getRowCount("Sheet1");
		int totalCols= xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][]= new String[totalRows][totalCols];	//created for 2-D array which can store data
		
		for(int i=1; i<=totalRows;i++)	//1	//
		{
			for(int j=0;j<totalCols;j++)
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
		}
		return loginData; //returning 2 d array
	}
	
	//DataProider2
	
	//DataProvider3

}
