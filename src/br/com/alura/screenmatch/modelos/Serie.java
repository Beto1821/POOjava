package br.com.alura.screenmatch.modelos;

public class Serie extends Title {
    private int temporadas;
    private boolean ativa;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemperoda() {
        return episodiosPorTemperoda;
    }

    public void setEpisodiosPorTemperoda(int episodiosPorTemperoda) {
        this.episodiosPorTemperoda = episodiosPorTemperoda;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    private int episodiosPorTemperoda;
    private int minutosPorEpisodio;


}
