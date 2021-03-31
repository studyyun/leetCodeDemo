package OneHundredAndSixty;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null){
            return null;
        }

        ListNode nodeA = headA;
        ListNode nodeB = headB;
        // nodeA：1->2->3->4->5->6->null->9->5->6->null
        // nodeB：9->5->6->null->1->2->3->4->5->6->null
        // 总路程一样(A+B)，因为如果有相交的节点，在相交的节点时，已经走过的路程相同，后面的路程肯定也相同。
        // 可以理解成两个人速度一致， 走过的路程一致。那么肯定会同一个时间点到达终点。如果到达终点的最后一段路两人都走的话，那么这段路上俩人肯定是肩并肩手牵手的。
        while (nodeA != nodeB){
            nodeA = nodeA == null ? headB : nodeA.next;
            nodeB = nodeB == null ? headA : nodeB.next;
        }

        return nodeA;

    }

    /*public static void test(Person person){
        Person person1 = person;
        person1 = person1.next;
        System.out.println(person1.name);
        System.out.println(person.name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "111";
        Person person1 = new Person();
        person1.name = "222";
        person.next = person1;
        test(person);
    }*/

}

/*class Person{
    String name;
    Person next;
}*/
