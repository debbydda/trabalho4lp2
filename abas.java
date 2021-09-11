package projetoap3;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;


public class abas extends JFrame{
	JTabbedPane abas = new JTabbedPane();
	editor editor1 = new editor();
	editor editor2 = new editor();
	editor editor3 = new editor();
	JPanel tela = new JPanel();

	public frameComAbas(){
		present();
		abas.add("Aba 1", editor1);
		abas.add("Aba 2", editor2);
		abas.add("Aba 3", editor3);
	}

	public void present(){
		setTitle("Janela");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

}


