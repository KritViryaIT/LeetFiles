ArrayList<String> k = new ArrayList<>();
        arr[idKey] = value;

        if (ptr != idKey) return k;
        
        for (int i = ptr; i < arr.length && arr[i] != null; i++) {
            k.add(arr[i]);
            ptr++;
        }

        return k;
