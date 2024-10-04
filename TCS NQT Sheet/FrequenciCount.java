public class FrequenciCount {
    public static void frequencyCount(int arr[],int N,int P){
        int freq[]= new int[N];
        for(int i=0;i<N;i++){
            if(arr[i]>=1 && arr[i]<=N){
                freq[arr[i]-1]++;
            }
        }
        for(int i=0;i<N;i++){
            arr[i]=freq[i];
        }
    }
    public static void main(String[] args) {
        int arr[]= {2, 3, 2, 3, 5};
        int N=5;
        int P=5;

        frequencyCount(arr, N, P);

        for(int i=0;i<N;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
