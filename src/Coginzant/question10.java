package Coginzant;

public class question10 {

    class segement{
        int []seg;
        int n;

         segement(int []arr) {
             n=arr.length;
           seg=new int[4*n];
           build(1,0,n-1,arr);
        }

        int gcd(int a ,int b){
             return b==0 ? a:gcd(a,a%b);
        }


        public void build(int index,int l,int r,int []arr){
            if(l==r){
                seg[index]=arr[l];
                return;
            }
            int mid=(l+r)/2;
             build(2*index,l,mid,arr);
            build(2*index+1,mid+1,r,arr);

            seg[index]=gcd(seg[2*index],seg[2*index+1]);
        }

        void update(int i,int value,int index,int l,int r){
            if(l==r){
                seg[index]=value;
                return;
            }
            int mid=(l+r)/2;
            if(index<=mid){
                update(2*i,value,index,l,mid);
            } else{
                update(2*i+1,value,index,mid+1,r);
            }
            seg[i] = gcd(seg[i* 2], seg[i * 2 +1]);
        }
         void update(int index,int value){
             update(1,value,index,0,n-1);
        }

        int query(int node, int l, int r, int ql, int qr) {

            if (ql > r || qr < l) {
                return 0;
            }

            if (ql <= l && r <= qr) {
                return seg[node];
            }

            int mid = (l + r) / 2;

            int left = query(node * 2, l, mid, ql, qr);
            int right = query(node * 2 + 1, mid + 1, r, ql, qr);

            return gcd(left, right);
        }

        int query(int l, int r) {
            if (l > r) {
                return 0;
            }

            return query(1, 0, n - 1, l, r);
        }

        int getAllGcd() {
            return seg[1];
        }

    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int countGoodSubseq(int[] nums, int p, int[][] queries) {

        int n = nums.length;

        // Store only numbers divisible by p.
        // Non-divisible numbers are represented by 0.
        int[] arr = new int[n];

        int divisibleCount = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] % p == 0) {
                arr[i] = nums[i];
                divisibleCount++;
            } else {
                arr[i] = 0;
            }
        }

        segement st = new segement(arr);

        int answer = 0;

        for (int[] query : queries) {

            int index = query[0];
            int value = query[1];

            // Remove old value from the segment tree
            if (nums[index] % p == 0) {
                divisibleCount--;
                st.update(index, 0);
            }

            // Add new value if divisible by p
            if (value % p == 0) {
                divisibleCount++;
                st.update(index, value);
            }

            nums[index] = value;

            // Case 1:
            // GCD of all usable elements is not p
            if (st.getAllGcd() != p) {
                continue;
            }

            // Case 2:
            // Some elements are not divisible by p.
            // Therefore all usable elements form a proper subsequence.
            if (divisibleCount < n) {
                answer++;
                continue;
            }

            // Case 3:
            // All elements are divisible by p.
            //
            // For n > 6, gcd == p guarantees a proper
            // subsequence with gcd p.
            if (n > 6) {
                answer++;
                continue;
            }

            // n <= 6:
            // Try removing each element.
            boolean found = false;

            for (int remove = 0; remove < n; remove++) {

                int leftGcd = st.query(0, remove - 1);
                int rightGcd = st.query(remove + 1, n - 1);

                int remainingGcd = gcd(leftGcd, rightGcd);

                if (remainingGcd == p) {
                    found = true;
                    break;
                }
            }

            if (found) {
                answer++;
            }
        }

        return answer;
    }
}


