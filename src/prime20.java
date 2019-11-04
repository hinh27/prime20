
public class prime20 {


        private static boolean check_prime(int n) {
            if(n<2) {
                return false;
            }else {
                int root = (int)Math.sqrt(n);
                for(int i=2; i<=root; i++) {
                    if(n%i==0) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {

            System.out.println("20 số nguyên tô đầu là:");
            for(int i=0; i<73; i++) {
                if(check_prime(i)==true) {
                    System.out.print(i+";");
                }
            }
        }

    }
