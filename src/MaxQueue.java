import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {

//    private List<Integer> list = new ArrayList<>();
//    private List<Integer> maxList = new ArrayList<>();
//    private transient int max = 0;
//    private transient int index = 0;
//
//    public MaxQueue() {
//    }
//
//    public int max_value() {
////        if (list.isEmpty()) return -1;
////        return max;
//        if (maxList.isEmpty()) return -1;
//        return maxList.get(maxList.size()-1);
//    }
//
//    public void push_back(int value) {
////        if (value >= max) {
////            max = value;
////            maxList.add(max);
////            Collections.sort(maxList);
////        }
//
//        list.add(value);
//        maxList.add(value);
//        Collections.sort(maxList);
//    }
//
//    public int pop_front() {
//        if (list.isEmpty() || index >= list.size()) {
//            return -1;
//        }
//        int i = list.get(index++);
////        if (i == max) {
////            maxList.remove(maxList.size()-1);
////            max = (maxList.size()==0) ? -1:maxList.get(maxList.size()-1);
////        }
//        Integer integer = new Integer(i);
//        maxList.remove(integer);
//        return i;


//    }

    private Queue<Integer> queue;
    private Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }

    public int max_value() {
        return deque.size()>0 ? deque.peekFirst():-1;
    }

    public void push_back(int value) {
        queue.offer(value);
        while (deque.size()>0 && deque.peekLast()<value){
            deque.pollLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        Integer peek = queue.poll();
        if (deque.size()>0 && deque.peek().equals(peek)){
            deque.pollFirst();
        }
        return peek==null ? -1:peek;
    }

    public static void main(String[] args) {

    }

}
