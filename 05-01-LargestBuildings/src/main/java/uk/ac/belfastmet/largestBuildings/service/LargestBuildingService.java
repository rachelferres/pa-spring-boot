package uk.ac.belfastmet.largestBuildings.service;

import java.util.ArrayList;

import org.apache.commons.logging.LogFactoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.largestBuildings.controller.LargestBuildingController;
import uk.ac.belfastmet.largestBuildings.domain.LargestBuilding;

public class LargestBuildingService {
	
	public static ArrayList<LargestBuilding> largestBuilding = new ArrayList<LargestBuilding>();
//	private ArrayList <LargestBuilding> largestBuildingFloorArea;
//	private ArrayList <LargestBuilding> largestBuildingFootprint;
//	private ArrayList <LargestBuilding> largestBuildingUsableVolume;
	
//	public ArrayList<LargestBuilding> getLargestBuildingFloorArea(){
//		this.largestBuildingFloorArea = new ArrayList<LargestBuilding>();
		
//		LargestBuilding largestBuildingFloorArea1 = new LargestBuilding("New Century Global Center", "Chengdu", "China");	
//		largestBuildingFloorArea1.setFloorArea(1760000);
//		//this.largestBuildingFloorArea.add(new LargestBuilding("New Century Global Center", "Chengdu", "China"));
//		
//		
//		
//		LargestBuilding largestBuildingFloorArea2 = new LargestBuilding("Dubai International Airport Terminal 3","Dubai", "UAE");
//		largestBuildingFloorArea2.setFloorArea(1713000);
//		//this.largestBuildingFloorArea.add(new LargestBuilding("Dubai International Airport Terminal 3","Dubai", "UAE"));
//		
//		LargestBuilding largestBuildingFloorArea3 = new LargestBuilding("Abraj Al-Bait", "Mecca", "Saudi Arabia");
//		largestBuildingFloorArea3.setFloorArea(1575815);
//		
//		
//		//this.largestBuildingFloorArea.add(new LargestBuilding("Abraj Al-Bait", "Mecca", "Saudi Arabia"));
//		return this.largestBuildingFloorArea;
		
		
//	}
	
//	public ArrayList<LargestBuilding> getLargestBuildingFootprint(){
//		this.largestBuildingFootprint = new ArrayList<LargestBuilding>();
//		
//		LargestBuilding largestBuildingFootprint1 = new LargestBuilding("AvtoVAZ main assembly building", "Tolyatti","Russia");
//		
//		LargestBuilding largestBuildingFootprint2 = new LargestBuilding("Jaguar Land Rover Solihull Plant", "Solihull", "UK");
//		
//		LargestBuilding largestBuildingFootprint3 = new LargestBuilding("Aalsmeer Flower Auction Building", "");
//		
//		return this.largestBuildingFootprint;
//		
//	}
	
	public void initLargestBuildings() {
		Logger logger = LoggerFactory.getLogger(LargestBuildingController.class);
		
		largestBuilding.
		largestBuilding.add(null);
		
	}
	
	public ArrayList<LargestBuilding> getLargestBuildingUsableVolume(){
		
		
		return largestBuilding;
	}
	
	public ArrayList<LargestBuilding> getLargestBuildingFloorArea(){
			
			
		return largestBuilding;
	
//		return this.largestBuildingUsableVolume;
		
	}
	
	
//	
//	/**
//	 * This should live in one of your controllers
//	 * You'll have to import the LargestBuildingService to the controller
//	 * You'll have to import postConstruct
//	 */
//	@PostConstruct 
//	public void makeBuildingList() {
//		LargestBuilding.initLargestBuilding();
//	}
	
	
	

}
