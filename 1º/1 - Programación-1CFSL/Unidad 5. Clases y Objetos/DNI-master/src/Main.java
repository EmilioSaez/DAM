public class Main {
    public static void main(String[] args) {
        Dni dni = new Dni("26873572G");
        System.out.println(dni);
        dni.setNumber(30368943);
        System.out.println(dni);
        System.out.println(dni.CorrecDni());
        System.out.println(dni.toFormatString());
        System.out.println(Dni.letterForDni(26873572));
        System.out.println(Dni.NifForDni(26873572));
    }
}
