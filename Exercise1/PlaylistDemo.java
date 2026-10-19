/**
 * PlaylistDemo class
 * Driver program to test the Track class
 *
 * Name Kerem Dündar
 * Student ID 250446034
 * Date 19 10 2026
 */
public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        Track defaultTrack = new Track();
        System.out.println("Default Track: ");
        System.out.println(defaultTrack);

        Track titleTrack = new Track("Neon Lights");
        System.out.println("\nTitle-only track:");
        System.out.println(titleTrack);

        Track artistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("\nTitle + Artist Track:");
        System.out.println(artistTrack);

        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("\nFull Track (non-explicit):");
        System.out.println(fullTrack);

        System.out.println("\nInvalid Duration Test:");
        Track brokenTrack = new Track("Broken Clock", "Static Noise", -5, false);
        System.out.println(brokenTrack);

        System.out.println("\nGetter Test:");
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());
    }
}
