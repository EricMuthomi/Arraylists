import java.util.ArrayList;

public class PlaylistArraylist {
   public static void main(String[] args) {
            //Create desertIslandPlaylist
            ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

            //Add songs to the playlist
            desertIslandPlaylist.add("The Spectre by Alan Walker");
            desertIslandPlaylist.add("Alone by Alan Walker");
            desertIslandPlaylist.add("Closer by ChainSmokers");
            desertIslandPlaylist.add("Heros Tonight by Janji");
            desertIslandPlaylist.add("Avoid Those People-Wakadinali");
            desertIslandPlaylist.add("Extra Pressure-Wakadinali");

            System.out.println(desertIslandPlaylist);
            //Check the number of songs in desertIslandPlaylist
            System.out.println(desertIslandPlaylist.size());
            //Remove songs so we have only 5 remaining
            desertIslandPlaylist.remove(1);
            System.out.println(desertIslandPlaylist);
            System.out.println(desertIslandPlaylist.size());
            //Change the playlist order
            //use indexOf() to get the indices of the two songs we want to swap in our playlist
            int indexOfA = desertIslandPlaylist.indexOf("Avoid Those People-Wakadinali");
            int indexOfB = desertIslandPlaylist.indexOf("The Spectre by Alan Walker");

//Create a new string variable and initialize it with the value of song a. Do the same for song b.
            String tempA = "Avoid Those People-Wakadinali";
            String tempB = "The Spectre by Alan Walker";

//Call set() method on our playlist to add song b where a was, and vice versa
            desertIslandPlaylist.set(indexOfA, tempB);
            desertIslandPlaylist.set(indexOfB, tempA);

//print out the playlist; it should show the new order
            System.out.println(desertIslandPlaylist);
        }

    }

