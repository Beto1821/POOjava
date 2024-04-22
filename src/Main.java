public class Main {
    public static void main(String[] args) {
        Movie newMovie = new Movie();

        newMovie.nome =  "StarWars";
        newMovie.anoDeLançamento = 1978;
        newMovie.duracaoEmMinutos = 180;

        System.out.println(newMovie.nome);
    }
}
