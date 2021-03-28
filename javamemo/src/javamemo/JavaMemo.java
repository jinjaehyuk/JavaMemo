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
	
	private JTextArea jtaNote;
	
	
	public JavaMemo(Font initFont) {
		super("자바메모장");
		
		//而댄룷?꼳?듃 ?깮?꽦.
		JMenuBar jmb=new JMenuBar();
		
		JMenu jmFile=new JMenu("파일");
		JMenu jmFormat=new JMenu("글꼴 설");
		JMenu jmHelp=new JMenu("도움말");
		
		jmiNew=new JMenuItem("새글");
		jmiOpen=new JMenuItem("열기");
		jmiSave=new JMenuItem("저장");
		jmiNewSave=new JMenuItem("다른이름으로 저장"); 
		jmiEnd=new JMenuItem("닫기"); 
		jmiFont=new JMenuItem("글꼴설정"); 
		jmiHelp=new JMenuItem("도움말보기");
		
		jtaNote=new JTextArea();
		if( initFont != null) {
			jtaNote.setFont(initFont);
		}//end if
		
		JScrollPane jspNote=new JScrollPane( jtaNote ); 
				
		
		jmFile.add(jmiNew); 
		jmFile.addSeparator();
		jmFile.add(jmiOpen); 
		jmFile.add(jmiSave); 
		jmFile.add(jmiNewSave); 
		jmFile.addSeparator();
		jmFile.add(jmiEnd);
		
		jmFormat.add(jmiFont);
		
		jmHelp.add(jmiHelp);
		
		jmb.add( jmFile );
		jmb.add( jmFormat );
		jmb.add( jmHelp );
		
		setJMenuBar(jmb);
		
		add("Center",jspNote);
		
		JavaMemoEvt jme=new JavaMemoEvt(this);
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
		
		setBounds(100, 100, 800, 700);
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
