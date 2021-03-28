package javamemo;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author user
 */
public class RunJavaMemo {
	
	public RunJavaMemo() throws FileNotFoundException, IOException, ClassNotFoundException {
		Font font = null;
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("/Users/jin/Desktop/dev/memo/memo.dat"));
			font = (Font)ois.readObject();
		}finally {
			if( ois != null) {ois.close();}//end if
			new JavaMemo( font );
		}
		
	}//RunJavaMemo

	public static void main(String[] args) {
		
		try {
			new RunJavaMemo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}//class
