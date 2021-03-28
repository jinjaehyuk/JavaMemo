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
		//ê¸?ê¼? ? •ë³´ë?? ???¥?•œ ?ŒŒ?¼?—?„œ ê¸?ê¼´ì„ ?½?–´?“¤?—¬ ?””??¸ ê°ì²´ (JavaMemo)?— ? „?‹¬
		Font font = null;
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("/Users/jin/Desktop/dev/memo/memo.dat"));
			font = (Font)ois.readObject();
		}finally {
			//?Š¤?Š¸ë¦¼ì—?„œ ?—°ê²°ëŠê¸?
			if( ois != null) {ois.close();}//end if
			//?Š¤?Š¸ë¦¼ì—?„œ ?½?–´?“¤?´ê¸°ë?? ?‹¤?Œ¨?•˜?”?¼?„ ?—°ê²°ì? ë°˜ë“œ?‹œ ?Šê³?, ?‚¬?š©??—ê²? ?”„ë¡œê·¸?¨?? ? œê³µë˜?–´?•¼?•œ?‹¤.
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
