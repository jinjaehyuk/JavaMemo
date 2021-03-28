package javamemo;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


@SuppressWarnings("serial")
public class JavaMemo extends JFrame {

	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiNewSave, jmiEnd, jmiFont, jmiHelp;
	//?ƒˆê¸?, ?—´ê¸?,???¥, ?ƒˆ?´ë¦„ìœ¼ë¡?, ì¢…ë£Œ, ê¸?ê¼?, ?„??ë§?
	private JTextArea jtaNote;
	
	
	public JavaMemo(Font initFont) {
		super("ë©”ëª¨?¥");
		
		//ì»´í¬?„Œ?Š¸ ?ƒ?„±.
		JMenuBar jmb=new JMenuBar();
		
		JMenu jmFile=new JMenu("?ŒŒ?¼");
		JMenu jmFormat=new JMenu("?„œ?‹");
		JMenu jmHelp=new JMenu("?„??ë§?");
		
		jmiNew=new JMenuItem("?ƒˆê¸?");
		jmiOpen=new JMenuItem("?—´ê¸?");
		jmiSave=new JMenuItem("???¥");
		jmiNewSave=new JMenuItem("?ƒˆ?´ë¦„ìœ¼ë¡?"); 
		jmiEnd=new JMenuItem("ì¢…ë£Œ"); 
		jmiFont=new JMenuItem("ê¸?ê¼?"); 
		jmiHelp=new JMenuItem("ë©”ëª¨?¥? •ë³?");
		
		jtaNote=new JTextArea();
		//?½?–´?“¤?¸ ?°?Š¸ë¥? ?„¤? •
		if( initFont != null) {//?½?–´?“¤?¸ ?°?Š¸ê°? ì¡´ì¬?•œ?‹¤ë©? JTextArea?— Fontë¥? ?„¤? •
			jtaNote.setFont(initFont);
		}//end if
		
		JScrollPane jspNote=new JScrollPane( jtaNote );//?Š¤?¬ë¡¤ë°”ê°? ?—†?Š” ê°ì²´?— ?Š¤?¬ë¡¤ë°”ë¥? ë¶™ì¸?‹¤.  
				
		//ë°°ì¹˜.
		//ë©”ë‰´?•„?´?…œ->ë©”ë‰´ ë°°ì¹˜ ( êµ¬ë¶„?„  ?•„?š” : addSeparator() )
		jmFile.add(jmiNew); //?ƒˆê¸?
		jmFile.addSeparator();
		jmFile.add(jmiOpen); //?—´ê¸?
		jmFile.add(jmiSave); //???¥
		jmFile.add(jmiNewSave); //?ƒˆ?´ë¦?
		jmFile.addSeparator();
		jmFile.add(jmiEnd); //?‹«ê¸?
		
		jmFormat.add(jmiFont); //?„œ?‹
		
		jmHelp.add(jmiHelp);//?„??ë§?
		
		//ë©”ë‰´->ë©”ë‰´ë°? ë°°ì¹˜
		jmb.add( jmFile );
		jmb.add( jmFormat );
		jmb.add( jmHelp );
		
		//ë©”ë‰´ë°? ?”„? ˆ?„ ë°°ì¹˜
		setJMenuBar(jmb);
		
		//JTextAreaë¥? Frame?— ë°°ì¹˜
		add("Center",jspNote);
		
		//?´ë²¤íŠ¸ ì²˜ë¦¬ ?´?˜?Š¤?˜ ê°ì²´?ƒ?„±.
		JavaMemoEvt jme=new JavaMemoEvt(this);
//		//ì»´í¬?„Œ?Š¸ë¥? ?´ë²¤íŠ¸?— ?“±ë¡í•˜ê³?, ?´ë²¤íŠ¸ ë°œìƒ ?‹œ ì²˜ë¦¬?•  ê°ì²´ ?„¤? •.		
		jmiNew.addActionListener( jme );
		jmiOpen.addActionListener( jme );
		jmiSave.addActionListener( jme );
		jmiNewSave.addActionListener( jme );
		jmiEnd.addActionListener( jme );
		
		jmiFont.addActionListener( jme );
//
//		jmiHelp.addActionListener( jme );
//		
//		addWindowListener( jme );
		
		//?œˆ?„?š° ?¬ê¸°ì„¤? •.
		setBounds(100, 100, 800, 700);
		//ê°??‹œ?™”
		setVisible(true);
		
	}//JavaMemo

	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiNewSave() {
		return jmiNewSave;
	}

	public JMenuItem getJmiEnd() {
		return jmiEnd;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiHelp() {
		return jmiHelp;
	}

	public JTextArea getJtaNote() {
		return jtaNote;
	}
	
	
}//class
