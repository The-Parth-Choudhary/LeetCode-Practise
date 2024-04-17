package Array;

public class Q2502 {
    class Allocator {
        int[] arr;
        int n;

        public Allocator(int n) {
            arr = new int[n];
            this.n = n;
        }

        public int allocate(int size, int mID) {
            for (int i = 0; i < n; i++) {
                boolean got = true;
                for (int j = i; j < i + size; j++) {
                    if (j == n || arr[j] != 0) {
                        i = j;
                        got = false;
                        break;
                    }
                }

                if (got) {
                    for (int j = i; j < i + size; j++) {
                        arr[j] = mID;
                    }

                    return i;
                }
            }

            return -1;
        }

        public int free(int mID) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == mID) {
                    cnt++;
                    arr[i] = 0;
                }
            }

            return cnt;
        }
    }
}
