class KthLargest {
    PriorityQueue<Integer> heap;
    int heapSize;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<Integer>(Arrays.stream(nums).boxed().toList());
        heapSize = k;
        for(int i=0;i<nums.length-k; i++){
            heap.poll();
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size() > heapSize){
            heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */