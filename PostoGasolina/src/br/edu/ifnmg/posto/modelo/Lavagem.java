package br.edu.ifnmg.posto.modelo;

public class Lavagem extends Servico{
    //private float desconto;
    private char tipo;
    //float desconto,
    public Lavagem(char tipo){
        //super(desconto,tipo);
        
        //this.desconto = desconto;
        this.tipo = tipo;
    }
    
    public void calculoLavagem(char tipo){
        int valor = 0;
        if (tipo == 1){
            valor = 10;
        }
        else if(tipo == 2){
            valor = 20;
        }
        System.out.printf("O valor da lavagem foi: %d",valor);
        
    }
    
 
}
