import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulario {

	public Formulario() {
		
		Acoes a = new Acoes();
		
		JFrame f = new JFrame();
		f.setSize(334, 300);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		JTable tabela = new JTable();
		tabela.setModel(a.listar("Selecione o nome de um desses putos"));
		
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(10, 50, 300, 200);
		
		JComboBox<String> nomes = new JComboBox<>();
		nomes.setBounds(10, 10, 300, 20);
		nomes.addItem("Selecione o nome de um desses putos");
		nomes.addItem("Soraia Carioca");
		nomes.addItem("Monica Mattos");
		nomes.addItem("Kid B");
		
		nomes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tabela.setModel(a.listar(nomes.getSelectedItem().toString()));
			}
		});
		
	
		
		
		
		f.add(nomes);
		f.add(barra);
		
		f.setVisible(true);
		
	}
	
}
