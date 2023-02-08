
public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] diziTmp = new int[dizi.length];
        int diziCount=0;
        System.out.println("Tekrar Sayıları");
        for(int i=0;i<dizi.length;i++){
            int count=1;
            for (int j=0;j<dizi.length;j++){
                if(i!=j && dizi[i]==dizi[j]){
                    ++count;
                }
            }

            if(isCheck(diziTmp,dizi[i])){
                System.out.println(dizi[i]+" syaısı "+count+"kere tekrar edildi.");
                //System.out.print();
            }
            diziTmp[diziCount++] = dizi[i];

        }
    }

    static boolean isCheck(int[] arr,int value){
        for (int d:arr) {
            if (d==value) {
                return false;
            }

        }
        return true;
    }
}
