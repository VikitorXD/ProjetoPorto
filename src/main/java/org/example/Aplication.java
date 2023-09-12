package org.example;

import org.example.Infraestructure.OracleDatabaseSetup;
import org.example.Menu.MeuMenu;

public class Aplication {
    public static void main(String[] args) {

        //CASO SEJA SUA PRIMEIRA VEZ USANDO O PROJETO RETIRE OS COMENTARIOS DA LINHA 11 E 12;
        //APOS USAR PELA PRIMEIRA VEZ E FOR USAR PELA SEGUNDA ADICIONE AS DUAS // ONDE ESTAVAM NO COMEÇO
        /*================================================================================================*/
        //OracleDatabaseSetup tabela = new OracleDatabaseSetup();
        //tabela.createTales();

        MeuMenu minu = new MeuMenu();
        minu.exibirMenu();
    }
}
