import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //para que el usuario escriba
        Scanner scanner = new Scanner(System.in);
        //declaraciones y asignaciones
        String palabraSecreta="inteligencia";
        int intentosMaximos=10;
        int intentos=0;
        boolean palabraAdivinada=false;

        //arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0;i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
            
        }

        while(!palabraAdivinada && intentos<intentosMaximos){
                                                        //se usa cuando tenemos una palabra de chars
            System.out.println("palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("indroduce una letra por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for(int i=0;i< palabraSecreta.length();i++){
                //estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("incorrecto! te quedan " + (intentosMaximos - intentos) + "intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("¡felicidades! has adivinado la palabra secreta");

            }
        }
        if(!palabraAdivinada){
            System.out.println("te has quedado sin intentos");
        }
        scanner.close();
    }
}

