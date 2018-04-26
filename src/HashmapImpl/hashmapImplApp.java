package HashmapImpl;

public class hashmapImplApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashmapImpl<Integer, Integer> hashmap = new HashmapImpl<Integer, Integer>();
		hashmap.put(21, 12);
		hashmap.put(25, 121);
		hashmap.put(30, 151);
		hashmap.put(33, 15);
		hashmap.put(35, 89);
		System.out.print("Display Hashmap contents : ");
        hashmap.display();

		System.out.println("\nvalue corresponding to key 21=" + hashmap.get(21));
        System.out.println("\nvalue corresponding to key 51="+ hashmap.get(51));
        
        System.out.println("\n\nEntry corresponding to key 21 removed: "+ hashmap.remove(21));
        System.out.println("\nEntry corresponding to key 51 removed: " + hashmap.remove(51));
        System.out.println("\n Display updated hashmap :");
        hashmap.display();
	}

}
