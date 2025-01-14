class KthLargest {
    
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    final int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i=0; i<nums.length; i++) {
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > this.k) {
            minHeap.poll();
        }
        
        return minHeap.peek();
    }
}
