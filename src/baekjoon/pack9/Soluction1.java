package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Deque deque = new Deque(n);
		while (n > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();
			int data = 0;
			if (st.hasMoreTokens()) {
				data = Integer.parseInt(st.nextToken());
			}

			switch (cmd) {
				case "push_front":
					deque.push_front(data);
					break;
				case "push_back":
					deque.push_back(data);
					break;
				case "pop_front":
					sb.append(deque.pop_front()).append("\n");
					break;
				case "pop_back":
					sb.append(deque.pop_back()).append("\n");
					break;
				case "size":
					sb.append(deque.size()).append("\n");
					break;
				case "empty":
					sb.append(deque.isEmpty()).append("\n");
					break;
				case "front":
					sb.append(deque.front()).append("\n");
					break;
				case "back":
					sb.append(deque.back()).append("\n");
					break;
			}
			n--;
		}
		System.out.println(sb);
	}

	static class Deque {
		private final int[] store;
		private int front;
		private int back;
		private int size;
		private final int capacity;

		public Deque(int capacity) {
			this.store = new int[capacity];
			this.front = 0;
			this.back = 0;
			this.size = 0;
			this.capacity = capacity;
		}

		private void push_front(int x) {
			front = (front - 1 + capacity) % capacity;
			store[front] = x;
			size++;
		}

		private void push_back(int x) {
			store[back] = x;
			back = (back + 1) % capacity;
			size++;
		}

		private int pop_front() {
			if (isEmpty() == 1) {
				return -1;
			}
			int n = store[front];
			store[front] = 0;
			front = (front + 1) % capacity;
			size--;
			return n;
		}

		private int pop_back() {
			if (isEmpty() == 1) {
				return -1;
			}
			back = (back - 1 + capacity) % capacity;
			int n = store[back];
			store[back] = 0;
			size--;
			return n;
		}

		private int isEmpty() {
			return size == 0 ? 1 : 0;
		}

		private int front() {
			return store[front] == 0 ? -1 : store[front];
		}

		private int back() {
			int back = (this.back - 1 + capacity) % capacity;
			return store[back] == 0 ? -1 : store[back];
		}

		private int size() {
			return size;
		}
	}

}
