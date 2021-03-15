import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import oracle.apps.fnd.cp.request.LogFile;
import oracle.apps.fnd.cp.request.OutFile;

public class FileDetails {

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	//private static final String FILE_NAME = "/interface/j_sera01/DSERAI/Ejaz/Rishi/Files/firstCSV.csv";
	
	private static final String FILE_NAME = "C:\\Users\\rpathania\\eclipse-workspace\\firstCSV1.csv";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Date currentDate = new Date();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
        System.out.println(dateFormat.format(currentDate));

        // convert date to calendar
        
       // c.setTime(currentDate);
        HashMap< String,String> navAndDays = new HashMap<String,String>();
		List<ArrayList<File>> filesToBeDeleted = new ArrayList<ArrayList<File>>();
		String dirName = "C:\\Users\\rpathania\\eclipse-workspace\\UnixConnect";
		File dirPath = new File("C:\\Users\\rpathania\\eclipse-workspace\\UnixConnect");
		
		navAndDays = readStrSplit(FILE_NAME);
		navAndDays.remove("Path");
		System.out.println(navAndDays);
		Iterator<Entry<String, String>> it = navAndDays.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry mapElement = (Map.Entry)it.next(); 
			try {
				filesToBeDeleted.add(listf(mapElement.getKey().toString(),Integer.parseInt((String) mapElement.getValue()) ));
				//filesToBeDeleted = listf(mapElement.getKey().toString(),Integer.parseInt((String) mapElement.getValue()) );
			}
			catch(Exception e) {
				System.out.println("Exception reading "+ mapElement.getKey().toString());

			}
		}
	   
	      
	     // listf(dirName,3);
	      
	      System.out.println(filesToBeDeleted);
	      
	      
	      for(ArrayList<File> al: filesToBeDeleted) {
	    	  
	     for (File fl : al) {
	    	 if (fl.isDirectory())continue;
	    	
	    	 System.out.println("Deleting file = "+fl);
	    	 try {
	    //	fl.delete();
	    	 }
	    	 catch(Exception ex) {
	    		 System.out.println("File not deleted = "+fl);
	    	 }
	     }
	
	}
	}
	
	 public static ArrayList<File> listf(String directoryName, int days) {
	        File directory = new File(directoryName);

	        ArrayList<File> resultList = new ArrayList<File>();
	        String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	        // get all the files from a directory
	        File[] fList = directory.listFiles();
	        resultList.addAll(Arrays.asList(fList));
	        for (File file : fList) {
	        	try {
	        		 System.out.println("Target = "+ simpleDateFormat.format(getTargetDate(days)));
	        		 Date targetDate = simpleDateFormat.parse(simpleDateFormat.format(getTargetDate(days)));
	        		 Date lastModified =simpleDateFormat.parse(simpleDateFormat.format(new Date(file.lastModified()))); 
	        		 System.out.println("Last Modified = "+lastModified);
	    	    	 System.out.println(targetDate.compareTo(lastModified));
	    	    //	 System.out.println(simpleDateFormat.format(getTargetDate(days)).compareTo(new Date(file.lastModified())));
	            if (file.isFile() &&  targetDate.compareTo(lastModified) < 0 ) {
	            	resultList.remove(file);
	                System.out.println(file.getAbsolutePath());
	            	
	            } else if (file.isDirectory()) {
	                resultList.addAll(listf(file.getAbsolutePath(),days));
	            }
	        }
	        	catch(Exception e) {
		        	
		        }
		        
	        }
	        //System.out.println(fList);
	        return resultList;
	    }
	 
	 public static Date getTargetDate(int days) {
		 
		 Calendar c = Calendar.getInstance();
	        
	       // c.setTime(currentDate);
	        Date currDate = new Date();
	        c.setTime(currDate);
	        c.add(Calendar.DATE,-days);
	        return c.getTime();
		 
	 }
	 
	 private static HashMap<String,String> readStrSplit(String flName) {

			String line = "";  
			String splitBy = ",";
			HashMap< String,String> hmap = new HashMap<String,String>();
			try   
			{  

				//parsing a CSV file into BufferedReader class constructor 
				int i=0;
				BufferedReader br = new BufferedReader(new FileReader(flName));  
				while ((line = br.readLine()) != null)   //returns a Boolean value  
				{  
					//System.out.println("in while");
					
					try {
					String[] arr = line.split(splitBy); 

					hmap.put(arr[0],arr[1].trim());
					}
					catch(Exception ee) {
						System.out.println("Exception while reading the row: " +i);
												
					}
					i++;
				}

				// use comma as separator  
				//System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");  
			}

			catch (IOException e)   
			{  
				e.printStackTrace();  
			}

			return hmap;

		}
	 
	 public static ArrayList<File> listfl(String directoryName, int days) {
	        File directory = new File(directoryName);

	        ArrayList<File> resultList = new ArrayList<File>();
	        String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	        // get all the files from a directory
	        File[] fList = directory.listFiles();
	        resultList.addAll(Arrays.asList(fList));
	        for (File file : fList) {
	        	try {
	        	//	 System.out.println("Target = "+ simpleDateFormat.format(getTargetDate(days)));
	        		 Date targetDate = simpleDateFormat.parse(simpleDateFormat.format(getTargetDate(days)));
	        		 Date lastModified =simpleDateFormat.parse(simpleDateFormat.format(new Date(file.lastModified()))); 
	        //		 System.out.println("Last Modified = "+lastModified);
	    	  //  	 System.out.println(targetDate.compareTo(lastModified));
	    	    //	 System.out.println(simpleDateFormat.format(getTargetDate(days)).compareTo(new Date(file.lastModified())));
	            if ((file.isFile() &&  targetDate.compareTo(lastModified) < 0) || file.isDirectory() ) {
	            	resultList.remove(file);
	                System.out.println("Removed = " +file.getAbsolutePath());
	            	
	            } 
	            /*else if (file.isDirectory()) {
	                resultList.addAll(listf(file.getAbsolutePath(),days));
	            }*/
	        }
	        	catch(Exception e) {
		        	
		        }
		        
	        }
	        //System.out.println(fList);
	        return resultList;
	    }

}
