public class Harmonic_Avarage {
    public static void main(String[] args) {
        int [] list={2,4,5};
        double sum=0.0;
        for(int i=0;i< list.length;i++){
            sum+=(double) 1/list[i];
        }
        double avarage= list.length/sum;
        System.out.println(avarage);
    }
}
