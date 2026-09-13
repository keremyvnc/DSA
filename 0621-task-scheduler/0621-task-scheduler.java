class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks) {
            freq[task - 'A'] += 1;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i< freq.length;i++) {
            if(freq[i]==0){
                continue;
            }
            maxHeap.offer(freq[i]);
        }
        record Element(int freq, int readyTime) {}
        Queue<Element> q = new ArrayDeque<>();

        int time = 0;
        while (q.peek() != null || maxHeap.peek() != null){
            time++;
            if(q.peek() != null) {
                if(q.peek().readyTime < time) {
                    Element e = q.poll();
                    if(e.freq > 0) {
                        maxHeap.offer(e.freq);
                    }
                }
            }
            if(maxHeap.peek() != null) {
                int highFreq = maxHeap.poll();
                if(highFreq -1 > 0){
                    q.add(new Element(highFreq-1, time + n)); 
                }
            }
        }

        return time;
    }
}