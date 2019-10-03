public class Aplicacao {

    public static void main(String[] args){
      Grafo g = new Grafo();
      g.addVertice("A");
      g.addVertice("B");
      g.addAresta(false,4,g.vertices.get(0),g.vertices.get(1));
      System.out.println(g.toString());
    }
}
