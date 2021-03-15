import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ReadExcel {

   
    static String currentDirectory = System.getProperty("user.dir");
    private static final String FILE_NAME = currentDirectory + "\\MyFirstExcel.xlsx";
    /**
     * @param args
     */
    public  static void main (String ...args){
    	ArrayList<String> commandList=new ArrayList<String>();
    	
    	HashMap< String,String> hmap = new HashMap<String,String>();
        try {
        	System.out.println(currentDirectory);
        	
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                int num = currentRow.getRowNum();
                //System.out.println(num);
                if (num ==0)continue;
                
                /*Hmap code starts*/
                
                
                DataFormatter formatter = new DataFormatter();
                hmap.put(formatter.formatCellValue(currentRow.getCell(0)),formatter.formatCellValue(currentRow.getCell(1)))  ;
                
                
                /*Hmap read ends*/
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
                    if (currentCell.getCellType() == currentCell.CELL_TYPE_STRING) {
                    	commandList.add(currentCell.getStringCellValue());
                        System.out.print(currentCell.getStringCellValue() + "--");
                    } else if (currentCell.getCellType() == currentCell.CELL_TYPE_NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue() + "--");
                    }

                }
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
System.out.println(hmap);
//        return commandList;
    }
}