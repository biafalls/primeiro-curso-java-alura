package desafiosEatividades.aula2;

public class Casting {
    public static void main(String[] args) {
        /*2.Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        Atribua valores a essas variáveis e concatene-as em uma mensagem.*/
        double bananaDouble = 3.4;
        int bananaInt = (int) bananaDouble;

        System.out.println("O macaco tem " + bananaInt + " bananas não " + bananaDouble);
    }
}
