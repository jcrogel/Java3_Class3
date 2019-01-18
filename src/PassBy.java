public class PassBy {

    public int value;

    public void passByReference(PassBy obj){
        obj.value++;
    }

    public void passByValue(int value){
        value++;
    }

    public static void main(String args[]){
        PassBy obj = new PassBy();
        obj.value = 10;
        obj.passByValue(obj.value);
        System.out.println("After passByValue:"+obj.value);

        obj.passByReference(obj);
        System.out.println("After passByReference:"+obj.value);

    }
}
