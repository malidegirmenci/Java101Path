package Ex26_AverageofArray;

public class HarmonicAverageOfArray {
    public static void main(String[] args) {

        // created array and variable
        double[] nums = {1, 2, 3, 4, 5};
        double harmonicAverage;
        double harmonicSeries = 0;

        // calculated harmonic series
        for (double i : nums) {
            harmonicSeries += 1 / i;
        }
        // calculated average of harmonic series
        harmonicAverage = nums.length / harmonicSeries;

        // print harmonic series addition and average
        System.out.println("Addition of Harmonic Series: "+harmonicSeries);
        System.out.println("Average of Harmonic Series: "+harmonicAverage);
    }
}
