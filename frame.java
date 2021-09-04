package projetoap3;

import java.awt.Color;
import javax.swing.JFrame;

public class frame extends JFrame{
	frame(){
		this.setTitle("Projeto de LP II");
		this.setSize(600,500);
		this.getContentPane().setBackground(new Color (136, 229, 199));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
