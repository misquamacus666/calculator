
public class Variables {
    public static void main(String[] args) {
        String hello = "Siemano ";
        String world = "Swiecie!";
        String powitanie = hello + world;
        System.out.println(powitanie);

        String czesc = powitanie.substring(0, 5) + " uczniu";
        System.out.println(czesc);
    }
}