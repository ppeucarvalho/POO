package br.edu.ifnmg.posto.modelo;

public class Combustivel extends Servico{
    private float desconto;
    private float litrosAbaste;
    
    public Combustivel(float desconto, float litrosAbaste){
        //super(desconto,litrosAbaste);
        
        this.desconto = desconto;
        this.litrosAbaste = litrosAbaste;
    }
    
    public void calculoLavagem(int litros){
        litros = litros*4;
        System.out.printf("O valor a pagar em litros é de: R$ %d",litros);
        
    }
    
    

    public float getLitrosAbaste() {
        return litrosAbaste;
    }

    public void setLitrosAbaste(float litrosAbaste) {
        this.litrosAbaste = litrosAbaste;
    }
    
    
    
}
