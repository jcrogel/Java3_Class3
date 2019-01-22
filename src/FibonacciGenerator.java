public class FibonacciGenerator {

    public long getFib(long pos){
        long first = 0;
        long second = 1;
        long result = 0;
        for (int cnt=1; cnt<pos; cnt++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

}
