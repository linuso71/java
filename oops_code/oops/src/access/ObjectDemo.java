package access;

public class ObjectDemo {
    public int num;
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        System.out.println(obj);
        System.out.println(obj.hashCode());
    }
}
