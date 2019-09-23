package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.TODO.domain.ToDo;
import uk.ac.belfastmet.topten.domain.Topten;

@Service
public class ToptenService {
	
	private ArrayList<Topten> singleTopten;
	private ArrayList<Topten> albumTopten;
	
	/**
	 * 
	 * @return
	 */
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
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Topten> getAlbumTopten(){
		this.albumTopten = new ArrayList<Topten>();
		
		this.albumTopten.add(new Topten("Post Malone", "Hollywood's Bleeding", "bleeding.jpg"));
		this.albumTopten.add(new Topten("Ed Sheeran", "No 6 Collaborations Project", "no6.jpg"));
		this.albumTopten.add(new Topten("Aitch", "Aitch20", "aitch20.jpg"));
		this.albumTopten.add(new Topten("Taylor Swift", "Lover", "lover.jpg"));
		this.albumTopten.add(new Topten("Lewis Capaldi", "Divinely Uninspired to a Hellish Extent", "divinely.jpg"));
		this.albumTopten.add(new Topten("Status Quo", "Backbone", "backbone.jpg"));
		this.albumTopten.add(new Topten("Lana Del Rey", "Norman F**king Rockwell", "norman.jpg"));
		this.albumTopten.add(new Topten("Melanie Martinez", "K-12", "k12.jpg"));
		this.albumTopten.add(new Topten("Jax Jones", "Snacks", "snacks.jpg"));
		this.albumTopten.add(new Topten("Billie Eilish", "When We All Fall Asleep Where Do We Go", "billie.jpg"));
		
		return this.albumTopten;
	}

}
