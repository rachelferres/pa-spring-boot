package uk.ac.belfastmet.largestBuildings.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.largestBuildings.domain.LargestBuilding;

@Service
public class LargestBuildingService {
	
	public static ArrayList<LargestBuilding> largestBuilding = new ArrayList<LargestBuilding>();

	
	public void initLargestBuildings() {
		
		largestBuilding.add(new LargestBuilding("Pryamid Building", 78));
		largestBuilding.add(new LargestBuilding("Gyro Building", 58));
		
	}
	
	public ArrayList<LargestBuilding> getLargestBuildingUsableVolume(){
		return largestBuilding;
	}
	
	public ArrayList<LargestBuilding> getLargestBuildingFloorArea(){
		return largestBuilding;
	
		
	}
}
	
	

	