import java.util.HashMap;
import java.util.Set;

//Create a trackList of type HashMap
// Add in at least 4 songs that are stored by title
//Pull out one of the songs by its track title
//Print out all the track names and lyrics in the format Track: Lyrics

public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> userSongs = new HashMap<String, String>();
        userSongs.put("Track 1", "Hotel California");
        userSongs.put("Track 2", "Take it Easy");
        userSongs.put("Track 3", "Desperado");
        userSongs.put("Track 4", "Tequila Sunrise");

        System.out.println(userSongs); // {Track 1", "Hotel California","Track 2", "Take it Easy","Track 3", "Desperado","Track 4", "Tequila Sunrise" }
        String name = userSongs.get("Track 2");
        System.out.println("Track: " + name); // Track: Take it Easy
    
        //get the keys by using the keySet method
        Set<String> keys = userSongs.keySet();
        for(String key : keys) { //it will be in a loop
            System.out.println(key);//Track 1, Track 2, Track 3, Track 4
            System.out.println(userSongs.get(key));// Take it Easy, Hotel California, Tequila Sunrise, Desperado
        
        }

    }


}
