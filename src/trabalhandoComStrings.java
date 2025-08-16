public class trabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Maki";
        String nomeDois = " Matheus";

        int tamanhoString = nome.length();
        boolean saoIguais = nome.equals(nomeDois);
        String nomeJuntos = nome.concat(nomeDois);


        System.out.println("Olá " + nome.toLowerCase() + " Seu nome tem "+tamanhoString + " caracteres ");
        System.out.println(saoIguais);
        System.out.println(nomeJuntos);

    }
}
