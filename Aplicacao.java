public class Aplicacao {

    public static void main(String[] args){
      Grafo g = new Grafo();
      g.addVertice("A");
      g.addVertice("B");
      g.addVertice("C");
      g.addAresta(false,4,g.vertices.get(0),g.vertices.get(1));
      g.addAresta(false,3,g.vertices.get(0),g.vertices.get(2));

      System.out.println(g.toString());
      System.out.println(g.isAdjacente(g.vertices.get(0),g.vertices.get(1)));
      System.out.println(g.isPendente(g.vertices.get(1)));
    }
}
