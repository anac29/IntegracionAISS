package aiss.api.resources.comparators;

import java.util.Comparator;

import aiss.model.Song;

public class ComparatorAlbumSong implements Comparator<Song>{
	@Override
	public int compare(Song s1, Song s2) {
		// TODO Auto-generated method stub
		return s1.getAlbum().compareTo(s2.getAlbum());
	}
}
