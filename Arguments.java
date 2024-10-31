public class Arguments {
    public static void main(String[] args) {
        for(int i=0;i<args.length;++i)
            System.out.println("arg_"+i+": "+args[i]);
    }
}
/*
INPUT--->  java Arguments.java Honey Chilli Potato
OUTPUT-->
           arg_0: Honey
           arg_1: Chilli
           arg_2: Potato
*/
