public class Main {
    public static void main(String[] args) {
            Book levTolstoy = new Book(1856, " Война и мир ", new Author("Лев Толстой"));
            System.out.println(levTolstoy);
            levTolstoy.setYear(1876);
            System.out.println(levTolstoy);

            Book mihailBulgakov = new Book(1967, " Мастер и маргарита ", new Author("Михаил Булгаков"));
            System.out.println(mihailBulgakov);

    }
}