public class Loops {
    
    public <T>void rangeBased(T[] arr){
        for (T item:arr){
            System.out.print(item+" ");
        }
        System.out.println();
    }
    public <T>void indexBased(T[] arr){
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public <T> void whileLoop(T[] arr){
        int a_length = arr.length, index = 0;
        //while loop
        while(index != a_length){
            System.out.print(arr[index]+" ");
            index++;
        }
        System.out.println();
    }
    public <T> void doWhileLoop(T[] arr){
        int a_length = arr.length, index = 0;

        do{
            System.out.print(arr[index]+" ");
            index++;
        }
        while(index != a_length);
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        String[] arr2 = {"Pen","Pineapple","Apple","Pen","Pineapple Pen"};
        Loops obj = new Loops();
        obj.rangeBased(arr);
        obj.indexBased(arr2);
        obj.whileLoop(arr);
        obj.doWhileLoop(arr2);
    }
}
