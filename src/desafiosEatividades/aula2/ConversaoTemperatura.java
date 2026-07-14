package desafiosEatividades.aula2;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        double tempCelsius = 36.5;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        String mensagem = String.format("A temperatura em Celsius é %f e em Fahrenheit %f", tempCelsius, tempFahrenheit);

        System.out.println(mensagem);

        int tempFahrenheitInt = (int) tempFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + tempFahrenheitInt);
    }
}
