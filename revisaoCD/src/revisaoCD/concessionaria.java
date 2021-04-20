package revisaoCD;
import java.util.List;
import java.util.ArrayList;

public class concessionaria {
	List<Carro> Carros = new ArrayList<Carro>();

//	public concessionaria(ArrayList Carros) {
//		this.Carros=Carros;
//	}
//	inserir, procurar, remover;
	public ArrayList  getInserir(Carro novoCarros) {
		Carro novoCarro = null;
		Carros.add(novoCarro);
		return (ArrayList) Carros;
	}
	public Carro procurar(String modelo) {
		boolean controle  = false;
		int indiceObjetoSelecionado = 0;
		
		for(int i=0; i < Carros.size();i++) {
			if(Carros.get(i).getModelo().equalsIgnoreCase(modelo)){
				indiceObjetoSelecionado = i;
				
			}
		}
		if(controle) {
			return Carros.get(indiceObjetoSelecionado);
		}else {
		return null;
		}
		
	}
//	public ArrayList getProcurar() {
//		return(ArrayList)Carros;
//	}
//	public ArrayList getRemover() {
//		return (ArrayList) Carros;
//	}
}
