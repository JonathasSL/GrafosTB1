import java.util.ArrayList;

public class Grafo {

    ArrayList<Aresta> arestas = new ArrayList<Aresta>();
    ArrayList<Vertice> vertices = new ArrayList<Vertice>();

    public boolean isNulo(){
        return arestas.size() == 0;
    }

    public boolean isPendente(Vertice v){
        if (v.getGrau() == 1)
            return true;
        else
            return false;
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
