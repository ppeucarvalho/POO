package br.edu.ifnmg.posto.modelo; 

//import java.util.Scanner;

public class Estacionamento extends Servico{
   
    private int chegada;
    private int saida;
        
    public Estacionamento(int chegada, int saida){
                
        this.chegada = chegada;
        this.saida = saida;
    }
    
    public void calculoEstacinamento(int chegada, int saida){
        int tempo = saida-chegada;
        int valor = tempo*3;
        System.out.printf("O valor a quantidade de horas foi: %d",tempo);
       
    }
    
}
