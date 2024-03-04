import java.util.LinkedList;
import java.util.List;

/**
 * @author : JOHNNGUYEN
 * @since : 8/30/2023, Wed
 **/
public class Test111 {
    public static void main(String[] args) {
        /**
         * You are given the heads of two sorted linked lists list1 and list2.
         *
         * Merge the two lists into one sorted list. The list should be made by
         * splicing together the nodes of the first two lists.
         *
         * Return the head of the merged linked list.
         */
        System.out.println("aaa");
    }


    public static LinkedList<Integer> merge(LinkedList<Integer> list111, LinkedList<Integer> list2111){
        //create list 1: 1,2,3.
        //create list 2: 4,5,6
        //merge: list 3: 1,2,3,4,5,6

        //Node.next is not null,
        //check the value of first node on list1 and list 2. If
        //node1 on list1
        //node2 on list2
        //create a new LinkedList,

        //node is null
        //if the val of node 1 is less than val of node 2, then, node = node1.  node1 = node1.next.
        //else node = node2. node2 = node2.next.
        Node result = new Node();
        Node list1 = new Node();
        Node list2 = new Node();

        while(list1.next != null && list2.next != null){
            if(list1.val <= list2.val){
                result.val = list1.val;
                list1 = list1.next;
                result.next = new Node();
                result = result.next;
            }
        }

        //5 node
        while(list1.next != null){

        }


        //3 node
        while(list2.next != null){

        }



        return null;
    }

}

class Node{
    int val;
    Node next;
}
