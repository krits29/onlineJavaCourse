import java.util.ArrayList;

/**
 * Created by kritisharma on 2/14/20.
 */
public class Album
{
    private String name;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String title, double duration)
    {
        if(findSong(title) == null)
        {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong (String title)
    {
        for(Song checkedSong: this.songs)   // alternative of doing i //create a variable called checkedSong
        {
            if(checkedSong.getTitle().equals(title))
            {
                return checkedSong;
            }
        }
        return null;
    }

//    private Song findSong(String name)
//    {
//        ???
//    }

}
