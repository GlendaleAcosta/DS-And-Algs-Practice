package ds.Hashing;

public class HashTable {
    int size;
    int slots[];
    int data[];

    public HashTable(int s) {
        size = s;
        slots = new int[s];
        data = new int[s];
    }

    public void put(int key, int data) {
        int hashValue = this.hashFunction(key, slots.length);
        if (this.slots[hashValue] == 0) {
            this.slots[hashValue] = key;
            this.data[hashValue] = data;
        } else if (this.slots[hashValue] == key) {
            this.data[hashValue] = data;
        } else  {
            int nextSlot = this.reHash(hashValue);
            while(slots[nextSlot] != 0 && this.slots[nextSlot] != key) {
                nextSlot = this.reHash(nextSlot);
            }
            if (this.slots[nextSlot] == 0) {
                this.slots[nextSlot] = key;
                this.data[nextSlot] = data;
            } else {
                this.data[nextSlot] = data;
            }
        }
    }

    public int hashFunction(int key, int size) {
        return key%size;
    }

    public int reHash(int oldHashValue) {
        return (oldHashValue+1)%size;
    }

}
