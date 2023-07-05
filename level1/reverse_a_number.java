
public class reverse_a_number {

    public static void main(String[] args) {

        int num = 4567;

        // method 1
        // int rev = 0;
        // while (num != 0) {
        //     rev = num % 10;
        //     num = num / 10;
        //     System.out.print(rev);
        // }

        // Method2:- using StringBuffer class
        // StringBuffer sb = new StringBuffer(String.valueOf(num));
        // StringBuffer rev2 = sb.reverse();
        // System.out.println(rev2);

        // Method3:- using StringBuilder class
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev3 = sb1.reverse();
        System.out.println(rev3);

    }
}
