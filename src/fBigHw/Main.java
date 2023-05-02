package fBigHw;

public class Main {
    public static void main(String[] args) {

        Author dovstoevsky = new Author("Федор", "Достоевский");
        Author pushkin = new Author("Александр", "Пушкин");

        Book CrimeAndPunishment = new Book("Преступление и наказание", dovstoevsky, 1865);
        Book CapitainsDoughter = new Book("Капитанская дочка", pushkin, 1836);

        CrimeAndPunishment.setYearOfPublication(1866);

        System.out.println(CrimeAndPunishment);
        System.out.println(CrimeAndPunishment.equals(CapitainsDoughter));
        System.out.println(dovstoevsky.equals(pushkin));

    }
}