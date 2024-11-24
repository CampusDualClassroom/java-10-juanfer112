package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {
    private static final String BLUE = "azul";
    private static final String RED = "rojo";
    private static final String GREEN = "verde";
    private static final int MAX_RANDOM_NUMBER = 4;
    private static final int MIN_RANDOM_NUMBER = 1;
    private static final int REQUIRED_BLUE_BALLS = 2;
    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int  blueBallCount = 0;
        do{
            String ballColor = getBall();

            if (BLUE.contains(ballColor)){
                blueBallCount++;
            };
            System.out.println("La bola es de color: " +  ballColor);

        }while ( blueBallCount < REQUIRED_BLUE_BALLS);

    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    /**
     * Obtiene un color de bola aleatorio.
     * @return Color de la bola como cadena de texto.
     */
    public static String getBall() {
        int randomColorCode = randomWithRange(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER);

        String color = "";

        switch (randomColorCode) {
            case 1:
                color = RED;
                break;
            case 2:
                color = BLUE;
                break;
            case 3:
                color = GREEN;
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + randomColorCode);
        }
        return color;
    }
    /**
     * Genera un número aleatorio en el rango especificado.
     * @param min Valor mínimo inclusivo.
     * @param max Valor máximo exclusivo.
     * @return Número aleatorio generado.
     */
    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}