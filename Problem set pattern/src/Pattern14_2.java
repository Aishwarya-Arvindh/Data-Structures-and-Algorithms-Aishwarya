public class Pattern14_2 {
    public static void main(String[]args){
        int n=6;
        int count  =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
                count++;

            }
            System.out.println();

        }
    }
}
