package edu.walter.modulo1;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        while (true) {

// TODO: Solicite ao usuário o valor do saque:
        double valorSaque = scanner.nextDouble();

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
        if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
        }if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
           
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
        }else {
            limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }    

// TODO: Informe que o saque foi realizado e mostre o limite restante:
              
            
        

// Fechamos o Scanner para evitar vazamento de recursos:
    }
}
}