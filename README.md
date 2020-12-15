# spin-search
Script that searches and stores promoted artists spins from radio playlists

STEPS TO RUN LOCALLY:
1. Download JSoup
2. Pull entire project from github
3. Clean the project by navigating to Project > Clean
4. Delete libraries with fixed pathnames from other machines by navigating to Project > Properties > Java Build Path > Libraries
5. There are two separate input files for this project: "album_input.txt" and "song_input.txt" - both are within the project directory, so you should not have to change the filepath. You can change the artist, project, and label names of "spins.txt" file, as well as the dates, but make sure to keep the EXACT same format from the original file - this includes keeping the same number of spaces, keeping the "albums:" and "singles:" headers the same, and keeping the '<>' delimiters unless the delimiter string is changed within the code. The same applies to "song_input.txt" - you can change the artist and song names, but maintain the exact same format. MAKE SURE the same artists are listed on both files, or you will encounter problems.
6. Within the project, navigate to the SpinTest class
7. Run the code from the SpinTest class and voila! You should have a list of all of the promoted artists' spins from WFMU and WXPN within the specified 
   date range for each artist
8. If you would like to check against a reference file for what spins should be outputted, open the file in the project directory titled "reference_spins.txt". I have deleted the spins on the reference file that contained spelling errors on the playlist sites, since that is currently out of scope of the script.

NOTE: This is a work in progress, unit tests are still being created to fine tune the project, and extra functionalities will be pushed as I update it.

You can email me at parkeralbert1@gmail.com if you have any questions or concerns!
