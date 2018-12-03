import java.util.ArrayList;

/**题目
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * */
public class FlipList {
    public class ListNode {
        int val;
        ListNode next = null;

                ListNode(int val) {
            this.val = val;
       }
    }

     /**
      * 递归算法
      * */
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
           if (listNode!=null){
               printListFromTailToHead(listNode.next);
               list.add(listNode.val);
           }
           return list;
    }


    /**
     * ArrayList插入原理， void add(int index,Object o) 插入时将index位及后面的全部后移一位
     * */
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode!=null){
            arrayList.add(0,listNode.val);
            listNode = listNode.next;
        }
        return arrayList;
    }

    /**
     * 使用
     *       Collections.reverse(arrayList);
     *       进行数组翻转
     * */

    /**
     * 使用 stack 栈 来进行数组的翻转
     * */


}
