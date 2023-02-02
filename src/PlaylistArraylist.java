import java.util.ArrayList;
import java.util.Arrays;

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

            //initialize the Array object
        MyArrays myArrays = new MyArrays();
        int myArr[] = myArrays.createArray();
        System.out.println("The newly created array is: "+Arrays.toString(myArr));

        myArray();
        }

        public static void myArray(){
            String[] studentNames = new String[3];
            studentNames[0] = "Eric";
            studentNames[1] = "Anonymous";
            studentNames[2] = "Palmer";

            int[] numbers ={10, 17, 7, 11, 33};
            Arrays.sort(numbers);

            System.out.println("My array of names: "+Arrays.deepToString(studentNames));
            System.out.println("My sorted array of numbers is: "+Arrays.toString(numbers));
        }

    }

