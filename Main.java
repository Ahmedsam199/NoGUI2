import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			String fname = null; // we will choose the fname according to the stage that will be choosed from GUI
		FileWriter fr=new FileWriter(fname,true);
		
		 BufferedWriter out = new BufferedWriter(fr);
		 // We used BufferWriter so it Wont delete the Previous Data
	StuInfo IO=new StuInfo();

	/* IO.name=name.getText();
	IO.Address=Address.getText();
	IO.PO=PO.getText(); 
	we will get the info from text Area Using Gui
	*/ 
	out.write(IO.name);
	out.write(",");
	out.write(IO.Address);
	out.write(",");
	out.write(IO.PO);
	out.write("\n");
	out.close();

	JOptionPane.showMessageDialog(null, "The Student have been added");
	System.out.println(IO.name);

	}catch (Exception E){
		try {
			System.out.print("error in writing");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}

}
