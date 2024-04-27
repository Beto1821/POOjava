package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Title;

public class TimeCount {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Title title) {
        System.out.println("Adicionando duração em minutos de " + title);
        this.tempoTotal += title.getDuracaoEmMinutos();
    }
}
