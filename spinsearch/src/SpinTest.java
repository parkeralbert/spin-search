
import java.util.ArrayList;
import java.util.Date;
public class SpinTest {
	 /**
     * This is our test. It creates a spider (which creates spider legs) and crawls the web.
     * 
     * @param args
     *            - not used
     */


	
	public static void main(String[] args) throws Exception
    {
		String readPath = "/Users/parkeralbert/Downloads/new_spin_inputs.txt";
		String writePath = "/Users/parkeralbert/Downloads/spins.txt";
		String delim = "<>";
        XpnSearch xpn = new XpnSearch();
        Date firstDayOfWeek = xpn.getFirstDayOfWeek(readPath);
        Date lastDayOfWeek = xpn.getLastDayOfWeek(readPath);
        if(firstDayOfWeek == null) {
        	System.out.println("No first date found");
        }
        if(lastDayOfWeek == null) {
        	System.out.println("No last date found");
        }
		System.out.println("This week is " + firstDayOfWeek + " - " + lastDayOfWeek);
        ArrayList <ArtistInfo> searchList =  xpn.getArtistList(readPath, delim);
        xpn.spinSearch("https://xpn.org/playlists/playlist-search", searchList, firstDayOfWeek, lastDayOfWeek, writePath);
    }
}
