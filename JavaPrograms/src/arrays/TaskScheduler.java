package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c : tasks) {
            freq[c - 'A']++;
        }
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        for(int f : freq) {
            if(f > 0) maxHeap.add(f);
        }
        int time = 0;
        while(!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;
            while(cycle > 0 && !maxHeap.isEmpty()) {
                int curr = maxHeap.poll();
                if(curr - 1 > 0) {
                    temp.add(curr - 1);
                }
                time++;
                cycle--;
            }
            for(int t : temp) {
                maxHeap.add(t);
            }
            if(maxHeap.isEmpty()) break;
            time += cycle;
        }
        return time;
    }

    static void main(String[] args) {
        char[] tasks = {'A','A','A', 'B', 'B', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
}
