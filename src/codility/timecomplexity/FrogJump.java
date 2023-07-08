package codility.timecomplexity;

public class FrogJump {
    /*
    A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to
    get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D. Count the minimal
    number of jumps that the small frog must perform to reach its target.
    For example, given:
      X = 10
      Y = 85
      D = 30
    the function should return 3, because the frog will be positioned as follows:
        - after the first jump, at position 10 + 30 = 40
        - after the second jump, at position 10 + 30 + 30 = 70
        - after the third jump, at position 10 + 30 + 30 + 30 = 100
     */
    public static int countMinimalJump(int X, int Y, int D) {
        int diff = Y - X;

        if (diff == 0) return 0;

        if (D > diff) return  1;

        return (diff % D == 0) ? (diff / D) : (diff / D) + 1;
    }
}
