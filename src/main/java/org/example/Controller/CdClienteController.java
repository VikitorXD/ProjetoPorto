package org.example.Controller;

import org.example.Model.Cliente;
import org.example.Services.ClienteService;

import java.util.Scanner;

public class CdClienteController {

    private ClienteService clienteService;

    public Scanner scanner;

    public CdClienteController(){
        this.clienteService = new ClienteService();
        this.scanner = new Scanner(System.in);
    }
    public void adicionandoCliente() {
        System.out.println("=== Adicionando Novo CLiente ===");

        System.out.println("Qual seu ID: ");
        Long id = scanner.nextLong();

        scanner.nextLine();

        //Pedindo o nome do cliente
        System.out.println("Informe seu Nome: ");
        String nome = scanner.nextLine();

        //Pedindo o CPF do cliente
        System.out.println("Informe seu CPF sem pontos ou traços: ");
        long cpf = scanner.nextLong();

        //Pedindo CNH do cliente
        System.out.println("Informe sua CNH sem pontos ou traços: ");
        long numCNH = scanner.nextLong();

        var novoCli = new Cliente(id, nome, cpf, numCNH);

        try {
            clienteService.save(novoCli);
            System.out.println("Cliente Adicionado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar cliente" + e.getMessage());
        }
    }

    public void excluirCliente() {
        System.out.println("=== Excluindo Cliente ===");

        System.out.println("Informe o ID do cliente que deseja excluir: ");
        Long id = scanner.nextLong();

        try {
            clienteService.delete(id);
            System.out.println("Cliente excluído com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao excluir o cliente: " + e.getMessage());
        }
    }
}
