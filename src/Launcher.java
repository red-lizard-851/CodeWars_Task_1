public class Launcher {
    public static void main (String[] args) {
        String[] names = {};
        System.out.println(Solution.whoLikesIt(names));

        String[] names1 = {"Peter"};
        System.out.println(Solution.whoLikesIt(names1));

        String[] names2 = {"Jacob", "Alex"};
        System.out.println(Solution.whoLikesIt(names2));

        String[] names3 = {"Max", "John", "Mark"};
        System.out.println(Solution.whoLikesIt(names3));

        String[] names4 = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(Solution.whoLikesIt(names4));
    }
}
