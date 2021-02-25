package Inner_class;

class Outer {
    int nums[];
    Outer(int n[]) {nums = n;}
    void Analyze() {
        Inner inOb = new Inner();
        System.out.println("Минимум: " + inOb.min());
        System.out.println("Maкcимум: " + inOb.max());
        System.out.println("Cpeднee: " + inOb.avg());
    }
    class Inner {//Внутренний класс
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < m) {m = nums[i];}
            }
            return m;
        }
        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > m) {m = nums[i];}
            }
            return m;
        }
        int avg() {
            int а = 0;
            for (int i = 0; i < nums.length; i++) а += nums[i];
            return а / nums.length;
        }
    }}
