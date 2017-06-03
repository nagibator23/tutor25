package tutor25;

import java.awt.FlowLayout;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		Okna okna=new Okna();
		okna.setVisible(true);
		okna.setLayout(null);
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setBounds(24, 11, 374, 239);
		
		okna.add(scrollPane);
		JTextArea textArea=new JTextArea();
		textArea.setText("gfd,dsgdsgdsgsdgfdshsdklfgsdhfgsdhfklsdhflksfhskdlfhdsklfhdslkfhkldshfdslfhskldhfdslkfhdslkfhsdlkhfdslksfdhfkldskhfdhksdfhkdfshkdsfhlfsdhlhfkds");
		scrollPane.setViewportView(textArea);
		
	}

}
