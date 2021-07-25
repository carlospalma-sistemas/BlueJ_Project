import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String [] args)
    {
      probarLists();  
        
    }
    
    public static void iniciarCurso() {
        Curso c = new Curso();
        c.setNombre("Carlos");
        c.setNota(3.5, 0);
        c.setNota(4.4, 1);
        c.setNota(5.0, 2);
        
        System.out.println(c.toString());
    }
    
    
    
    public static void mostrar_elementos(Collection coll) {
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    
    public static void probarLists() {
        List ejemploObjetoListaLink = new LinkedList();
        ejemploObjetoListaLink.add("elemento1");
        ejemploObjetoListaLink.add("elemento2");
        ejemploObjetoListaLink.add("elemento3");
        ejemploObjetoListaLink.add("elemento3");
        System.out.println("Lista linked list");
        mostrar_elementos(ejemploObjetoListaLink);
        
        List ejemploObejetoListaArray = new ArrayList();
        ejemploObejetoListaArray.add("elemento1");
        ejemploObejetoListaArray.add("elemento2");
        ejemploObejetoListaArray.add("elemento3");
        ejemploObejetoListaArray.add("elemento3");
        System.out.println("Lista array list");
        mostrar_elementos(ejemploObejetoListaArray);
    }
    
    public static void probarSets() {
        Set ejemploObjetoConjuntoHashSet = new HashSet();
        ejemploObjetoConjuntoHashSet.add("elemento1");
        ejemploObjetoConjuntoHashSet.add("elemento3");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        System.out.println("Conjunto tipo hash");
        mostrar_elementos(ejemploObjetoConjuntoHashSet);
        
        SortedSet ejemploObjetoConjuntoTreeSet = new TreeSet();
        ejemploObjetoConjuntoTreeSet.add("elemento1");
        ejemploObjetoConjuntoTreeSet.add("elemento3");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        System.out.println("Conjunto tipo tree");
        mostrar_elementos(ejemploObjetoConjuntoTreeSet);
        
    }
    
    public static void probarMaps() {
        Map ejemploObjetoMapaHash = new HashMap();
        ejemploObjetoMapaHash.put("clave1", "valor1");
        ejemploObjetoMapaHash.put("clave2", "valor2");
        ejemploObjetoMapaHash.put("clave3", "valor3");
        ejemploObjetoMapaHash.put("clave3", "valor3");
        System.out.println("Mapa tipo hash");
        mostrar_elementos(ejemploObjetoMapaHash.keySet());
        mostrar_elementos(ejemploObjetoMapaHash.values());
        
        SortedMap ejemploObjetoMapaTree = new TreeMap();
        ejemploObjetoMapaTree.put("clave1", "valor1");
        ejemploObjetoMapaTree.put("clave2", "valor2");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        System.out.println("Mapa tipo hash");
        mostrar_elementos(ejemploObjetoMapaTree.keySet());
        mostrar_elementos(ejemploObjetoMapaTree.values());
    }
    
    
}
