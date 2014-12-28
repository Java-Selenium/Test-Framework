package BaseApi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by mrahman on 12/29/14.
 */
public class DataReader {

    int numberOfRows, numberOfColumn;
    public String[][] read(String filename){
        String [][] dataContainer;
        File file = new File(filename);
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.getSheetAt(0);
        numberOfRows = sheet.getLastRowNum();
        numberOfColumn = sheet.getRow(0).getLastCellNum();
        dataContainer = new String[numberOfColumn][numberOfRows];

        for(int i=0; i<dataContainer.length; i++){
            HSSFRow row = sheet.getRow(i);
            for(int j=0; j<numberOfColumn; j++){
                HSSFCell cell = row.getCell(j);
                String cellData = convertCell(cell);
                dataContainer[i][j] = cellData;
            }
        }

        return dataContainer;
    }


    public String convertCell(HSSFCell cell){
        Object data = null;
        int dataType = cell.getCellType();
        switch (dataType){
            case HSSFCell.CELL_TYPE_NUMERIC:
                data = cell.getNumericCellValue();
                break;
            case HSSFCell.CELL_TYPE_STRING:
                data = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                data = cell.getBooleanCellValue();
                break;
        }

       return data.toString();
    }


}
