import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord{
    public static void main(String[] args) {
        String challenger = "";
        String champ = StdIn.readString();
        //StdOut.println(champ);

        int count = 1;
        while (!StdIn.isEmpty()) {
            count++;
            challenger = StdIn.readString();
            //StdOut.println(champ);

        if (StdRandom.bernoulli((1.0/count))) {
            champ = challenger;
            }
            else {
                }
                //StdOut.println(champ);
                }
        StdOut.println(champ);
            }}