import java.util.LinkedList;

public class ZAD3 {
    public static void odwroc(LinkedList<String> lista)
    {
        LinkedList<String> nl = new LinkedList<String>();
        for(int i=lista.size()-1;i>=0;i--)
        nl.add(lista.get(i));
        lista.clear();
        for(int i=0;i<nl.size();i++)
        lista.add(nl.get(i));

    }

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Kowalski");    
        ll.add("Brzechwa");   
        ll.add("Dijkstra");    
        ll.add("Bell");    
        ll.add("Osik");
        ll.add("Radowid");
        ll.add("Klekot");
        ll.add("Nowak");
        System.out.print(ll);
        System.out.println();
        odwroc(ll);
        System.out.print(ll);
    }
}
