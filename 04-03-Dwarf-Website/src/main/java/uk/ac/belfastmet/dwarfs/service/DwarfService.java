package uk.ac.belfastmet.dwarfs.service;


import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

@Service
public class DwarfService {
	private static Logger logger = LoggerFactory.getLogger(DwarfService.class);
	
	@Autowired
	private DwarfRepository dwarfRepository;
	
	public Iterable<Dwarf> getNumberOfDwarfs(){
		
		logger.info("# of dwarfs: {}", dwarfRepository.count());
		Iterable<Dwarf> dwarf = dwarfRepository.findAll();
		Iterator<Dwarf> iterator = dwarf.iterator();
		while(iterator.hasNext()){
			logger.info("{}", iterator.next().toString());
		}
		return dwarf;
		
	}
	
	public Iterable<Dwarf> getDisneyDwarfs() {
		Iterable<Dwarf> dwarf = dwarfRepository.findAll();
		Iterator<Dwarf> iterator = dwarf.iterator();
		while(iterator.hasNext()){
			logger.info("{}", iterator.next().toString());
		}
		return dwarf;
	}

	public Iterable<Dwarf> getTolkienDwarfs() {

		Iterable<Dwarf> dwarf = dwarfRepository.findAll();
		Iterator<Dwarf> iterator = dwarf.iterator();
		while(iterator.hasNext()){
			logger.info("{}", iterator.next().toString());
		}
		return dwarf;
	}

}
