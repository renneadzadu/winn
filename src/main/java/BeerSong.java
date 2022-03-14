public class BeerSong {
    public static void main(String[] args) {
    int beerNum = 99;
    String word = "bottles";
    while (beerNum > 0) {
        if (beerNum == 1) {
            word = "bottle"; //this might be the bug because it'ss says "bottle" rather than bottles but then again when I check the equation on the console form, it print out right when it gets to #1 so maybe not :)
        }
        System.out.println(beerNum + " " + word + " of beer on the wall."); // this might also be the bug because it's missing a period at the end
        System.out.println(beerNum + " " + word + " of beer.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
        beerNum = beerNum - 1;
        if (beerNum > 0) {
            System.out.println(beerNum + " " + word + " of beer on the wall.");}// this might also be the bug because it's missing a period at the end
        else {
            System.out.println("No more bottles of beer on the wall.");
        }
    }
    }
}
