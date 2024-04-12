public class fibanocciSeries {
    public static void main(String[] args) {
        int n = 10;
        int firstNo = 0;
        int secondNo  = 1;
        System.out.println("fibanoccii series of "+ n + " numbers:");
        System.out.println(firstNo + " " + secondNo + " ");
        for(int i = 2; i < n; i++){
            int nextNo = firstNo + secondNo;
            System.out.println(nextNo+" ");
            firstNo = secondNo;
            secondNo = nextNo;
        }
    }
}
