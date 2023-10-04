class MyHashMap {
    int[] data;

    public MyHashMap() {
        data = new int[1000001];
        Arrays.fill(data, -1);
    }
    
    public void put(int key, int value) {
        data[key] = value;        
    }
    
    public int get(int key) {
        return data[key];       
    }
    
    public void remove(int key) {
        data[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

// Both the complexities are very high | Need to improve.........

/* ----------------------    LinkedList Approach ----------------------

Using a basic approach with a hash table that consists of a list of buckets 
(in this case, a list of ListNode objects), where each bucket represents a 
hash code.

*/

class MyHashMap {

    final int size = 1000;
    List<int[]>[] map;

    public MyHashMap() {
        map = new ArrayList[size];
        for(int i = 0; i < size; i++)
        {
            map[i] = new ArrayList<>();
        }
    }
    
    public void put(int key, int value) {
        int index = key % size;
        List<int[]> bucket = map[index];
        for (int[] pair : bucket) {
            if (pair[0] == key) {
                pair[1] = value; 
                return;
            }
        }
        bucket.add(new int[]{key, value});        
    }
    
    public int get(int key) {
         int index = key % size;
        List<int[]> bucket = map[index];
        for (int[] pair : bucket) {
            if (pair[0] == key) {
                return pair[1]; 
            }
        }
        return -1;        
    }
    
    public void remove(int key) {
        int index = key % size;
        List<int[]> bucket = map[index];
        for (int i = 0; i < bucket.size(); i++) {
            int[] pair = bucket.get(i);
            if (pair[0] == key) {
                bucket.remove(i); 
                return;
            }
        }
    }
}
