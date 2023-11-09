package com.example.demo.service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AddressCSV;
import com.example.demo.repository.CSVRepository;

@Service
public class CSVReaderWriterService {
	
	private static final String CSV_FILE_PATH = "E:/All DATA/JAVA/Advance Java/Spring/SpringBootCSVDemoAPI/src/main/java/com/example/demo/model/PinCode.csv";
	
	@Autowired
	CSVRepository csvRepository;
	
	public List<AddressCSV> findAll()
	{
		return (List<AddressCSV>) csvRepository.findAll();
	}
	
//	List<AddressCSV> addressCSVs = new ArrayList<>();
//
//    public CSVReaderWriterService(FileReader reader) {
//
//    }
//
//    public List<AddressCSV> readCSV() throws IOException {
//        CSVReaderWriterService reader = new CSVReaderWriterService(new FileReader(CSV_FILE_PATH));
//        List<String[]> rows = reader.readAll();
//        try {
//            reader.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//
//        List<AddressCSV> persons = new ArrayList<>();
//        for (int i = 1; i < rows.size(); i++) { // Start from index 1 to skip the header row
//            String[] row = rows.get(i);
//            Person person = new Person();
//            person.setName(row[0]);
//            person.setEmail(row[1]);
//            person.setPhone(row[2]);
//            persons.add(person);
//        }
//
//        return persons;
//    }
//
//    private List<String[]> readAll() {
//		return null;
//    }

}
