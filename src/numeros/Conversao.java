package numeros;

public class Conversao {
	private String romanos;
	
	public String converte(int numero){
		
		if(validaNumero(numero)){
			
			if(numero>0 && numero<=10){
				romanos=unidade(numero);
			}
			
			else if(numero>10&&numero<=100){
				romanos=dezenas(numero);
			}
			
			else if(numero>100 && numero<=1000){
				romanos=centenas(numero);
			}
		}
		
		else{
			throw new RuntimeException("Numero Invalido");
		}
		
		return romanos;
	}

	private String unidade(int numero) {
		romanos="";
		String unidade="I";
		if(numero<=5){
			if(numero<=3){
				for(int i=0;i<numero;i++){
					romanos=romanos.concat(unidade);
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
		return romanos;
	}
	
	
	//falta acrescentar para 100
	private String dezenas(int numero){
		romanos="";
		String unidade="X";
		String dezena;
		if(String.valueOf(numero).length()==2){
			dezena=String.valueOf((String.valueOf(numero)).charAt(0));
		}
		else{
			dezena=String.valueOf((String.valueOf(numero)).substring(0, 2));
		}

		String unid=String.valueOf((String.valueOf(numero)).charAt(1));
		numero=Integer.parseInt(dezena);
		
		if(numero<=5){
			if(numero<=3){
				for(int i=0;i<numero;i++){
					romanos=romanos.concat(unidade);
				}
			}
			else{
				romanos="L";
				for(int i=0;i<5-numero;i++){
					romanos=unidade.concat(romanos);
				}
			}
		}
		else if(numero<=10){
			romanos="L";
			if(numero<=8){
				for(int i=0;i<numero-5;i++){
					romanos=romanos.concat(unidade);
				}
			}
			else{
				romanos="C";
				for(int i=0;i<10-numero;i++){
					romanos=unidade.concat(romanos);
				}
			}
		}
		
		if(Integer.parseInt(unid)==0){
			return romanos;
		}
		return romanos.concat(unidade(Integer.parseInt(unid)));
	}
	
	private String centenas(int numero){
		romanos="";
		String unidade="C";
		String unid;
		String dezena;
		if(String.valueOf(numero).length()==3){
			dezena=String.valueOf((String.valueOf(numero)).charAt(0));
			unid=String.valueOf((String.valueOf(numero)).substring(1, 3));
		}
		else{
			dezena=String.valueOf((String.valueOf(numero)).substring(0, 2));
			unid=String.valueOf((String.valueOf(numero)).substring(2, 4));
			
		}
		
		System.out.println("dezena: "+dezena);
		System.out.println("unidade: "+unid);

		
		numero=Integer.parseInt(dezena);
		
		if(numero<=5){
			if(numero<=3){
				for(int i=0;i<numero;i++){
					romanos=romanos.concat(unidade);
				}
			}
			else{
				romanos="D";
				for(int i=0;i<5-numero;i++){
					romanos=unidade.concat(romanos);
				}
			}
		}
		else if(numero<=10){
			romanos="D";
			if(numero<=8){
				for(int i=0;i<numero-5;i++){
					romanos=romanos.concat(unidade);
				}
			}
			else{
				romanos="M";
				for(int i=0;i<10-numero;i++){
					romanos=unidade.concat(romanos);
				}
			}
		}
		
		if(Integer.parseInt(unid)==0){
			return romanos;
		}
		
		return romanos.concat(dezenas(Integer.parseInt(unid)));
	}
	
	
	private boolean validaNumero(int numero){
		if(numero<=0){
			return false;
		}
		return true;
	}

	
}
