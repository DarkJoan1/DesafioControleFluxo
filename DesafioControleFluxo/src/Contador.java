import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		
        Scanner terminal = new Scanner(System.in);
		int parametroUm;
        int parametroDois;
        
        System.out.println("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt();
    
		try {
		
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
		
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo");
        }
		int contagem = parametroDois - parametroUm;
		
        for(int i = 0; i <= contagem; i++){
            System.out.println(parametroUm + 1);
        }
	}
}
class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException(String message){
            super(message);
        }
}

