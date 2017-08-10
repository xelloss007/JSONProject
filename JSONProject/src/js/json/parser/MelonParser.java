package js.json.parser;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.tacademy.json.vo.Artist;
import com.tacademy.json.vo.Melon;
import com.tacademy.json.vo.Song;

public class MelonParser {
	public Melon doMelonParser(String jsonString){
		//		Artist artist = new Artist();
		//		Song song = new Song();
		Melon melon = null;
		JSONObject obj1 = null;
		JSONObject Json = null;

		try {

			obj1 = new JSONObject(jsonString);
			Json = obj1.getJSONObject("melon");
			melon = new Melon();

			melon.setMenuld(Json.getInt("menuId"));
			melon.setCount(Json.getInt("count"));
			melon.setPage(Json.getInt("page"));
			melon.setTotalPages(Json.getInt("totalPages"));
			melon.setRankDay(Json.getString("rankDay"));
			melon.setRankHour(Json.getString("rankHour"));
//			ArrayList<Song> SongArray = new ArrayList<Song>();
			JSONObject songs =  Json.getJSONObject("songs");
			JSONArray songArr = songs.getJSONArray("song");

			Song song = null;
			JSONObject tempSong = null;
			JSONObject art = null;
			JSONArray artistArr = null;
			Artist artist = null;
			JSONObject tempArtist = null;
//			ArrayList<Artist> artists;
			for(int i = 0; i < songArr.length(); i++ ){
				tempSong = songArr.getJSONObject(i);
				song = new Song();
				song.setSongld(tempSong.getInt("songId"));
				song.setSonName(tempSong.getString("songName"));
//				artists = new ArrayList<Artist>();

				art = tempSong.getJSONObject("artists");
				artistArr = art.getJSONArray("artist");

				for(int J = 0; J < artistArr.length(); J++){
					tempArtist = artistArr.getJSONObject(J);
					artist = new Artist();
					artist.setArtistId(tempArtist.getInt("artistId"));
					artist.setArtistName(tempArtist.getString("artistName"));
//					artists.add(artist);
					song.getArtists().add(artist);
				}
//				song.setArtists(artists);

				song.setAlbumId(tempSong.getInt("albumId"));
				song.setAlbumName(tempSong.getString("albumName"));
				song.setCurrentRank(tempSong.getInt("currentRank"));
				song.setPastRank(tempSong.getInt("pastRank"));
				song.setPlayTime(tempSong.getInt("playTime"));
				song.setIssueDate(tempSong.getString("issueDate"));
				song.setTitleSong(tempSong.getBoolean("isTitleSong"));
				song.setHitSong(tempSong.getBoolean("isHitSong"));
				song.setAdult(tempSong.getBoolean("isAdult"));
				song.setFree(tempSong.getBoolean("isFree"));
//				SongArray.add(song);
				song.getArtists().add(artist);
			}
		} catch (JSONException e) {
			System.out.println("json 파싱 오류 : " + e);
		}


		return melon;
	}
}
