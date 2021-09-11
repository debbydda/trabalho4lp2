package projetoap3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class editor extends JPanel implements ActionListener {
	
	JTextArea area;
	JScrollPane pane;
	JMenuItem abrir;
	JMenuItem salvarc;
	JMenuItem salvar;
	JMenuItem fechar;
	File atual;

	editor(){
		frame Editor = new frame();
		Editor.setLocationRelativeTo(null);

		area = new JTextArea(); 
		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		pane = new JScrollPane(area);
		pane.setPreferredSize(new Dimension(500, 450));
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		JPanel panel = new JPanel();
		panel.setBounds(50, 15, 500, 425);
		panel.add(pane);

		JMenuBar settings = new JMenuBar();
		JMenu arquivo = new JMenu("Arquivo");
		abrir = new JMenuItem("Abrir");
		salvarc = new JMenuItem("Salvar Como");
		salvar = new JMenuItem("Salvar");
		fechar = new JMenuItem("Fechar");

		abrir.addActionListener(this);
		salvarc.addActionListener(this);
		salvar.addActionListener(this);
		fechar.addActionListener(this);

		arquivo.add(abrir);
		arquivo.add(salvarc);
		arquivo.add(salvar);
		arquivo.add(fechar);
		settings.add(arquivo);
		
		Editor.setLayout(null);
		Editor.add(panel);
		Editor.setJMenuBar(settings);
		Editor.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == abrir){
			JFileChooser fc = new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "txt");
			fc.setFileFilter(filter);
			int retorno = fc.showOpenDialog(null);

			if(retorno == JFileChooser.APPROVE_OPTION){
				File arquivo = new File(fc.getSelectedFile().getAbsolutePath());
				Scanner entrada = null;
				atual = arquivo;
				try {
					entrada = new Scanner(arquivo);
					if(arquivo.isFile()){
						while(entrada.hasNextLine()){
							String string = entrada.nextLine() + "\n";
							area.append(string);
						}
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				finally{
					entrada.close();
				}
			}

		}

		if (e.getSource() == salvarc){
			JFileChooser fc = new JFileChooser();
			fc.setCurrentDirectory(new File("."));
			
			int retorno = fc.showSaveDialog(null);

			if(retorno == JFileChooser.APPROVE_OPTION){
				File arquivo;
				PrintWriter saida = null;
				arquivo = new File(fc.getSelectedFile().getAbsolutePath());
				try{
					saida = new PrintWriter(arquivo);
					saida.println(area.getText());
				}
				catch (FileNotFoundException e1){
					e1.printStackTrace();
				}
				finally{
					saida.close();
				}
			}
		}

		if (e.getSource() == salvar){
				File arquivo;
				PrintWriter saida = null;
				arquivo = atual;
				try{
					saida = new PrintWriter(arquivo);
					saida.println(area.getText());
				}
				catch (FileNotFoundException e1){
					e1.printStackTrace();
				}
				finally{
					saida.close();
				}
		}
		if (e.getSource() == fechar){
			editor.dispose();
		}
	}
}
