public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"mangoes", "apples", "mountain", "forever", "33-33", "centimeter", "kg-kilogram", "manifest/46", "40,000 kilometer", "w to w", "path-way", "23,017"};
        String[] wordListTwo = {"beautiful", "joke", "astonished", "making-it", "nice/work", "manage", "attitude", "salute", "games", "grace", "pour-water", "broken", "BBQ", "you/funny", "well-well", "sweet"};
        String[] wordListThree = {"planet-fitness", "jogging", "coca-cola", "accomplish", "song", "ingredient", "chocolate", "prompt", "equation", "tonal", "bash", "pond", "butterflies"};
        {
            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;
            {
                System.out.println(oneLength);
                System.out.println(twoLength);
                System.out.println(threeLength);
            }
            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);
            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
            {
                System.out.println(rand1);
                System.out.println(rand2);
                System.out.println(rand3);
                System.out.println("What we need is a " + phrase);
            }
        }
    }
}