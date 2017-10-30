package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Question;
import entities.QuestionContainer;

public class QuestionController {
	File file;
	ObjectMapper objMapper;
	FileWriter fileWriter;
	Scanner scanner;

	public QuestionController() {
		file = new File("Questions.txt");
		objMapper = new ObjectMapper();
	}

	private List<Question> getTaggedQuestionList(Predicate<? super Question> predicate) {
		return QuestionContainer.getQuestionList().stream().filter(predicate)
				.collect(Collectors.toCollection(ArrayList::new));
	}
	
	public List<Question> getQuestions(int number, Predicate<? super Question> predicate) { 
		List<Question> taggedQuestionList = getTaggedQuestionList(predicate);
		List<Question> temp = new ArrayList<Question>();
		Collections.shuffle(taggedQuestionList);
		for(int i=0;i<number;i++) {
			temp.add(taggedQuestionList.get(i));
		}
		return temp;
	}

	public void removeQuestion(Question question) {
		try {
			String temp = objMapper.writeValueAsString(question);
			scanner = new Scanner(new FileReader(file));
			while (scanner.hasNextLine()) {
				List<String> lines = FileUtils.readLines(file);
				List<String> updatedLines = lines.stream().filter(s -> !s.contains(temp)).collect(Collectors.toList());
				FileUtils.writeLines(file, updatedLines);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		} finally {
			scanner.close();
		}
		QuestionContainer.removeQuestion(question);
	}

	public void addQuestion(Question question) {
		try {
			fileWriter = new FileWriter(file, true);
			String temp = objMapper.writeValueAsString(question);
			System.out.println(temp);
			fileWriter.write(temp + System.lineSeparator());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		QuestionContainer.addQuestion(question);
	}
}
