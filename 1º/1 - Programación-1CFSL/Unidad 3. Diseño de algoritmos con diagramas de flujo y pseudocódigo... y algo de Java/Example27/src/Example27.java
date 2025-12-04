//27.- Diseña un algoritmo que escriba los primeros 40 términos de la serie de Fibonacci.
public class Example27 {
    public static void main(String[] args) {
        int n1=0,n2=1,sum;
        for (int i = 0; i < 40; i++) {
            sum= n1+n2;
            n1=n2;
            n2=sum;
            System.out.println(sum);
        }
    }
}
