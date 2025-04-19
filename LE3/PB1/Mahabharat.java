
public class Mahabharat {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println("Arjun: ");
        arjun.fight();
        arjun.obey();
        System.out.println(arjun.kind());

        System.out.println("Bheem: ");
        bheem.fight();
        bheem.obey();
        System.out.println(bheem.kind());

        System.out.println("Duryodhan: ");
        duryodhan.fight();
        duryodhan.obey();
        System.out.println(duryodhan.kind());

        System.out.println("Vikarn: ");
        vikarn.fight();
        vikarn.obey();
        System.out.println(vikarn.kind());
    }
}
