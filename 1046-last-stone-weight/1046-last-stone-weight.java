class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            maxHeap.add(stone);
        }
        while(maxHeap.size()>1) {
            int x = maxHeap.poll();
            int y;
            if(!maxHeap.isEmpty()) {
                y = maxHeap.poll();
            }
            else break;
            if(x!=y){
                maxHeap.add(x-y);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }
        else return maxHeap.poll();
        
    }
}