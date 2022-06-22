package HashMap;
import java.lang.Object.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class HashMapUsingArray<K, V> {

    private class HmNode{
        K key;
        V value;

        public HmNode(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private LinkedList<HmNode>[] buckets;

    public HashMapUsingArray(){
        initBuckets(4);
        size = 0;
    }

    private void initBuckets(int n){
        buckets = new LinkedList[n];
        for (int i = 0 ; i < n ; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    private int hashFunc(K key){
        int hash = key.hashCode();

        return  Math.abs(hash) % buckets.length;

    }

    private int getIndexWithinBucket(K key, int bi){
        int di =0;
        for (HmNode node : buckets[bi]){
            if (node.key.equals(key)){
                return di;
            }
            di++;
        }
        return -1;

    }

    public void put(K key, V value){
        int bi = hashFunc(key);
        int di = getIndexWithinBucket(key, bi);

        if (di !=-1){
            HmNode node = buckets[bi].get(di);
            node.value = value;
        }else{
            HmNode node  = new HmNode(key, value);
            buckets[bi].add(node);
            size++;
        }

        double lambda = size *1.0 / buckets.length;
        if (lambda >= 2.0){
            reHash();
        }

    }

    public boolean containsKey(K key){
        int bi = hashFunc(key);
        int di = getIndexWithinBucket(key, bi);

        if (di !=-1){
           return true;
        }else{
           return false;
        }
    }

    public V get(K key){
        int bi = hashFunc(key);
        int di = getIndexWithinBucket(key, bi);

        if (di !=-1){
            HmNode node = buckets[bi].get(di);
            return node.value;
        }else{
            return null;
        }
    }

    public V remove(K key){
        int bi = hashFunc(key);
        int di = getIndexWithinBucket(key, bi);

        if (di !=-1){
            HmNode node = buckets[bi].remove(di);
            size--;
            return node.value;
        }else{
            return null;
        }
    }

    public int getSize(){
        return size;
    }

    public ArrayList<K> keySet(){
        ArrayList<K> list = new ArrayList<>();
        for (int i = 0 ; i < buckets.length ; i++){
            for (HmNode lst : buckets[i]){
                list.add(lst.key);
            }
        }
        return list;
    }

    private void reHash(){
        LinkedList<HmNode>[] oldbucket = buckets;
        initBuckets(buckets.length*2);
        size = 0;
        for (int i = 0 ; i < oldbucket.length ; i++){
            for (HmNode node : oldbucket[i]){
                put(node.key, node.value);
            }
        }
    }

}
