import java.util.*;

class Pair {
    int num;
    int freq;

    public Pair(int num, int freq) {
        this.num = num;
        this.freq = freq;
    }
}

class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Build frequency map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create min-heap of size k using array
        Pair[] heap = new Pair[k];
        int size = 0; // current size of heap

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            Pair p = new Pair(entry.getKey(), entry.getValue());
            if (size < k) {
                heap[size] = p;
                heapifyUp(heap, size);
                size++;
            } else {
                if (p.freq > heap[0].freq) {
                    heap[0] = p; // replace root
                    heapifyDown(heap, 0, k);
                }
            }
        }

        // Step 3: Extract result from heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap[i].num;
        }
        return result;
    }

    // Heapify up: after insertion
    private void heapifyUp(Pair[] heap, int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap[parent].freq > heap[index].freq) {
                swap(heap, parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    // Heapify down: after replacement
    private void heapifyDown(Pair[] heap, int index, int size) {
        while (index < size) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && heap[left].freq < heap[smallest].freq) {
                smallest = left;
            }
            if (right < size && heap[right].freq < heap[smallest].freq) {
                smallest = right;
            }
            if (smallest != index) {
                swap(heap, index, smallest);
                index = smallest;
            } else {
                break;
            }
        }
    }

    // Swap helper
    private void swap(Pair[] heap, int i, int j) {
        Pair temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
