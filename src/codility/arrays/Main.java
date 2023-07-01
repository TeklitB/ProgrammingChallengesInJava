package codility.arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Array after K rotations ***");
        int[] B = CyclicRotation.cyclicRotationArrayByK(new int[] {3, 8, 9, 7, 6}, 3);
        System.out.println(CyclicRotation.toString(B));

        // Odd Occurrence
        System.out.println("*** Find the element with odd occurrence ***");
        System.out.println(OddOccurrencesInArray.findUnpairedElement(new int[] {9,3,9,3,9,7,9}));
    }
}
