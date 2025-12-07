public class TestAuthor {
    public static void main(String[] args) {
        Book [] books= {
                new Book("La vida de pedro",new Author("Pedro","Pedro el pro@gmail.com",'M'),20.55,4),
                new Book("El quijote",new Author("Cervantes","Cervantes_real@gmail.com",'M'),12.30),
                new Book("el zapato paco",new Author("PcComponentes","PcComponentes.contanct@gmail.com",'F'),17.30),
                new Book("Pesadilla en la cocina el libro",new Author("Chicote","tengo pesadillas en las cocinas@gmail.com",'M'),20.30,6),
                new Book("El niño del pozo",new Author("Pozo","Asociacion_de_pozos@gmail.com",'F'),1000.30,1)
            };
        for (int i = 0; i < books.length; i++) {
            System.out.println("- "+books[i]);

        }
    }
}
