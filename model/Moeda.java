package model;

public class Moeda {

    private double reaisDolar;
    private double dolarReais;
    private double euroReais;
    private double reaisEuro;

    public Moeda(){
        this.dolarReais = 5.09;
        this.reaisDolar = 0.19;
        this.euroReais = 5.23;
        this.reaisEuro = 0.19;
    }


    public String converter(String tipoConversao, String Quantidade){

        double valor= 0;

        switch(tipoConversao) {
            case "Reais para Dolares":
                valor = reaisDolar;
                break;
            case "Dolares para Reais":
                valor = dolarReais;
                break;
            case "Reais para Euro":
                valor = reaisEuro;
                break;
            case "Euro para Reais":
                valor = euroReais;
                break;            
            }

        
        return String.valueOf(valor * Double.parseDouble(Quantidade));
    }

}