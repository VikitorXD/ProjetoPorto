package org.example.Menu;

import org.example.Controller.CdClienteController;

import java.util.Scanner;

public class MeuMenu {
    private CdClienteController cdClienteController;

    private Scanner scanner;

    public MeuMenu(){
        this.cdClienteController = new CdClienteController();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu(){
        boolean continuar = true;

        while (continuar){
            System.out.println("===Bem vindo ao Zé do Guincho===");
            System.out.println("1.cadastro");
            System.out.println("2.Excluir cadastro");
            System.out.println("3.sair");

            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc){
                case 1:
                    cdClienteController.adicionandoCliente();
                    break;
                case 2:
                    cdClienteController.excluirCliente();
                    break;
                case 3:
                    System.out.println("saindo");
                    continuar = false;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
