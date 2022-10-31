import br.com.hash.Customer;
import br.com.hash.HashTable;

public class App {

    public static void main(String[] args) throws Exception {

        Customer c1 = new Customer(1, "Aellipe");
        Customer c2 = new Customer(2, "Bilgueiras");
        Customer c3 = new Customer(3, "Alves");
        Customer c4 = new Customer(1, "Bellipe");
        Customer c5 = new Customer(2, "Cilgueiras");
        Customer c6 = new Customer(3, "Dlves");

        HashTable<Customer> table = new HashTable<>();
        System.out.println("Is empty: " + table.isEmpty());

        table.add(c1);
        table.add(c2);
        table.add(c3);
        table.add(c4);
        table.add(c5);
        table.add(c6);
        
        System.out.println("Size: " + table.size());
        System.out.println("Contains: " + table.contains(c1));
        System.out.println("Add: " + table.add(new Customer(1, "Fellipe")));
        table.remove(c2);
        System.out.println(table.size());

        System.out.println(table);

    }

}
