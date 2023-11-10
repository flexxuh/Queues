/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

public class Permutation {
    public static void main(String[] args) {

        RandomizedQueue<String> rand = new RandomizedQueue<>();

        while (!StdIn.isEmpty()) {
            String a = StdIn.readString();
            rand.enqueue(a);
        }


        int i = Integer.parseInt(args[0]);
        for (String s : rand) {
            if (i > 0) {
                System.out.println(s);
                i--;
            }
        }

    }
}
