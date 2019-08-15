
public class Main {
	public static void main(String[] args) {
		int[] input = {6, 6, 1, 2, 6, 3, 4, 5, 6, 6, 7, 6, 6};
		int val = 6;
		
		ListNode head = Struct(input);
		
		System.out.print("原链表：");
		for(ListNode p = head; p != null; p = p.next) {
			System.out.print(p.val + " " );
		}
		
		Solution s = new Solution();
		ListNode h = s.removeElements(head, val);
		
		System.out.println();
		System.out.print("删除val后的链表：");
		
		for(ListNode p = h; p != null; p = p.next) {
			System.out.print(p.val + " " );
		}
		
	}
	
	public static ListNode Struct(int[] vals) {
		if(vals.length == 0) {
			return null;
		}
		
		ListNode head = new ListNode(vals[0]);
		head.next = null;
		
		ListNode curr = head;
		for(int i = 1; i < vals.length; i++) {
			ListNode nNode = new ListNode(vals[i]);
			curr.next = nNode;
			curr = nNode;
		}
		
		return head;
	}
}
