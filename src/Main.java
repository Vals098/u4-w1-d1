public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        byte numeroInteroMoltoPiccolo = 10;
        short numeroInteroPiccolo = 100;
        int numeroIntero = 1000;
        long numeroInteroGrande = 1000000;

        numeroInteroGrande = numeroInteroMoltoPiccolo; //casting implicito
        System.out.println(numeroInteroGrande);
        numeroInteroMoltoPiccolo = (byte) numeroInteroGrande;  //casting esplicito, attenzione non sempre utilizzabile

        System.out.println(numeroInteroMoltoPiccolo);


    }
}