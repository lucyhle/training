
public class AddTwoNumbers {


    public ListNode addTwoNumbersP(ListNode l1, ListNode l2) {
    	int extra = 0;
    	ListNode currentList = new ListNode(0);
        ListNode p = currentList;
        while (l1 != null || l2 != null || extra != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + extra;
            cur.val = sum % 10;
            extra = sum / 10;
            currentList.next = cur;
            currentList = cur;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return p.next;      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		};
	}




