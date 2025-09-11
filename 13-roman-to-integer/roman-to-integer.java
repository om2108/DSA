class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> R = new HashMap<>();
        R.put('I',1);
        R.put('V',5);
        R.put('X',10);
        R.put('L',50);
        R.put('C',100);
        R.put('D',500);
        R.put('M',1000);
        int sum=0;

        for (int i = 0; i < s.length(); i++) {
            int value = R.get(s.charAt(i));

            if (i + 1 < s.length() && value < R.get(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }return sum;
    }
}