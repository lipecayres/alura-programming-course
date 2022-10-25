package br.com.alura.algoritmos;

public class tryLowerPrices {

    public static void main(String[] args){
        
        double prices[] = new double[5];
        prices[0] = 1000000;
        prices[1] = 46000;
        prices[2] = 16000;
        prices[3] = 46000;
        prices[4] = 17000;

        int cheaper = 0;
        for(int current =0; current <=4 ; current++){
            if (prices[current] < prices[cheaper]) {
                cheaper = current;
            }
        }
        System.out.println(cheaper)
        System.out.println('Cheaper car value: ' + cheaper)

    }
}