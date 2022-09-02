package inno.iterator;

public class Test {
    public static void main(String[] args) {
        List list = new ListImpl();
        list.add("A");
        list.add("B");
        list.add("C");

        //第一种迭代方式
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("======");

        //第二种迭代方式
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}
