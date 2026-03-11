class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String s : operations) {

            if (s.equals("C")) {
                if (st.size() != 0) {
                    st.pop();
                }
            } else if (s.equals("D")) {
                if (st.size() != 0) {
                    int temp = st.pop();
                    st.push(temp);
                    st.push(temp * 2);
                }
            } else if (s.equals("+")) {
                if (st.size() >= 2) {
                    int temp1 = st.pop();
                    int temp2 = st.pop();

                    st.push(temp2);
                    st.push(temp1);
                    st.push(temp1 + temp2);
                }
            } else {
                st.push(Integer.parseInt(s));
            }

        }

        int sum = 0;
        for (int i : st) {
            sum += i;
        }

        return sum;
    }
}