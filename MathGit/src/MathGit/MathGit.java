
package MathGit;
import MathGit.Sumar;
import MathGit.Multiplicar;
public class MathGit {

    public static void main(String[] args) {
        Restar s1 = new Restar();
        System.out.println(s1.restar(5, 4));
        Sumar sumar = new Sumar();
        int x = 10;
        int y = 20;
        System.out.println(sumar.suma(x,y));
    }
    
}
