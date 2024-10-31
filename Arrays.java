public class Arrays {
    
    public void reverseArrayPopulator(int[] src, int[] dest){
        for(int i=0;i<dest.length;i++){
            dest[i] = src[dest.length - (i+1)];
        }
    }
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5};
        int[] createNow = new int[myArr.length];
        new Arrays().reverseArrayPopulator(myArr, createNow);

        //print Array createNow
        for(Integer el : createNow){
            System.out.print(el+" ");
        }
    }
}
