

public class Algoritmo {

//    Estado estado_atual;
//    Estado vizinhoEstadoAtual;



    public Estado hill(Estado estado_atual) {

         do {
             Estado vizinhoEstadoAtual = estado_atual.maiorVizinho();
                    //Como pegar os vizinhos do vizinhoEstadoAtual?

               if (vizinhoEstadoAtual.getValor() <= estado_atual.getValor())
               {
                   return estado_atual;
               }
               return estado_atual = vizinhoEstadoAtual;
            }
       while (true);
    }

}