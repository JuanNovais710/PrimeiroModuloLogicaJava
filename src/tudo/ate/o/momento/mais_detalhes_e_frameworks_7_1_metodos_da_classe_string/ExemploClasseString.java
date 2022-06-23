package mais_detalhes_e_frameworks_7_1_metodos_da_classe_string;

public class ExemploClasseString {
    public static void main(String[] args) {
        String s = "Diego Alves";
     //   System.out.println(s.charAt(0));
       // System.out.println(s.charAt(2));
        //System.out.println(s.charAt(8));

        //quantidade de caracteres na string
        System.out.println(s.length());


        char[] array = {'0', 'L', 'A'};
        //transforma os caracteres acima em um string unico
        String s1 = new String(array);
        System.out.println(s1);

        String s2 = "Desenvolvimento Java";
        //Pega tudo a partir do caractere 16
        System.out.println(s2.substring(16));
        //caracteres do 7 ao 13
        String s3 = "Cursos online de desenvolvimento de software";
        System.out.println(s3.substring(7,13));

        String s4 = "Cursos_online_de_desenvolvimento_de_software";
        //separa a posicao pelo _
        String[] array1 = s4.split("_");
        for(int i = 0; i<array1.length; i++) {
            System.out.println("[" + i + "]=" + array1[i]);
        }
        String s5 = "    Filipe    ";
        System.out.println(">" + s5 + "<");
        //corta os espaços
        System.out.println(">" + s5.trim() + "<");

        String s6 = "Java";
        int indice = s6.indexOf('a');
        System.out.println(indice);
        indice = s6.indexOf('v');
        System.out.println(indice);

        String s7 = "Desenvolvimento Java";
        System.out.println(s7.replaceAll("Java", "de software"));
    }
}
