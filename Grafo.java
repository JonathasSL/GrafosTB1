import java.util.ArrayList;

public class Grafo {

    ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    ArrayList<Vertice> vertices = new ArrayList<Vertice>();

    public boolean isNulo(){ return arestas.size() == 0; } // Se o grafo não possui nenhuma aresta ele é nulo

    public boolean isPendente(Vertice v){ return v.getGrau() == 1; } // Se o vértice é de grau 1, ele é pendente

    public boolean isAdjacente(Vertice v1, Vertice v2){
        if (v1.getGrau() == 0 || v2.getGrau() == 0) // Se os vértices tiverem grau 0 eles não são adjacentes a ninguém
            return false;
        for (Aresta aresta : arestas) {
            if (aresta.getV1() == v1 && aresta.getV2() == v2) //Verifica se os vértices possuem uma aresta em comum numa
               return true;                                   // ordem
        }
        for (Aresta aresta : arestas) {
            if (aresta.getV1() == v2 && aresta.getV2() == v1) // Faz a mesma verificação, só que em outra ordem
                return true;
        }
        return false;
    }

    public boolean isIsolado(Vertice v){
        return v.getGrau() == 0; // Se o vértice tem grau 0, ele é isolado e não possui vizinhos
    }

    @Override
    public String toString() {
        return "Grafo " +
                "\nArestas=" + arestas +
                "\n, Vértices=" + vertices +
                '}';
    }

    public void addVertice(String nome){
        Vertice v = new Vertice(nome);
        vertices.add(v);
    }

    public void addAresta(boolean dirigido, double peso, Vertice v1, Vertice v2){
        Aresta a = new Aresta(dirigido, peso, v1, v2);
        arestas.add(a);
        v1.addGrau();
        v2.addGrau();
    }

    public void addAresta(boolean dirigido, Vertice v1, Vertice v2){
        Aresta a = new Aresta(dirigido,v1,v2);
        arestas.add(a);
        v1.addGrau();
        v2.addGrau();
    }

}
