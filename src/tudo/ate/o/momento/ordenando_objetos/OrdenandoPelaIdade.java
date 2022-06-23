package ordenando_objetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoPelaIdade {
    public static void main(String[] args) {
         Pessoa p1 = new Pessoa("João", 30);
         Pessoa p2 = new Pessoa("Maria", 25);
         Pessoa p3 = new Pessoa("Juliete", 26);

        List<Pessoa> pessoas = Arrays.asList(p1, p2, p3);
        IdadeComparator idadeComparator = new IdadeComparator();

        Collections.sort(pessoas, idadeComparator);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
