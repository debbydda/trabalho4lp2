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
	
	JButton criararq, abrirarq;
	
	menu(){
	
	frame Menu = new frame();
	
	JLabel introtop = new JLabel("Bem-vindo ao Trabalho 4 de LP II!");
	introtop.setFont(new Font ("Arial", Font.PLAIN, 30));
	JPanel panel1 = new JPanel();
	panel1.setBounds(0, 50, 600, 50);
	panel1.setBackground(new Color(136, 229, 199));
	panel1.add(introtop);
	
	JLabel intromid = new JLabel("Escolha qual ação você quer fazer.");
	intromid.setFont(new Font ("Arial", Font.PLAIN, 20));
	JPanel panel2 = new JPanel();
	panel2.setBounds(0, 100, 600, 50);
	panel2.setBackground(new Color(136, 229, 199));
	panel2.add(intromid);
	
	criararq = new JButton("Criar novo arquivo de texto");
	criararq.setBounds(50, 175, 500, 100);
	criararq.addActionListener(this);
	
	abrirarq = new JButton("Abrir arquivo de texto");
	abrirarq.setBounds(50, 300, 500, 100);
	abrirarq.addActionListener(this);
	
	Menu.setLayout(null);
	Menu.add(panel1);
	Menu.add(panel2);
	Menu.add(criararq);
	Menu.add(abrirarq);
	Menu.setVisible(true);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == criararq) {
		editor novo = new editor();
	}
	if(e.getSource() == abrirarq) {
		System.out.println("Abrir!");
	}
}

}
