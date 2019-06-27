
public class Hill_Climbing {



    public static void main(String[] args) {

        Estado estado_a = new Estado("A", 10);
        Estado estado_b= new Estado("B", 8);
        Estado estado_c = new Estado("C", 19);
        Estado estado_d = new Estado("D", 7);
        Estado estado_e = new Estado("E", 6);

        //adicionar estados vizinhos do estado a
        estado_a.addVizinhos(estado_b);
        estado_a.addVizinhos(estado_c);

        //adicionar estados vizinhos do estado c
        estado_c.addVizinhos(estado_d);
        estado_c.addVizinhos(estado_e);


        Algoritmo hill_climbing = new Algoritmo();
        Estado resultado = hill_climbing.hill(estado_a);

        System.out.println("Resultado da execucao " + resultado.getNome() + " - "+ resultado.getValor());

    }

}