public class reverse1 {
    public static void main(String[] args) {
    int n=325345,rev =0;
    int x =n;
    while (n>0){
        rev=(rev*10+n%10);
        n=n/10;
    }
    System.out.println(rev);
    }
}
