                   nlog(n)  .sort()
2

I = array int
O = val int

1 2 3 4 5 6 
6-2  

6
5
4
3
2
1


3
5

{"123" : ["254", "586"], "254" : ["255", "587"]}

hhhhooollll

public int findKelement(int[] nums, int k){                       3 2 1 5 4 6          2
    PriorityQueue<Integer> q = new PriorityQueue<>();

    for(int i=0; i<nums.length;i++){ 
        q.push(nums[i]);                              
        if(q.size() == k+1){                                             5 4 6
            q.pop();
        }
       else{
        
       }
    }

    
    return q.pop();

}

















