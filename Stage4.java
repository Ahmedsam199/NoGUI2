import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Stage4 {
	String filePath = "Stage4.csv";// The file will be named according to the Selected Stage
    File file = new File(filePath);
	
   Stage4(){
try {
	 BufferedReader br = new BufferedReader(new FileReader(file));
     // get the first line
     // get the columns name from the first line
     // set columns name to the jtable model
     String firstLine = br.readLine().trim();
     String[] columnsName = {"Name","Address","PhoneNO","Course1","Course2","Course3"};
     /*
      * In this page will contain The Update And Delete And Add courses for each student
      * And add course Section in it 
      * 
      */
}catch(Exception E) {
System.out.print("Error");	
}
    }
}
