public class StudentMarksRange {
    public static void main(String[] args) {
        int[] marks = {85, 92, 76, 45, 67, 90, 55, 33, 82, 79, 41, 68, 99, 100, 35};
        
        int range1 = 0, range2 = 0, range3 = 0, range4 = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 81 && marks[i] <= 100) {
                range1++;
            } else if (marks[i] >= 61 && marks[i] <= 80) {
                range2++;
            } else if (marks[i] >= 41 && marks[i] <= 60) {
                range3++;
            } else {
                range4++;
            }
        }
        System.out.println("Students with marks 81-100: " + range1);
        System.out.println("Students with marks 61-80: " + range2);
        System.out.println("Students with marks 41-60: " + range3);
        System.out.println("Students with marks  0-40: " + range4);
    }
}
