package javamemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JavaMemoEvt implements ActionListener, ItemListener{
	
	private JavaMemo jm;
	
	public JavaMemoEvt(JavaMemo jm ) {
		this.jm = jm;
	}//JavaMemoEvt
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == jm.getJmiNew()) {
			newMemo();
		}//end if
		if(ae.getSource() == jm.getJmiOpen()) {
			openMemo();
		}//end if
		if(ae.getSource() == jm.getJmiSave()) {
			saveMemo();
		}//end if
		if(ae.getSource() == jm.getJmiNewSave()) {
			newSaveMemo();
		}//end if
		if(ae.getSource() == jm.getJmiEnd()) {
			endMemo();
		}//end if
		
		
		if(ae.getSource() == jm.getJmiFont()) {
			memoFont();
		}//end if
		
	}//actionPerformed

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}//itemStateChanged
	
	public void newMemo() {

		jm.getJtaNote().setText("");
	}//newMemo
	
	public void openMemo() {
		
	}//openMemp
	
	public void saveMemo() {
		
	}//saveMemo
	
	public void newSaveMemo() {
		
	}//newSaveMemo
	
	public void endMemo() {
		
	}//endMemo
	
	public void memoFont() {
		new MemoFont(jm);
	}//memoFont
}//class
