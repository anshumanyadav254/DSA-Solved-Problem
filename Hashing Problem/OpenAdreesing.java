class Myhash {
	int arr[];
	int cap, size;

	Myhash(int c) {
		cap = c;
		size = 0;
		arr = new int[cap];
		for (int i = 0; i < cap; i++) {
			arr[i] = -1;
		}

	}

	int hash(int key) {
		return key % cap;
	}

	void insert(int key) {
		if (size >= cap) {
			return;
		}
		int i;
		for (i = hash(key); arr[i] != -1 && arr[i] != -2 && arr[i] != key; i = (i + 1) % cap) {
			;
		}
		arr[i] = key;
		size++;
	}


	boolean search(int key) {
		if (size == 0) {
			return false;
		}
		int i = hash(key), j = i;
		while (arr[i] != -1 && i != j) {
			if (arr[i] == key) {
				return true;
			}
			i = (i + 1) % cap;


		}
		return false;
	}
}
public class hashing{
	public  static  void main(String args[])
	{
		Myhash h=new Myhash(7);
		h.insert(49);
		h.insert(56);
		h.insert(63);
		h.insert(54);
		h.insert(33);
		h.insert(36);
		h.insert(78);
		System.out.println(h.search(54));
	}
}
