import java.util.LinkedList;

class RecentCounter {
	LinkedList<Integer> queue;

	public RecentCounter() {
		queue = new LinkedList<Integer>();
	}

	public int ping(int t) {

		queue.offer(t);
		while(t - queue.peekFirst() > 3000) {
			queue.removeFirst();
		}
		return queue.size();
	}
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */