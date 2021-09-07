package projetoap3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class editor extends JFrame {
	
	JTextArea area;
	JScrollPane pane;

	editor(){
		frame Editor = new frame();
		Editor.setLocationRelativeTo(null);

		JPanel settings = new JPanel();
		settings.setBounds(0, 50, 500, 20);
		settings.setBackground(new Color(136, 229, 199));

		area = new JTextArea(); 
		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		pane = new JScrollPane(area);
		pane.add(settings);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		Editor.add(panel);
		Editor.setVisible(true);
	}

}
