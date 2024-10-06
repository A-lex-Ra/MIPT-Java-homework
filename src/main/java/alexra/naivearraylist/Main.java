package alexra.naivearraylist;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> myList = new CustomArrayList<>();

        myList.add(1);
        myList.add(3);
        myList.add(988);
        myList.add(1662);

        printCustomList(myList);

        System.out.println("Deleting first number...");
        myList.remove(0);

        printCustomList(myList);
        // There MUST be a crash -----------------------v
        // System.out.println("Fourth number is "+myList.get(3));
    }

    public static void printCustomList(CustomList list) {
        System.out.print("my list now: ");
        for (int i = 0; i < list.getLength(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}