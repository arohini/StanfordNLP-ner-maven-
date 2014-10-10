package com.stanfordnlp.ner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.CRFClassifier;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.process.DocumentPreprocessor;
import edu.stanford.nlp.util.Triple;

public class Date extends Entityextract implements Fileinput

{
	public static String Date() throws IOException {
		List<String> sentenceList = new LinkedList<String>();

		DocumentPreprocessor dp = new DocumentPreprocessor("/home/serendio/Desktop/input/rawinput1.txt");
		for (List sent : dp) {
			sentenceList.addAll(sent);
		}

		String per1 = "";

		for (Triple<String, Integer, Integer> triple : classifier1.classifyToCharacterOffsets(sentenceList.toString())) {
			String op1 = sentenceList.toString().substring(triple.second, triple.third);
			String[] op2 = new String[] { op1 };

			if (triple.first.contains("DATE")) {
				List<String> st = new LinkedList<String>(Arrays.asList(op2));
				for (int i = 0; i < st.size(); i++) {
					per1 = per1 + "," + st.get(i);

				}

			}

		}
		return per1;
	}
}
