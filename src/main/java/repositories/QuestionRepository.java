package repositories;

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

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import entities.Question;
import entities.QuestionContainer;

public class QuestionRepository {
	File file;
	ObjectMapper objMapper;
	FileReader fileReader;
	FileWriter fileWriter;
	Scanner scanner;

	public QuestionRepository() {
		file = new File("Questions.txt");
		objMapper = new ObjectMapper();
		try {
			fileWriter = new FileWriter(file, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readQuestions() {
		try {
			QuestionContainer.empty();
			scanner = new Scanner(file);
			Question temp;
			while (scanner.hasNextLine()) {
				temp = objMapper.readValue(scanner.nextLine(), Question.class);
				QuestionContainer.addQuestion(temp);
			}
			temp = null;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			scanner.close();
			scanner = null;
		}
	}

	private List<Question> getTaggedQuestionList(Predicate<? super Question> predicate) {
		return QuestionContainer.getQuestionList().stream().filter(predicate)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	public List<Question> getQuestions(int number, Predicate<? super Question> predicate) {
		List<Question> taggedQuestionList = getTaggedQuestionList(predicate);
		List<Question> temp = new ArrayList<Question>();
		Collections.shuffle(taggedQuestionList);
		if(number>taggedQuestionList.size()) {
			number = taggedQuestionList.size();
		}
		for (int i = 0; i <= number - 1; i++) {
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

			String temp = objMapper.writeValueAsString(question);
			System.out.println(temp);
			fileWriter.write(temp + System.lineSeparator());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		QuestionContainer.addQuestion(question);
	}
}
