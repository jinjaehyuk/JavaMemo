package javamemo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class MemoFontEvt implements ActionListener, ItemListener, ListSelectionListener{

	private MemoFont mf;
	private String[] formatArr;
	private String[] styleArr;
	
	private JList<String> jlFormat, jlStyle, jlSize;
	
	public MemoFontEvt(MemoFont mf ) {
		this.mf = mf;
		formatArr = new String[] {"Dialog","Monospaced","Serif","SansSerif"};
		styleArr = new String[] {"ë³´í†µ","êµµê²Œ","ê¸°ìš¸?ž„ê¼?","êµµì? ê¸°ìš¸?ž„ê¼?"};
		
		DefaultListModel<String> dlmFormat = mf.getDlmFormat();
		DefaultListModel<String> dlmStyle = mf. getDlmStyle();
		DefaultListModel<String> dlmSize = mf.getDlmSize();
		
		//ê¸?ê¼? ?„¤? •
		for(int i =0; i < formatArr.length; i++) {
			dlmFormat.addElement(formatArr[i]);
		}//end for
		//ê¸?ê¼? ?Š¤???¼
		for(int i = 0; i < styleArr.length; i++) {
			dlmStyle.addElement(styleArr[i]);
		}//end for
		
		//ë¯¸ë¦¬ë³´ê¸°
		mf.getChPreview().add("?•œê¸?");
		mf.getChPreview().add("?˜?–´");
		//?‚¬?´ì¦?
		dlmSize.addElement(String.valueOf("7"));
		dlmSize.addElement(String.valueOf("8"));
		dlmSize.addElement(String.valueOf("9"));
		for(int i = 10; i<81; i+=2) {
			dlmSize.addElement(String.valueOf(i));
		}//end for
		
		jlFormat = mf.getJlFormat();
		jlStyle = mf.getJlStyle();
		jlSize = mf.getJlSize();
		
		
	}//MemoFontEvt
	@Override
	public void itemStateChanged(ItemEvent ie) {
		if(ie.getItem().equals("?•œê¸?")) {
			mf.getJlbPreview().setText("ê°??‚˜?‹¤AaBbYyZz");
		}//end if
		if(ie.getItem().equals("?˜?–´")) {
			mf.getJlbPreview().setText("AaBbCc...Zz");
		}
	}//itemStateChanged

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == mf.getJbtnConfirm()) {
			
		}
		mf.dispose();
	}//actionPerformed
	@Override
	public void valueChanged(ListSelectionEvent lse) {
		Font previewFont = mf.getJlbPreview().getFont();
		String fontFamily = previewFont.getFamily();
		int fontStyle = previewFont.getStyle();
		int fontSize = previewFont.getSize();
		
		if(lse.getValueIsAdjusting()) {
			if(lse.getSource() == jlFormat) {
				mf.getJtfFormat().setText(jlFormat.getSelectedValue());
				fontFamily = jlFormat.getSelectedValue();
			}//end if
			
			if(lse.getSource() == jlStyle) {
				mf.getJtfStyle().setText(jlStyle.getSelectedValue());
				fontStyle = jlStyle.getSelectedIndex();
			}//end if
			
			if(lse.getSource() == jlSize) {
				mf.getJtfSize().setText(jlSize.getSelectedValue());
				fontSize = jlSize.getSelectedIndex();
			}//end if
			
			Font tempFont = new Font(fontFamily, fontStyle, fontSize);
			mf.getJlbPreview().setFont(tempFont);
			
			
		}//end if
		
	}

}
