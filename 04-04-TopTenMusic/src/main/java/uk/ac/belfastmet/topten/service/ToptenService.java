package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.topten.domain.Topten;

@Service
public class ToptenService {
	
	private ArrayList<Topten> singleTopten;
	private ArrayList<Topten> albumTopten;
	
	
	public ArrayList<Topten> getSingleTopten(){
		this.singleTopten = new ArrayList<Topten>();
		
		this.singleTopten.add(new Topten("Ed Sheeran ft Stormzy", "Take me back to London", "edLondon.png"));
		this.singleTopten.add(new Topten("Aitch", "Taste", "taste.png"));
		this.singleTopten.add(new Topten("Kygo", "Higher Love", "higherLove.png"));
		this.singleTopten.add(new Topten("AJ Tracey", "Ladbroke Grove", "ladbroke.png"));
		this.singleTopten.add(new Topten("Post Malone", "Circles", "circles.png"));
		this.singleTopten.add(new Topten("Joel Corry", "Sorry", "sorry.png"));
		this.singleTopten.add(new Topten("Dominic Fike", "3 Nights", "3nights.png"));
		this.singleTopten.add(new Topten("Lil Tecca", "Ransom", "ransom.png"));
		this.singleTopten.add(new Topten("Young T", "Strike a Pose", "strike.png"));
		this.singleTopten.add(new Topten("Post Malone", "Goodbyes", "goodbye.png"));
		
		return this.singleTopten;
	}
	
	
	public ArrayList<Topten> getAlbumTopten(){
		this.albumTopten = new ArrayList<Topten>();
		
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		this.albumTopten.add(new Topten("Sleepy", "Disney", "Sleepy.png"));
		
		return this.albumTopten;
	}

}
