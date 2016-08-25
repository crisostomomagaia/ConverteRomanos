package numeros;

public class Conversao {
	private String romanos;
	
	public String converteUnidades(int numero){
		romanos="";
		String unidade="I";
		
		if(validaNumero(numero)){
			if(numero<=5){
				if(numero<=3){
					for(int i=0;i<numero;i++){
						romanos=romanos.concat("I");
					}
				}
				else{
					romanos="V";
					for(int i=0;i<5-numero;i++){
						romanos=unidade.concat(romanos);
					}
				}
			}
			else if(numero<=10){
				romanos="V";
				if(numero<=8){
					for(int i=0;i<numero-5;i++){
						romanos=romanos.concat("I");
					}
				}
				else{
					romanos="X";
					for(int i=0;i<10-numero;i++){
						romanos=unidade.concat(romanos);
					}
				}
			}
		}else{
			throw new RuntimeException("Numero Invalido");
		}
		
		return romanos;
	}
	
	private boolean validaNumero(int numero){
		if(numero<=0){
			return false;
		}
		return true;
	}

	
}
