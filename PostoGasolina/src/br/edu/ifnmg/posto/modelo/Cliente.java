
package br.edu.ifnmg.posto.modelo;

import java.util.Scanner;

public class Cliente {
    private static int totalCliente = 0;
    
    private String nome;
    private String endereco;
    private String cpf;
    private String contato;
    
    public Cliente(String nome, String endereco, String cpf, String contato){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.contato = contato;
        
        totalCliente++;
    }  
    
    public static int getTotalCliente(){
        return totalCliente; 
    
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getContato() {
        return contato;
    }
}
