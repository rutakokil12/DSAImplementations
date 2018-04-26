package HashmapImpl;

public class HashmapImpl<K,V> {

	
	private int capacity = 4;
	private entrySet<K,V>[] table =new entrySet[capacity];
	
	static class entrySet<K, V>{
		K key;
		V value;
		entrySet<K, V> next;
		public entrySet(K key, V value, entrySet<K, V> next) {
			this.key = key;
			this.value =value;
			this.next = next;			
		}
	}
	
private int bucketLoc(K key) {
	return Math.abs(key.hashCode()) % capacity;
}

 
 
 public void put(K key , V value) {
	 if(key == null) {
		 return; // not to allow null values.
	 }
	 // decide location in the table to put the key 
	 int index = bucketLoc(key);
	
	 entrySet <K,V> newEntry = new entrySet<K,V>(key, value, null);
	 
	 if (table[index] == null) {
		 table[index] = newEntry;
		 
	 }else { 
     entrySet<K,V> previousNode = null;
     entrySet<K,V> currentNode = table[index];
     
     while(currentNode != null){ 
     if(currentNode.key.equals(key)){           
         if(previousNode==null){ 
               newEntry.next=currentNode.next;
               table[index]=newEntry;
               return;
         }
         else{
             newEntry.next=currentNode.next;
             previousNode.next=newEntry;
             return;
         }
     }
     previousNode=currentNode;
       currentNode = currentNode.next;
   }
   previousNode.next = newEntry;
  }
 }
		 


public V get(K Key) {
	int index =bucketLoc(Key);
	if(table[index] == null) {
		return null;
	}else {
		entrySet <K,V> temp = table[index];
		while(temp!= null) {
			if(temp.key.equals(Key)) 
				return temp.value;
				temp = temp.next;
			
		}
	}
	return null;
}
public boolean remove(K dKey){
    
    int index=bucketLoc(dKey);
           
   if(table[index] == null){
         return false;
   }else{
     entrySet<K,V> previousNode = null;
     entrySet<K,V> currentNode = table[index];
     
     while(currentNode != null){ 

        if(currentNode.key.equals(dKey)){               
            if(previousNode==null){  //delete first entry node.
                  table[index]=table[index].next;
                  return true;
            }
            else{
                  previousNode.next=currentNode.next;
                   return true;
            }
        }
        previousNode=currentNode;
          currentNode = currentNode.next;
       }
     return false;
   }
 
 }
public void display(){
    
    for(int i=0;i<capacity;i++){
        if(table[i]!=null){
               entrySet<K, V> node=table[i];
               while(node!=null){
                     System.out.print("\n{ key = "+node.key+", value = "+node.value+"}" +"\n");
                     node=node.next;
               }
        }
    }             
 
 }

}
