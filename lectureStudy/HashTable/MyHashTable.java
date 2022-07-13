package lectureStudy.HashTable;

public class MyHashTable {
    public static void main(String[] args) {
        MyHashTable mainObj = new MyHashTable(20);
        mainObj.saveData("jeongkyun1","01012312345");
        mainObj.saveData("jeongkyun2","01022312345");
        mainObj.getData("jeongkyun2");
        System.out.println(mainObj.getData("jeongkyun2"));
    }

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

    public int hashFunc(String key){
        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value){
        int address = this.hashFunc(key);
        if(this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        }else{
            this.hashTable[address] = new Slot(value);
        }

        return true;
    }

    public String getData(String key){
        int address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            return this.hashTable[address].value;
        }else{
            return null;
        }
    }
}
