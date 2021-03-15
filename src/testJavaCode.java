import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class testJavaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[][] arr = { { 1, 2 }, { 3, 4 } ,{5,6}}; 
  
        System.out.println("length="+arr.length + "arr[0].length="+ arr[0].length + "arr[0][]");
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print(arr[i][j] + " "); 
            } 
  
            System.out.println(); 
        } 
        
        String str = "Excel Training - Basic(Starts 21/09/2018)";
        
     //   System.out.print(str.substring(str.length() -11 , str.length()-1)); 
        
        System.out.println("28/09/2018".substring(0,10));
        String str1 = "su from c_rpatha ";

        System.out.println(str1.contains("su"));
        
        student s1 = new student(1,"Rhh");
        s1.setRoll(1);
        s1.setName("Rishi");
        student s2 = new student(1,"Rhh");
        s2.setRoll(1);
        s2.setName("Rishi");
        
        
        
        
        Set set = new HashSet<student>();
        
        set.add(s1);
        set.add(s2);
        
        System.out.println(set);
        
        System.out.println(s1.equals(s2));
        
        
        String str3 = new String("GEEKS"); 
        String str2 = new String("GEEKS"); 
        
        
        String xx="GEEKS";
        
        String yy="GEEKS";
        System.out.println(yy==xx);
        
        System.out.println(str3==str2);
        System.out.println(str3.equals(str2));
        
        System.out.println("))))))))))))))))))))))))))");

        System.out.println(Character.getNumericValue('@'));
        
        File file = new File(System.getProperty("user.dir") +"\\first.txt");
        
        try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
       // String command = "echo %USERNAME%"; 
   /*     String[] command = { "sh", "-c", "echo %USERNAME%" }; 
        
        Runtime run = Runtime.getRuntime(); 
        try {
			Process p= run.exec(command);
			BufferedReader stdInput = new BufferedReader(new 
				     InputStreamReader(p.getInputStream()));
			BufferedReader stdError = new BufferedReader(new 
				     InputStreamReader(p.getErrorStream()));
			
			System.out.println("Here is the standard output of the command:\n");
			String s = null;
			while ((s = stdInput.readLine()) != null) {
			    System.out.println(s);
			}

			// Read any errors from the attempted command
			System.out.println("Here is the standard error of the command (if any):\n");
			while ((s = stdError.readLine()) != null) {
			    System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        */
        
        
  /*      for (int i = 0;i<str.length();i++)
        System.out.println(Character.toLowerCase((str.charAt(i)))); 
*/
	}

}
