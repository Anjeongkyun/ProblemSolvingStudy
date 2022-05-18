package HashTable;

public class MyHashTable {
    public Slot[] hashTable;

    public MyHashTable(int size){
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String value;
        Slot(String value){
            this.value = value;
        }
    }
}
