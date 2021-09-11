package projetoap3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class menu extends JFrame implements ActionListener{
	
	frame Menu;
	JButton criararq;
	
	menu(){
	
	Menu = new frame();
	
	JLabel introtop = new JLabel("Bem-vindo ao Trabalho 4 de LP II!");
	introtop.setFont(new Font ("Arial", Font.PLAIN, 30));
	JPanel panel1 = new JPanel();
	panel1.setBounds(0, 50, 600, 50);
	panel1.setBackground(new Color(136, 229, 199));
	panel1.add(introtop);
	
	criararq = new JButton("Abrir aba nova");
	criararq.setBounds(50, 175, 500, 100);
	criararq.addActionListener(this);
	
	Menu.setLayout(null);
	Menu.add(panel1);
	Menu.add(criararq);
	Menu.setVisible(true);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == criararq) {
		abas aba = new abas();
		Menu.dispose();
	}
}

}
