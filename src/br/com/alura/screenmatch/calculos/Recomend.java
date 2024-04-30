package br.com.alura.screenmatch.calculos;

public class Recomend {

    public void  Filtra( Classifield classificavel){
        if(classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momnento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
