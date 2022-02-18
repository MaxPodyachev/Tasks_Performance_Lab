public class Task1 {
    public static void main(String[] args) {
        //числа n и m должны быть строго меньше 10, а иначе собьется интервал m

        System.out.println(intervalPath(3, 4));

    }
        public static int intervalPath ( int n, int m){

            String s = "";
            String str = "";
            for (int i = 1, j = 0; i > 0; i++) {
                if (i > n) {
                    i = 1;
                }
                if (m > s.length()) {
                    s += i + "";
                } else {
                    str += s.charAt(0);
                    j++;
                    if (s.charAt(s.length() - 1) == '1') {
                        int num = Integer.parseInt(str);
                        return num;
                    }
                    if (i == 1) {
                        i = n;
                        s = "";
                        s += i + "";
                        i = 0;
                    } else {
                        s = "";
                        i--;
                        s += i + "";
                    }
                }
            }
            int num = Integer.parseInt(str);
            return num;
        }
    }