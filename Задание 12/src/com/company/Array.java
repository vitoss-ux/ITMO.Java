package com.company;

import java.util.HashMap;
import java.util.Map;

public class Array<K> {
    public <K> Map<Integer,K> arrayToMap(K[] ks) {

        for (K element : ks)
        {
            System.out.println(element);
        }
        Object elem = null;
        HashMap<Integer, K> map = new HashMap<Integer, K>();
        for (K i : ks)map.put(i.hashCode(), i);
        return (Map<Integer, K>) map;
    }
}
