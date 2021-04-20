package revisaoCD;

import java.util.ArrayList;

public class principal {


	public static void main(String[] args) {
		concessionaria JM = new concessionaria();
		Carro carro1 = new Carro(null, null, null, 0, false, 0);
			Carro carro2 = new Carro(null, null, null, 0, false, 0);
				Carro carro3 = new Carro(null, null, null, 0, false, 0);
					Carro carro4 = new Carro(null, null, null, 0, false, 0);
						Carro carro5 = new Carro(null, null, null, 0, false, 0);
						
						JM.getInserir(carro1);
						JM.getInserir(carro2);
						JM.getInserir(carro3);
						JM.getInserir(carro4);
						JM.getInserir(carro5);
						
					if(JM.procurar("fusca") != null) {
						Carro objetoCarro = JM.procurar("Fusca");
						System.out.print(objetoCarro.getAno());
					}

			
	}

}
