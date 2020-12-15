# spin-search
Script that searches and stores promoted artists spins from radio playlists

STEPS TO RUN LOCALLY:
1. Download JSoup
2. Pull entire project from github
3. Clean the project by navigating to Project > Clean
4. Delete libraries with fixed pathnames from other machines by navigating to Project > Properties > Java Build Path > Libraries
5. Within the project, navigate to the SpinTest class
6. 
9. There are two separate input files for this project: "album_input.txt" and "song_input.txt".You can change the artist, project, and label names of "spins.txt" file, as well as the dates, but make sure the EXACT same format
   from the orignal document is maintained - this includes keeping the same number of spaces, keeping the "albums:" and "singles:" headers the same,
   and keeping the '<>' delimiters unless the delimiter string is changed within the code
10. Run the code from the SpinTest class and voila! You should have a list of all of the promoted artists' spins from WXPN within the specified 
   date range, organized by artist

NOTE: This is a work in progress, unit tests are still being created to fine tune the project, and extra functionalities are likely to be pushed down the line.

You can email me at parkeralbert1@gmail.com if you have any questions or concerns!
