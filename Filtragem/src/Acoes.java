
import javax.swing.table.DefaultTableModel;

public class Acoes {

	// Retornar um JTable
	public DefaultTableModel listar(String nome) {

		// DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Idade");
		
		//CondicioANAL caso não informe o nome
		if(nome.equals("Selecione o nome de um desses putos")) {

			//Laço
			for (int indice = 0; indice < Pessoa.dados.size(); indice++) {
				modelo.addRow(new Object[] { 
						Pessoa.dados.get(indice).getNome(), 
						Pessoa.dados.get(indice).getIdade()
				});
	
			}
		
		//Caso informe o nome
		}else {
		
			//Laço
			for (int indice = 0; indice < Pessoa.dados.size(); indice++) {
				
				//Verificar se o nome é igual ao que está selecionado
				if(String.valueOf(Pessoa.dados.get(indice).getNome()).equals(nome)) {
					
					//Adicionar nova linha
					modelo.addRow(new Object[] { 
							Pessoa.dados.get(indice).getNome(), 
							Pessoa.dados.get(indice).getIdade()
					});
				}
	
			}
			
			
		}

		// Retorno
		return modelo;

	}

}
