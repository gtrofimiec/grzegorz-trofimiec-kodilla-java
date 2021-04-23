import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    String playerName;
    String randPCKey;
    public int roundsNumber;
    public int roundCounter;
    boolean end = false;

    @Override
    public String toString() {
        return "RpsRunner{" +
                "randPCKey='" + randPCKey + '\'' +
                '}';
    }

    public void introduction() {
        roundCounter = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Witam w grze.\nJak masz na imie?");
        playerName = scan.next();

        System.out.println("Witaj " + playerName + ". Ile rund chcesz zagrac?");
        roundsNumber = scan.nextInt();

        System.out.println("Liczba rund: " + roundsNumber + ". Oto instrukcja gry:");
        System.out.println("\nklawisz 1 – zagranie kamień," +
                "\nklawisz 2 – zagranie papier," +
                "\nklawisz 3 – zagranie nożyce," +
                "\nklawisz x – zakończenie gry," +
                "\nklawisz n – uruchomienie gry od nowa" +
                "\n\nZaczynamy grę!" +
                "\nTwój ruch ...");

        while(!end) {
            String gameKey = scan.next();
            if(gameKey=="1") {
                System.out.println("Zagrałeś KAMIEN");
            } else if (gameKey=="2") {
                System.out.println("Zagrałeś PAPIER");
            } else if (gameKey=="3") {
                System.out.println("Zagrałeś NOŻYCE");
            }
            randPCKey = String.valueOf(rand.nextInt(2)+1);

            if(randPCKey=="1") {
                System.out.println("Komputer zagrał KAMIEN");
            } else if (randPCKey=="2") {
                System.out.println("Komputer zagrał PAPIER");
            } else if (randPCKey=="3") {
                System.out.println("Komputer zagrał NOŻYCE");
            }

            System.out.println(randPCKey);
            end=!end;
        }

    }
    public static void main(String[] args) {

        RpsRunner game1 = new RpsRunner();
        game1.introduction();
    }
}
